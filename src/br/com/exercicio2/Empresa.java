package br.com.exercicio2;

public class Empresa {
  private String nome;
  private String cnpj;
  private int qtdeDeFuncionario;

  Funcionario[] funcionarios;

  public Empresa(String nome, String cnpj, int qtdeDeFuncionario, Funcionario[] funcionarios) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.qtdeDeFuncionario = qtdeDeFuncionario;
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

  public int getQtdeDeFuncionario() {
    return qtdeDeFuncionario;
  }

  public void setQtdeDeFuncionario(int qtdeDeFuncionario) {
    this.qtdeDeFuncionario = qtdeDeFuncionario;
  }

  public String dadosDaEmpresa(){
    return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", qtdeDeFuncionario=" + qtdeDeFuncionario;
  }

  public Funcionario[] getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(Funcionario[] funcionarios) {
    this.funcionarios = funcionarios;
  }

}
