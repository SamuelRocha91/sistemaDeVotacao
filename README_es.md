# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> Sistema de Votación <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91//sistemaDeVotacao/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ar.md)

<p>Este proyecto es una evaluación desarrollada en el módulo de Java del curso de Desarrollo Web de Trybe. Las competencias desarrolladas incluyen:</p>
<ol>
  <li>Comprensión de los conceptos fundamentales de la Programación Orientada a Objetos (POO) aplicados en Java;</li>
  <li>Lógica de programación;</li>
  <li>Aplicación de conceptos como clases, objetos, métodos, encapsulamiento, herencia, polimorfismo, interfaces y clases abstractas.</li>
</ol>
<p>La aplicación consiste en un sistema de votación electrónico que permite registrar candidatos, registrar votantes, realizar la votación y verificar los resultados.</p>

## Funcionalidades

- **Registro de Candidatos**: Permite añadir candidatos al sistema con nombre y número.
- **Registro de Votantes**: Permite registrar votantes con nombre y CPF.
- **Sistema de Votación**: Los votantes pueden votar ingresando su CPF y el número del candidato.
- **Resultados Parciales**: Muestra resultados parciales de la votación en cualquier momento.
- **Finalización de la Votación**: Muestra el resultado final al cerrar la votación.

## Estructura del Código

El método `main` es responsable de la ejecución del programa, presentando un menú interactivo que permite el registro de candidatos y votantes, la votación y la visualización de los resultados. Aquí hay un resumen de la lógica implementada:

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    int option = 0;

    // Registro de Candidatos
    do {
        System.out.println("¿Registrar persona candidata?");
        System.out.println("1 - Sí");
        System.out.println("2 - No");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Ingrese el nombre de la persona candidata:");
            String nome = scanner.next();
            System.out.println("Ingrese el número de la persona candidata:");
            int numero = scanner.nextInt();
            votacao.cadastrarPessoaCandidata(nome, numero);
        }
    } while (option != 2);

    // Registro de Votantes
    do {
        System.out.println("¿Registrar persona votante?");
        System.out.println("1 - Sí");
        System.out.println("2 - No");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Ingrese el nombre de la persona votante:");
            String nome = scanner.next();
            System.out.println("Ingrese el CPF de la persona votante:");
            String cpf = scanner.next();
            votacao.cadastrarPessoaEleitora(nome, cpf);
        }
    } while (option != 2);

    // Votación y Resultados
    do {
        System.out.println("1 - Votar");
        System.out.println("2 - Resultado Parcial");
        System.out.println("3 - Finalizar Votación");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Ingrese el CPF de la persona votante:");
            String cpf = scanner.next();
            System.out.println("Ingrese el número de la persona candidata:");
            int voto = scanner.nextInt();
            votacao.votar(cpf, voto);
        }
        if (option == 2) {
            votacao.mostrarResultado();
        }
    } while (option != 3);

    votacao.mostrarResultado();
}
```

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal utilizado en el desarrollo.
- **Scanner**: Clase de Java utilizada para capturar entradas del usuario.
- **Programación Orientada a Objetos**: Conceptos de POO aplicados en el diseño del sistema.

## Otros Proyectos

- 🏛️ [Localizador de Museos](https://github.com/SamuelRocha91/localizadorDeMuseuslocalizadorDeMuseus/blob/main/README_es.md)
- 📃 [Reglas de Progresión](https://github.com/SamuelRocha91/project_rule_of_progressionlocalizadorDeMuseus/blob/main/README_es.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/AgrixlocalizadorDeMuseus/blob/main/README_es.md)

## Cómo Ejecutar

1. Clona este repositorio en tu máquina local:
   ```sh
   git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
   ```

2. Abre el proyecto en tu IDE de Java favorita.

3. Compila y ejecuta la aplicación.
