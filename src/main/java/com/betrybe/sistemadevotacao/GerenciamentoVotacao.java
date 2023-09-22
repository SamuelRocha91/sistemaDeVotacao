package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao  implements  GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();

  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();

  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    int total = 0;
    for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
      if (this.pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.print("Número da pessoa candidata já utilizado!");
        total += 1;
      }
    }
    PessoaCandidata novoCandidato = new PessoaCandidata(nome, numero);
    if (total == 0) {
      this.pessoasCandidatas.add(novoCandidato);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    int total = 0;
    for (int i = 0; i < this.pessoasEleitoras.size(); i += 1) {
      if (this.pessoasEleitoras.get(i).getCpf().equals(cpf)) {
        System.out.print("Pessoa eleitora já cadastrada!");
        total += 1;
      }
    }
    PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
    if (total == 0) {
      this.pessoasEleitoras.add(novoEleitor);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (this.cpfsComputados.contains((cpfPessoaEleitora))) {
      System.out.print("Pessoa eleitora já votou!");
    } else {
      for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
        if (this.pessoasCandidatas.get(i).getNumero() == numeroPessoaCandidata) {
          this.pessoasCandidatas.get(i).receberVoto();
          cpfsComputados.add(cpfPessoaEleitora);
        }
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (this.cpfsComputados.isEmpty()) {
      System.out.print("É preciso ter pelo menos um voto para mostrar o resultado");
    } else {
      int total = this.cpfsComputados.size();
      for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
        double divisao = (double) 100.0f * this.pessoasCandidatas.get(i).getVotos() / total;
        System.out.println("Nome: "
            + this.pessoasCandidatas.get(i).getNome()
            + " - "
            + this.pessoasCandidatas.get(i).getVotos()
            + " votos ( "
            + divisao
            + "% )");
      }
      System.out.print("Total de votos: " + total);
    }
  }
}
