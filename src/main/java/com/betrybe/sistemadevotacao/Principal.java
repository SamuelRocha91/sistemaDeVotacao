package com.betrybe.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();
    int option = 0;
    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = scanner.nextInt();
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = scanner.nextInt();
        votacao.cadastrarPessoaCandidata(nome, numero);
      }
    } while (option != 2);
    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      option = scanner.nextInt();
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.next();
        votacao.cadastrarPessoaEleitora(nome, cpf);
      }
    } while (option != 2);
    do {
      System.out.println(" Entre com o número correspondente à opção desejada:");
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

}
