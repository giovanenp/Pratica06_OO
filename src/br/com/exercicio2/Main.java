package br.com.exercicio2;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    Empresa empresa = new Empresa("Empresa A", "00000000/0001-00", 10, null);
    Funcionario[] funcionarios = new Funcionario[2];

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
  
    for (int i = 0; i < funcionarios.length; i++) {
      JOptionPane.showMessageDialog(null, funcionarios[i].mostrarDados());
    }
    empresa.setFuncionarios(funcionarios);
    JOptionPane.showMessageDialog(null,empresa.dadosDaEmpresa());
  }
}
