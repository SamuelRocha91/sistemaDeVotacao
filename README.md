# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Sistema de Votação <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)

<p>Este projeto é uma avaliação desenvolvida no módulo de Java do curso de Desenvolvimento Web da Trybe. As competências desenvolvidas incluem:</p>
<ol>
  <li>Compreensão dos conceitos fundamentais da Programação Orientada a Objetos (POO) aplicados a Java;</li>
  <li>Lógica de programação;</li>
  <li>Aplicação de conceitos como classes, objetos, métodos, encapsulamento, herança, polimorfismo, interfaces e classes abstratas.</li>
</ol>
<p>A aplicação consiste em um sistema de votação eletrônico que permite cadastrar candidatos, cadastrar eleitores, realizar votação e conferir os resultados.</p>

<details>
  <summary><h2>Funcionalidades</h2></summary>
  - **Cadastro de Candidatos**: Permite adicionar candidatos ao sistema com nome e número.
  - **Cadastro de Eleitores**: Permite registrar eleitores com nome e CPF.
  - **Sistema de Votação**: Eleitores podem votar inserindo seu CPF e o número do candidato.
  - **Resultados Parciais**: Mostra resultados parciais da votação a qualquer momento.
  - **Finalização da Votação**: Exibe o resultado final ao encerrar a votação.
</details>

<details>
  <summary><h2>Estrutura do Código</h2></summary>
  O método `main` é responsável pela execução do programa, apresentando um menu interativo que permite o cadastro de candidatos e eleitores, a votação e a visualização dos resultados. Aqui está um resumo da lógica implementada:

  ```java
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      GerenciamentoVotacao votacao = new GerenciamentoVotacao();
      int option = 0;

      // Cadastro de Candidatos
      do {
          System.out.println("Cadastrar pessoa candidata?");
          System.out.println("1 - Sim");
          System.out.println("2 - Não");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Entre com o nome da pessoa candidata:");
              String nome = scanner.next();
              System.out.println("Entre com o número da pessoa candidata:");
              int numero = scanner.nextInt();
              votacao.cadastrarPessoaCandidata(nome, numero);
          }
      } while (option != 2);

      // Cadastro de Eleitores
      do {
          System.out.println("Cadastrar pessoa eleitora?");
          System.out.println("1 - Sim");
          System.out.println("2 - Não");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Entre com o nome da pessoa eleitora:");
              String nome = scanner.next();
              System.out.println("Entre com o CPF da pessoa eleitora:");
              String cpf = scanner.next();
              votacao.cadastrarPessoaEleitora(nome, cpf);
          }
      } while (option != 2);

      // Votação e Resultados
      do {
          System.out.println("1 - Votar");
          System.out.println("2 - Resultado Parcial");
          System.out.println("3 - Finalizar Votação");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Entre com o CPF da pessoa eleitora:");
              String cpf = scanner.next();
              System.out.println("Entre com o número da pessoa candidata:");
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
</details>

<details>
  <summary><h2>Tecnologias Utilizadas</h2></summary>
  - **Java**: Linguagem de programação principal utilizada no desenvolvimento.
  - **Scanner**: Classe do Java utilizada para capturar entradas do usuário.
  - **Programação Orientada a Objetos**: Conceitos de POO aplicados ao design do sistema.
</details>

<details>
  <summary><h2>Outros Projetos</h2></summary>
  - 🏛️ [Localizador de Museus](https://github.com/SamuelRocha91/localizadorDeMuseus)
  - 📃 [Regras de Progressão](https://github.com/SamuelRocha91/project_rule_of_progression)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix)
</details>

<details>
  <summary><h2>Como Executar</h2></summary>
  1. Clone este repositório em sua máquina local:
     ```sh
     git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
     ```

  2. Abra o projeto em sua IDE Java favorita.

  3. Compile e execute a aplicação.
</details>

