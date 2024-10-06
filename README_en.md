# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Voting System <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)

<p>This project is an assessment developed in the Java module of the Trybe Web Development course. The skills developed include:</p>
<ol>
  <li>Understanding the fundamental concepts of Object-Oriented Programming (OOP) applied to Java;</li>
  <li>Programming logic;</li>
  <li>Application of concepts such as classes, objects, methods, encapsulation, inheritance, polymorphism, interfaces, and abstract classes.</li>
</ol>
<p>The application consists of an electronic voting system that allows the registration of candidates, registration of voters, conducting voting, and checking results.</p>

<details>
  <summary><h2>Features</h2></summary>
  - **Candidate Registration**: Allows adding candidates to the system with name and number.
  - **Voter Registration**: Allows registering voters with name and CPF.
  - **Voting System**: Voters can vote by entering their CPF and the candidate's number.
  - **Partial Results**: Shows partial voting results at any time.
  - **Voting Finalization**: Displays the final result when voting is finished.
</details>

<details>
  <summary><h2>Code Structure</h2></summary>
  The `main` method is responsible for executing the program, presenting an interactive menu that allows the registration of candidates and voters, voting, and viewing results. Here is a summary of the implemented logic:

  ```java
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      GerenciamentoVotacao votacao = new GerenciamentoVotacao();
      int option = 0;

      // Candidate Registration
      do {
          System.out.println("Register a candidate?");
          System.out.println("1 - Yes");
          System.out.println("2 - No");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Enter the name of the candidate:");
              String nome = scanner.next();
              System.out.println("Enter the number of the candidate:");
              int numero = scanner.nextInt();
              votacao.cadastrarPessoaCandidata(nome, numero);
          }
      } while (option != 2);

      // Voter Registration
      do {
          System.out.println("Register a voter?");
          System.out.println("1 - Yes");
          System.out.println("2 - No");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Enter the name of the voter:");
              String nome = scanner.next();
              System.out.println("Enter the CPF of the voter:");
              String cpf = scanner.next();
              votacao.cadastrarPessoaEleitora(nome, cpf);
          }
      } while (option != 2);

      // Voting and Results
      do {
          System.out.println("1 - Vote");
          System.out.println("2 - Partial Result");
          System.out.println("3 - Finalize Voting");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Enter the CPF of the voter:");
              String cpf = scanner.next();
              System.out.println("Enter the number of the candidate:");
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
  <summary><h2>Technologies Used</h2></summary>
  - **Java**: The main programming language used in development.
  - **Scanner**: Java class used to capture user input.
  - **Object-Oriented Programming**: OOP concepts applied to the system design.
</details>

<details>
  <summary><h2>Other Projects</h2></summary>
  - 🏛️ [Museum Locator](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md)
  - 📃 [Progression Rules](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_en.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_en.md)
</details>

<details>
  <summary><h2>How to Run</h2></summary>
  1. Clone this repository to your local machine:
     ```sh
     git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
     ```

  2. Open the project in your favorite Java IDE.

  3. Compile and run the application.
</details>
