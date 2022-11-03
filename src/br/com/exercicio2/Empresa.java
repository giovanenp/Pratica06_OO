package br.com.exercicio2;

public class Empresa {
  private String nome;
  private String cnpj;
  private String qtdeDeFuncionario;

  Funcionario[] funcionarios;

  public Empresa(Funcionario[] funcionarios) {
    this.funcionarios = funcionarios;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getQtdeDeFuncionario() {
    return qtdeDeFuncionario;
  }

  public void setQtdeDeFuncionario(String qtdeDeFuncionario) {
    this.qtdeDeFuncionario = qtdeDeFuncionario;
  }

}
