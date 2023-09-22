package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao  implements  GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas;

  private ArrayList<PessoaEleitora> pessoasEleitoras;

  private ArrayList<String> cpfsComputados;

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata novoCandidato = new PessoaCandidata(nome, numero);
    if (this.pessoasCandidatas.contains(novoCandidato)) {
      System.out.print("Número da pessoa candidata já utilizado!");
    } else {
      this.pessoasCandidatas.add(novoCandidato);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
    if (this.pessoasEleitoras.contains(novoEleitor)) {
      System.out.print("Pessoa eleitora já cadastrada!");
    } else {
      this.pessoasEleitoras.add(novoEleitor);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
