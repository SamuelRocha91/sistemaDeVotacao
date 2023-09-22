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

public class PessoaEleitoraTest {
  @Test
  @DisplayName("3 - Implemente a classe PessoaEleitora")
  public void testPessoaEleitora()
      throws InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> classToCheck = PessoaEleitora.class;

    // Check if attributes are correct
    Map<String, String> expectedFields = Map.of(
        "cpf", String.class.getName()
    );
    checkClassFields(classToCheck, expectedFields);

    // Check inheritance
    assertTrue(
        Pessoa.class.isAssignableFrom(classToCheck),
        "Classe %s deve herdar da classe Pessoa".formatted(classToCheck.getName())
    );

    // Check constructor
    Class<?> [] parameterTypes = new Class[] {String.class, String.class};
    Constructor<?> constructor = null;
    try {
      constructor = classToCheck.getConstructor(parameterTypes);
    } catch (NoSuchMethodException e) {
      fail("Não há construtor da classe %s para parâmetros %s".formatted(classToCheck, parameterTypes));
    }

    assertNotNull(constructor);

    // Check methods
    PessoaEleitora pessoaEleitora = (PessoaEleitora) constructor.newInstance("João", "123.456.789-00");

    try {
      Method getNome = PessoaEleitora.class.getMethod("getNome");
      Method setNome = PessoaEleitora.class.getMethod("setNome", String.class);
      assertEquals("João", getNome.invoke(pessoaEleitora));
      setNome.invoke(pessoaEleitora, "Joãozinho");
      assertEquals("Joãozinho", getNome.invoke(pessoaEleitora));

      Method getCpf = PessoaEleitora.class.getDeclaredMethod("getCpf");
      Method setCpf = PessoaEleitora.class.getDeclaredMethod("setCpf", String.class);

      assertEquals("123.456.789-00", getCpf.invoke(pessoaEleitora));
      setCpf.invoke(pessoaEleitora, "111.222.333-44");
      assertEquals("111.222.333-44", getCpf.invoke(pessoaEleitora));
    } catch (NoSuchMethodException e) {
      fail("Os métodos da classe PessoaEleitora devem estar definidos corretamente", e);
    }
  }
}
