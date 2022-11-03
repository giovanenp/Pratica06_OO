package br.com.exercicio1;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    String projeto;
    String descricao; 
    String endereco; 
    String dataInicio; 
    String dataFim;
    int opcao = 0;

    do {
      opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar Projeto Distribuir Alimentos \n<2> Cadastrar Projeto Trabalho Voluntário \n<3> Sair"));
      if (opcao != 3) {
        projeto = JOptionPane.showInputDialog("Informe o nome do projeto");
        descricao = JOptionPane.showInputDialog("Informe a descrição do projeto " + projeto);
        endereco = JOptionPane.showInputDialog("Informe o endereço do projeto " + projeto);
        dataInicio = JOptionPane.showInputDialog("Informe a data de inicio");
        dataFim = JOptionPane.showInputDialog("Informe a data fim");

        switch (opcao) {
          case 1:
            String descAlimento = JOptionPane.showInputDialog("Informe a descrição do alimento");
            int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
            DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento(projeto, descricao, endereco, dataInicio, dataFim, descAlimento, qtde);
            if(distribuicaoAlimento.validaProjeto()) {
              JOptionPane.showMessageDialog(null, "Projeto válido");
            } else {
              JOptionPane.showMessageDialog(null, "Projeto inválido");
            }
            JOptionPane.showMessageDialog(null, distribuicaoAlimento.imprimeProjeto(), "Detalhes do Cadastro",JOptionPane.INFORMATION_MESSAGE);
            break;

          case 2:
            String tipotrabalho = JOptionPane.showInputDialog("Informe o tipo de trabalho");
            int duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Informe duração do trablho " + tipotrabalho));
            TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario(projeto, descricao, endereco, dataInicio, dataFim, tipotrabalho, duracaoTrabalho);
            if(trabalhoVoluntario.validaProjeto()) {
              JOptionPane.showMessageDialog(null, "Projeto válido");
            } else {
              JOptionPane.showMessageDialog(null, "Projeto inválido");
            }
            JOptionPane.showMessageDialog(null, trabalhoVoluntario.imprimeProjeto(), "Detalhes do Cadastro", JOptionPane.INFORMATION_MESSAGE);
            break;
          default:
            break;
        }
      }

    } while (opcao != 3);

  }
}
