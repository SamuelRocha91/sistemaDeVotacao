package com.betrybe.sistemadevotacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrincipalTest {

  @Test
  @DisplayName("7 - Implementar a classe Principal")
  public void testePrincipal() {
    String[] inputLines = new String[] {
        "1", "Maria", "12345",
        "1", "João", "54321",
        "2",
        "1", "José", "111.222.333.444-55",
        "1", "Ana", "222.333.444.555-66",
        "2",
        "1", "222.333.444.555-66", "12345",
        "2",
        "1", "111.222.333.444-55", "54321",
        "3"
    };

    String userInput = String.join(System.lineSeparator(), inputLines);

    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
    System.setIn(bais);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    Principal.main(null);

    String output = baos.toString();
    assertTrue(output.contains("Nome: Maria - 1 votos ( 100"));
    assertTrue(output.contains("Nome: João - 0 votos ( 0"));
    assertTrue(output.contains("Total de votos: 1"));

    assertTrue(output.contains("Nome: Maria - 1 votos ( 50"));
    assertTrue(output.contains("Nome: João - 1 votos ( 50"));
    assertTrue(output.contains("Total de votos: 2"));
  }
}
