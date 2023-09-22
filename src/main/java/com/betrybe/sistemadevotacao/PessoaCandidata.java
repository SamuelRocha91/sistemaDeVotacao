package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {
  int numero;
  int votos;

  /**
   * Cria a classe pessoa candidata e seus atributos e métodos.
   * @param numero inteiro.
   * @param nome  string.
   */
  public PessoaCandidata(String nome, int numero) {
    this.setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }


  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  @Override
  public String getNome() {
    return nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }
}
