package com.betrybe.sistemadevotacao;

import static com.betrybe.sistemadevotacao.util.ClassChecker.checkClassFields;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GerenciamentoVotacaoTest {

  @Test
  @DisplayName("4 - Implementar a classe GerenciamentoVotacao com atributos")
  public void testGerenciamentoVotacaoAndFields() {
    Class<?> classToCheck = GerenciamentoVotacao.class;

    // Check if attributes are correct
    Map<String, String> expectedFields = Map.of(
        "pessoasCandidatas", ArrayList.class.getName(),
        "pessoasEleitoras", ArrayList.class.getName(),
        "cpfsComputados", ArrayList.class.getName()
    );
    checkClassFields(classToCheck, expectedFields);

    // Check inheritance
    assertTrue(
        GerenciamentoVotacaoInterface.class.isAssignableFrom(classToCheck),
        "Classe %s deve implementar a interface GerenciamentoVotacaoInterface".formatted(
            classToCheck.getName())
    );
  }

  @Test
  @DisplayName("5 - Implementar os métodos de cadastro da classe GerenciamentoVotacao")
  public void testGerenciamentoVotacaoRegisterMethods()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    checkRegisterMethodsOk();
    checkRegisterMethodsError();
  }

  private void checkRegisterMethodsError()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Constructor<?> constructor = GerenciamentoVotacao.class.getConstructor();
    GerenciamentoVotacaoInterface gerenciamentoVotacao
        = (GerenciamentoVotacaoInterface) constructor.newInstance();

    ByteArrayOutputStream baos;

    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    gerenciamentoVotacao.cadastrarPessoaCandidata("Maria", 12345);
    gerenciamentoVotacao.cadastrarPessoaCandidata("João", 12345);

    assertEquals("Número da pessoa candidata já utilizado!", baos.toString().strip());

    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    gerenciamentoVotacao.cadastrarPessoaEleitora("Maria", "111.222.333.444-55");
    gerenciamentoVotacao.cadastrarPessoaEleitora("João", "111.222.333.444-55");

    assertEquals("Pessoa eleitora já cadastrada!", baos.toString().strip());
  }

  private void checkRegisterMethodsOk()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    Constructor<?> constructor = GerenciamentoVotacao.class.getConstructor();
    GerenciamentoVotacaoInterface gerenciamentoVotacao = (GerenciamentoVotacaoInterface) constructor.newInstance();

    Field pessoasCandidatasField
        = GerenciamentoVotacao.class.getDeclaredField("pessoasCandidatas");
    pessoasCandidatasField.setAccessible(true);

    ArrayList<PessoaCandidata> pessoasCandidatas
        = (ArrayList<PessoaCandidata>) pessoasCandidatasField.get(gerenciamentoVotacao);

    assertEquals(0, pessoasCandidatas.size());
    gerenciamentoVotacao.cadastrarPessoaCandidata("Maria", 445566);
    assertEquals(1, pessoasCandidatas.size());

    Method getNome = Pessoa.class.getDeclaredMethod("getNome");
    assertEquals("Maria", getNome.invoke(pessoasCandidatas.get(0)));

    Field pessoasEleitorasField
        = GerenciamentoVotacao.class.getDeclaredField("pessoasEleitoras");
    pessoasEleitorasField.setAccessible(true);

    ArrayList<PessoaEleitora> pessoasEleitoras
        = (ArrayList<PessoaEleitora>) pessoasEleitorasField.get(gerenciamentoVotacao);

    assertEquals(0, pessoasEleitoras.size());
    gerenciamentoVotacao.cadastrarPessoaEleitora("João", "123.456.789-00");
    assertEquals(1, pessoasEleitoras.size());

    assertEquals("João", getNome.invoke(pessoasEleitoras.get(0)));
  }


  @Test
  @DisplayName("6 - Implementar os métodos de votação da classe GerenciamentoVotacao")
  public void testGerenciamentoVotacaoVotingMethods()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    checkVotingMethodsOk();
    checkVotingMethodsError();
  }

  private void checkVotingMethodsError()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Constructor<?> constructor = GerenciamentoVotacao.class.getConstructor();
    GerenciamentoVotacaoInterface gerenciamentoVotacao
        = (GerenciamentoVotacaoInterface) constructor.newInstance();

    ByteArrayOutputStream baos;

    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));

    gerenciamentoVotacao.cadastrarPessoaCandidata("Maria", 12345);
    gerenciamentoVotacao.cadastrarPessoaEleitora("João", "111.222.333.444-55");

    gerenciamentoVotacao.votar("111.222.333.444-55", 12345);
    gerenciamentoVotacao.votar("111.222.333.444-55", 12345);

    assertEquals("Pessoa eleitora já votou!", baos.toString().strip());
  }

  private void checkVotingMethodsOk()
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    Constructor<?> constructor = GerenciamentoVotacao.class.getConstructor();
    GerenciamentoVotacaoInterface gerenciamentoVotacao = (GerenciamentoVotacaoInterface) constructor.newInstance();

    gerenciamentoVotacao.cadastrarPessoaCandidata("Maria", 12345);
    gerenciamentoVotacao.cadastrarPessoaCandidata("José", 54321);
    gerenciamentoVotacao.cadastrarPessoaEleitora("João", "111.222.333.444-55");

    Field cpfsComputadosField
        = GerenciamentoVotacao.class.getDeclaredField("cpfsComputados");
    cpfsComputadosField.setAccessible(true);

    ArrayList<String> cpfsComputados
        = (ArrayList<String>) cpfsComputadosField.get(gerenciamentoVotacao);

        assertEquals(0, cpfsComputados.size());
    gerenciamentoVotacao.votar("111.222.333.444-55", 12345);
    assertEquals(1, cpfsComputados.size());
    assertEquals("111.222.333.444-55", cpfsComputados.get(0));


    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    gerenciamentoVotacao.mostrarResultado();

    String output = baos.toString();
    assertTrue(output.contains("Nome: Maria - 1 votos ( 100"));
    assertTrue(output.contains("Nome: José - 0 votos ( 0"));
    assertTrue(output.contains("Total de votos: 1"));
  }
}
