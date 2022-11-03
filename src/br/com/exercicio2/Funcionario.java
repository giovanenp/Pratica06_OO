package br.com.exercicio2;

public class Funcionario extends Pessoa {
  private String departamento;
  private double salario;
  private String dataCriacao;
  private String rg;
  private boolean status;

  public Funcionario(String nome, String email, String telefone, String departamento, double salario,
      String dataCriacao, String rg) {
    super(nome, email, telefone);
    this.departamento = departamento;
    this.salario = salario;
    this.dataCriacao = dataCriacao;
    this.rg = rg;
    this.status = true;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void bonificar(double bonus) {
    this.salario += bonus;
  }

  public void demitir() {
    this.status = false;
  }

  public String convertStatus() {
    return this.status ? "Ativo" : "Inativo";
  }

  public String mostrarDados() {
    return "Funcionario \nNome=" + getNome() + "\nEmail: email" + getEmail() + "\ntelefone" + getTelefone()
        + "\nDepartamento=" + this.departamento + "\nSalario=" + this.salario + "\nData de Criacao=" + this.dataCriacao
        + "\nRG=" + this.rg + "\nStatus=" + convertStatus();
  }

}
