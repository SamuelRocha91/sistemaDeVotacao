package com.betrybe.sistemadevotacao.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassChecker {
  public static void checkClassFields(Class<?> classToCheck, Map<String, String> expectedFields) {
    assertEquals(
        expectedFields,
        Arrays.stream(classToCheck.getDeclaredFields())
            .collect(Collectors.toMap(Field::getName, (f) -> f.getType().getName())),
        "Os atributos da classe %s devem ser definidos corretamente".formatted(classToCheck.getName())
    );
  }
}
