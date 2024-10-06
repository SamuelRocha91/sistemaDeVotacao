# <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" /> 投票系统 <img src="https://cdn-icons-png.flaticon.com/128/226/226777.png" alt="Java Projects Logo" width="42" height="30" />

## 🌐 
[![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README.md) 
[![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_es.md) 
[![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_en.md) 
[![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ru.md) 
[![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ch.md) 
[![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91/sistemaDeVotacao/blob/main/README_ar.md)

<p>该项目是 Trybe Web 开发课程中 Java 模块的评估项目。开发的技能包括：</p>
<ol>
  <li>理解 Java 中应用的面向对象编程 (OOP) 的基本概念；</li>
  <li>编程逻辑；</li>
  <li>应用类、对象、方法、封装、继承、多态、接口和抽象类等概念。</li>
</ol>
<p>该应用程序是一个电子投票系统，允许注册候选人、注册选民、进行投票和检查结果。</p>

<details>
  <summary><h2>功能</h2></summary>
  - **候选人注册**：允许将候选人添加到系统中，包括姓名和号码。
  - **选民注册**：允许注册选民，包括姓名和 CPF（巴西个人身份证号）。
  - **投票系统**：选民可以通过输入其 CPF 和候选人号码来投票。
  - **中间结果**：在任何时间显示投票的中间结果。
  - **投票结束**：在投票结束时显示最终结果。
</details>

<details>
  <summary><h2>代码结构</h2></summary>
  `main` 方法负责执行程序，提供交互式菜单，允许注册候选人和选民、投票以及查看结果。以下是实现逻辑的简要摘要：

  ```java
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      GerenciamentoVotacao votacao = new GerenciamentoVotacao();
      int option = 0;

      // 注册候选人
      do {
          System.out.println("注册候选人?");
          System.out.println("1 - 是");
          System.out.println("2 - 否");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("输入候选人姓名:");
              String nome = scanner.next();
              System.out.println("输入候选人号码:");
              int numero = scanner.nextInt();
              votacao.cadastrarPessoaCandidata(nome, numero);
          }
      } while (option != 2);

      // 注册选民
      do {
          System.out.println("注册选民?");
          System.out.println("1 - 是");
          System.out.println("2 - 否");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("输入选民姓名:");
              String nome = scanner.next();
              System.out.println("输入选民 CPF:");
              String cpf = scanner.next();
              votacao.cadastrarPessoaEleitora(nome, cpf);
          }
      } while (option != 2);

      // 投票和结果
      do {
          System.out.println("1 - 投票");
          System.out.println("2 - 中间结果");
          System.out.println("3 - 结束投票");
          option = scanner.nextInt();
          if (option == 1) {
              System.out.println("输入选民 CPF:");
              String cpf = scanner.next();
              System.out.println("输入候选人号码:");
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
  <summary><h2>使用的技术</h2></summary>
  - **Java**：开发中使用的主要编程语言。
  - **Scanner**：用于捕获用户输入的 Java 类。
  - **面向对象编程**：在系统设计中应用的 OOP 概念。
</details>

<details>
  <summary><h2>其他项目</h2></summary>
  - 🏛️ [博物馆定位器](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ch.md)
  - 📃 [进度规则](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md)
  - 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ch.md)
</details>

<details>
  <summary><h2>如何运行</h2></summary>
  1. 将此仓库克隆到您的本地计算机：
     ```sh
     git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
     ```

  2. 在您喜欢的 Java IDE 中打开项目。

  3. 编译并运行应用程序。
</details>
