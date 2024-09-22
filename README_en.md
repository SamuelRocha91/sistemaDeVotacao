# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> Voting System <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91//sistemaDeVotacao/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ar.md)

<p>This project is an evaluation developed in the Java module of the Web Development course at Trybe. The competencies developed include:</p>
<ol>
  <li>Understanding the fundamental concepts of Object-Oriented Programming (OOP) applied in Java;</li>
  <li>Programming logic;</li>
  <li>Applying concepts such as classes, objects, methods, encapsulation, inheritance, polymorphism, interfaces, and abstract classes.</li>
</ol>
<p>The application consists of an electronic voting system that allows registering candidates, registering voters, conducting voting, and checking results.</p>

## Features

- **Candidate Registration**: Allows adding candidates to the system with name and number.
- **Voter Registration**: Allows registering voters with name and CPF.
- **Voting System**: Voters can cast their votes by entering their CPF and the candidate's number.
- **Partial Results**: Displays partial results of the voting at any time.
- **Voting Completion**: Shows the final result when the voting ends.

## Code Structure

The `main` method is responsible for executing the program, presenting an interactive menu that allows for the registration of candidates and voters, voting, and viewing results. Here’s a summary of the implemented logic:

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    int option = 0;

    // Candidate Registration
    do {
        System.out.println("Register candidate?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Enter the candidate's name:");
            String nome = scanner.next();
            System.out.println("Enter the candidate's number:");
            int numero = scanner.nextInt();
            votacao.cadastrarPessoaCandidata(nome, numero);
        }
    } while (option != 2);

    // Voter Registration
    do {
        System.out.println("Register voter?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Enter the voter's name:");
            String nome = scanner.next();
            System.out.println("Enter the voter's CPF:");
            String cpf = scanner.next();
            votacao.cadastrarPessoaEleitora(nome, cpf);
        }
    } while (option != 2);

    // Voting and Results
    do {
        System.out.println("1 - Vote");
        System.out.println("2 - Partial Result");
        System.out.println("3 - Finish Voting");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Enter the voter's CPF:");
            String cpf = scanner.next();
            System.out.println("Enter the candidate's number:");
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

## Technologies Used

- **Java**: The main programming language used for development.
- **Scanner**: A Java class used to capture user input.
- **Object-Oriented Programming**: OOP concepts applied in the system's design.

## Other Projects

- 🏛️ [Museum Locator](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_en.md)
- 📃 [Progression Rules](https://github.com/SamuelRocha91/project_rule_of_progressionblob/main/README_en.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_en.md)

## How to Run

1. Clone this repository to your local machine:
   ```sh
   git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
   ```

2. Open the project in your favorite Java IDE.

3. Compile and run the application.
