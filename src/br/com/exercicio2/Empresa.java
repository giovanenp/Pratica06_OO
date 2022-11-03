package br.com.exercicio2;

public class Empresa {
  private String nome;
  private String cnpj;
  private int qtdeDeFuncionario;
  private static int count = 0;

  Funcionario[] funcionarios;

  public Empresa(String nome, String cnpj, int qtdeDeFuncionario) {
    this.nome = nome;
    this.cnpj = cnpj;

    if (qtdeDeFuncionario <= 100) {
      this.qtdeDeFuncionario = qtdeDeFuncionario;
      funcionarios = new Funcionario[qtdeDeFuncionario];
    } else {
      this.qtdeDeFuncionario = 100;
      funcionarios = new Funcionario[100];
    }
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

  public String dadosDaEmpresa() {
    return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", qtdeDeFuncionario=" + qtdeDeFuncionario;
  }

  public Funcionario[] getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(Funcionario funcionario) {
    this.funcionarios[count] = funcionario;
    count++;
  }
}
