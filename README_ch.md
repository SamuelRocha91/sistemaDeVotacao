# <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" /> 投票系统 <img src="https://blog.geekhunter.com.br/wp-content/uploads/2020/07/pngwing.com_.png" alt="Java Projects Logo" width="52" height="40" />

## 🌐 [![Português](https://img.shields.io/badge/Português-green)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README.md) [![Español](https://img.shields.io/badge/Español-yellow)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_es.md) [![English](https://img.shields.io/badge/English-blue)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_en.md) [![Русский](https://img.shields.io/badge/Русский-lightgrey)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ru.md) [![中文](https://img.shields.io/badge/中文-red)](https://github.com/SamuelRocha91//sistemaDeVotacao/Agrix/blob/main/README_ch.md) [![العربية](https://img.shields.io/badge/العربية-orange)](https://github.com/SamuelRocha91//sistemaDeVotacao/blob/main/README_ar.md)

<p>该项目是Trybe网络开发课程Java模块中的一个评估项目。开发的技能包括：</p>
<ol>
  <li>理解应用于Java的面向对象编程（OOP）的基本概念；</li>
  <li>编程逻辑；</li>
  <li>应用类、对象、方法、封装、继承、多态、接口和抽象类等概念。</li>
</ol>
<p>该应用程序是一个电子投票系统，允许注册候选人、注册选民、进行投票和查看结果。</p>

## 功能

- **候选人注册**：允许通过姓名和编号将候选人添加到系统。
- **选民注册**：允许通过姓名和CPF注册选民。
- **投票系统**：选民可以输入其CPF和候选人编号进行投票。
- **中间结果**：随时显示投票的中间结果。
- **结束投票**：结束投票时显示最终结果。

## 代码结构

`main`方法负责程序的执行，展示一个交互式菜单，允许注册候选人和选民、进行投票以及查看结果。以下是实现逻辑的摘要：

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    int option = 0;

    // 注册候选人
    do {
        System.out.println("注册候选人吗？");
        System.out.println("1 - 是");
        System.out.println("2 - 否");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("请输入候选人姓名：");
            String nome = scanner.next();
            System.out.println("请输入候选人编号：");
            int numero = scanner.nextInt();
            votacao.cadastrarPessoaCandidata(nome, numero);
        }
    } while (option != 2);

    // 注册选民
    do {
        System.out.println("注册选民吗？");
        System.out.println("1 - 是");
        System.out.println("2 - 否");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.println("请输入选民姓名：");
            String nome = scanner.next();
            System.out.println("请输入选民CPF：");
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
            System.out.println("请输入选民CPF：");
            String cpf = scanner.next();
            System.out.println("请输入候选人编号：");
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

## 使用的技术

- **Java**：开发中使用的主要编程语言。
- **Scanner**：用于捕获用户输入的Java类。
- **面向对象编程**：在系统设计中应用的OOP概念。

## 其他项目

- 🏛️ [博物馆定位器](https://github.com/SamuelRocha91/localizadorDeMuseus/blob/main/README_ch.md)
- 📃 [进阶规则](https://github.com/SamuelRocha91/project_rule_of_progression/blob/main/README_ch.md)
- 🌱 [Agrix](https://github.com/SamuelRocha91/Agrix/blob/main/README_ch.md)

## 如何运行

1. 将该仓库克隆到本地计算机：
   ```sh
   git clone https://github.com/SamuelRocha91/sistemaDeVotacao.git
   ```

2. 在您喜欢的Java IDE中打开项目。

3. 编译并运行应用程序。
