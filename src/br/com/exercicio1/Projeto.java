package br.com.exercicio1;

public abstract class Projeto {
  private String nome;
  private String descricao;
  private String endereco;
  private String dataInicio;
  private String dataFim;

  public Projeto(String nome, String descricao, String endereco, String dataInicio, String dataFim) {
    this.nome = nome;
    this.descricao = descricao;
    this.endereco = endereco;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(String dataInicio) {
    this.dataInicio = dataInicio;
  }

  public String getDataFim() {
    return dataFim;
  }

  public void setDataFim(String dataFim) {
    this.dataFim = dataFim;
  }

  public abstract boolean validaProjeto();

  public abstract String imprimeProjeto();
}
