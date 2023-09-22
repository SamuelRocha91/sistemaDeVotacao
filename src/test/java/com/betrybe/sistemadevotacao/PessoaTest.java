package com.betrybe.sistemadevotacao;

import static com.betrybe.sistemadevotacao.util.ClassChecker.checkClassFields;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Modifier;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaTest {
  @Test
  @DisplayName("1 - Implemente a classe abstrata Pessoa")
  public void testPessoaClass() {
    Class<?> classToCheck = Pessoa.class;

    // Check if attributes are correct
    Map<String, String> expectedFields = Map.of(
        "nome", String.class.getName()
    );
    checkClassFields(classToCheck, expectedFields);

    // Check if class is abstract
    assertTrue(
        Modifier.isAbstract(classToCheck.getModifiers()),
        "Classe Pessoa deve ser abstrata"
    );

    // Define concrete class just to test the methods of the abstract one
    class PessoaConcreta extends Pessoa {};

    Pessoa pessoa = new PessoaConcreta();
    pessoa.setNome("Mafalda");
    assertEquals("Mafalda", pessoa.getNome());
  }
}
