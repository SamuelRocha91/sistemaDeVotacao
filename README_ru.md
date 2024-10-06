# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> Система голосования <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)

<p>Этот проект является оценкой, разработанной в модуле Java курса Веб-разработки в Trybe. Развиваемые навыки включают:</p>
<ol>
  <li>Понимание основных концепций Объектно-Ориентированного Программирования (ООП), применяемых в Java;</li>
  <li>Логика программирования;</li>
  <li>Применение таких концепций, как классы, объекты, методы, инкапсуляция, наследование, полиморфизм, интерфейсы и абстрактные классы.</li>
</ol>
<p>Приложение представляет собой электронную систему голосования, которая позволяет регистрировать кандидатов, регистрировать избирателей, проводить голосование и проверять результаты.</p>

<details>
  <summary><h2>Функциональности</h2></summary>
  - **Регистрация кандидатов**: Позволяет добавлять кандидатов в систему с именем и номером.
  - **Регистрация избирателей**: Позволяет регистрировать избирателей с именем и CPF.
  - **Система голосования**: Избиратели могут голосовать, вводя свой CPF и номер кандидата.
  - **Промежуточные результаты**: Показывает промежуточные результаты голосования в любое время.
  - **Завершение голосования**: Отображает окончательный результат по завершении голосования.
</details>

<details>
  <summary><h2>Структура кода</h2></summary>
  Метод `main` отвечает за выполнение программы, представляя интерактивное меню, которое позволяет регистрировать кандидатов и избирателей, голосовать и просматривать результаты. Вот краткое резюме реализованной логики:

  ```java
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      GerenciamentoVotacao votacao = new GerenciamentoVotacao();
      int option = 0;

      // Регистрация кандидатов
      do {
          System.out.println("Зарегистрировать кандидата?");
          System.out.println("1 - Да");
          System.out.println("2 - Нет");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Введите имя кандидата:");
              String nome = scanner.next();
              System.out.println("Введите номер кандидата:");
              int numero = scanner.nextInt();
              votacao.cadastrarPessoaCandidata(nome, numero);
          }
      } while (option != 2);

      // Регистрация избирателей
      do {
          System.out.println("Зарегистрировать избирателя?");
          System.out.println("1 - Да");
          System.out.println("2 - Нет");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Введите имя избирателя:");
              String nome = scanner.next();
              System.out.println("Введите CPF избирателя:");
              String cpf = scanner.next();
              votacao.cadastrarPessoaEleitora(nome, cpf);
          }
      } while (option != 2);

      // Голосование и результаты
      do {
          System.out.println("1 - Голосовать");
          System.out.println("2 - Промежуточный результат");
          System.out.println("3 - Завершить голосование");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("Введите CPF избирателя:");
              String cpf = scanner.next();
              System.out.println("Введите номер кандидата:");
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
  <summary><h2>Используемые технологии</h2></summary>
  - **Java**: Основной язык программирования, используемый в разработке.
  - **Scanner**: Класс Java, используемый для захвата ввода пользователя.
  - **Объектно-Ориентированное Программирование**: Концепции ООП, применяемые в проектировании системы.
</details>

<details>
  <summary><h2>Другие проекты</h2></summary>
  - 🏛️ [Локатор музеев](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ru.md)
  - 📃 [Правила прогрессии](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ru.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ru.md)
</details>

<details>
  <summary><h2>Как запустить</h2></summary>
  1. Клонируйте этот репозиторий на свой локальный компьютер:
     ```sh
     git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
     ```

  2. Откройте проект в вашей любимой Java IDE.

  3. Скомпилируйте и выполните приложение.
</details>
