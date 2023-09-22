package com.betrybe.sistemadevotacao;

import static com.betrybe.sistemadevotacao.util.ClassChecker.checkClassFields;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaCandidataTest {
  @Test
  @DisplayName("2 - Implemente a classe PessoaCandidata")
  public void testPessoaCandidata()
      throws InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> classToCheck = PessoaCandidata.class;

    // Check if attributes are correct
    Map<String, String> expectedFields = Map.of(
        "numero", Integer.TYPE.getName(),
        "votos", Integer.TYPE.getName()
    );
    checkClassFields(classToCheck, expectedFields);

    // Check inheritance
    assertTrue(
        Pessoa.class.isAssignableFrom(classToCheck),
        "Classe %s deve herdar da classe Pessoa".formatted(classToCheck.getName())
    );

    // Check constructor
    Class<?> [] parameterTypes = new Class[] {String.class, Integer.TYPE};
    Constructor<?> constructor = null;
    try {
      constructor = classToCheck.getConstructor(parameterTypes);
    } catch (NoSuchMethodException e) {
      fail("Não há construtor da classe %s para parâmetros %s".formatted(classToCheck, parameterTypes));
    }

    assertNotNull(constructor);

    // Check methods
    PessoaCandidata pessoaCandidata = (PessoaCandidata) constructor.newInstance("João", 123);

    try {
      Method getNome = PessoaCandidata.class.getMethod("getNome");
      Method setNome = PessoaCandidata.class.getMethod("setNome", String.class);
      assertEquals("João", getNome.invoke(pessoaCandidata));
      setNome.invoke(pessoaCandidata, "Joãozinho");
      assertEquals("Joãozinho", getNome.invoke(pessoaCandidata));

      Method getNumero = PessoaCandidata.class.getDeclaredMethod("getNumero");
      Method setNumero = PessoaCandidata.class.getDeclaredMethod("setNumero", Integer.TYPE);

      assertEquals(123, getNumero.invoke(pessoaCandidata));
      setNumero.invoke(pessoaCandidata, 234);
      assertEquals(234, getNumero.invoke(pessoaCandidata));

      Method getVotos = PessoaCandidata.class.getDeclaredMethod("getVotos");
      Method setVotos = PessoaCandidata.class.getDeclaredMethod("setVotos", Integer.TYPE);
      Method receberVoto = PessoaCandidata.class.getDeclaredMethod("receberVoto");

      assertEquals(0, getVotos.invoke(pessoaCandidata));
      receberVoto.invoke(pessoaCandidata);
      assertEquals(1, getVotos.invoke(pessoaCandidata));
      setVotos.invoke(pessoaCandidata, 789);
      assertEquals(789, getVotos.invoke(pessoaCandidata));
    } catch (NoSuchMethodException e) {
      fail("Os métodos da classe PessoaCandidata devem estar definidos corretamente", e);
    }
  }
}
