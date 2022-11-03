package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Empresa empresa;
    Funcionario[] funcionarios = new Funcionario[1];

    for (int i = 0; i < funcionarios.length; i++) {
      String nome = JOptionPane.showInputDialog(null, "Entre com o nome");
      String email = JOptionPane.showInputDialog(null, "Entre com o email");
      String telefone = JOptionPane.showInputDialog(null, "Entre com o telefone");
      String departamento = JOptionPane.showInputDialog(null, "Entre com o departamento");
      double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o salario"));
      String dataCriacao = JOptionPane.showInputDialog(null, "Entre com o dataCriacao");
      String rg = JOptionPane.showInputDialog(null, "Entre com o rg");

      funcionarios[i] = new Funcionario(nome, email, telefone, departamento, salario, dataCriacao, rg);
    }
    String nomeEmpresa = JOptionPane.showInputDialog(null, "Criando a empresa, digite o nome");
    String cnpj = JOptionPane.showInputDialog(null, "Criando a empresa, digite o CNPJ");
    int qtdeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de funcionarios"));

    empresa = new Empresa(nomeEmpresa, cnpj, qtdeFuncionarios);

    for (Funcionario funcionario : funcionarios) {
      empresa.setFuncionarios(funcionario);
      JOptionPane.showMessageDialog(null, funcionario.mostrarDados());
    }
  }
}
