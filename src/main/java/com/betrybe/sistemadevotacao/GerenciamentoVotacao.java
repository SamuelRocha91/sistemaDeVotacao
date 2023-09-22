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
        System.out.print("Nome: "
            + this.pessoasCandidatas.get(i).getNome()
            + " - "
            + this.pessoasCandidatas.get(i).getVotos()
            + "( "
            + (this.pessoasCandidatas.get(i).getVotos() / total) * 100
            + "% )");
      }
      System.out.print("Total de votos: " + total);
    }
  }
}
