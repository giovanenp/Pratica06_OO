package br.com.exercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RevistaA {

  public static void main(String[] args) {

    String tituloRevista = JOptionPane.showInputDialog(null, "Informe o titulo da revista");
    long issn = Long.parseLong(JOptionPane.showInputDialog(null, "ISSN"));
    String periodicidade = JOptionPane.showInputDialog(null, "Periodicidade");

    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da Edição"));
    int volume = Integer.parseInt(JOptionPane.showInputDialog(null, "Volume"));
    int tiragem = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiragem"));
    String dataEdicao = JOptionPane.showInputDialog(null, "Data da Edição");

    Edicao edicao = new Edicao(numero, volume, dataEdicao, tiragem);
    RevistaCientifica revista1 = new RevistaCientifica(tituloRevista, issn, periodicidade, edicao);
    // JOptionPane.showMessageDialog(null, revista1.mostrarRevista());

    ArrayList<Artigo> artigos = new ArrayList<Artigo>();

    for (int i = 0; i < 2; i++) {
      String tituloArtigo = JOptionPane.showInputDialog(null, "Titulo do Artigo");
      String resumo = JOptionPane.showInputDialog(null, "Resumo");
      String autores = JOptionPane.showInputDialog(null, "autores");

      artigos.add(new Artigo(tituloArtigo, resumo, autores));
      edicao.adicionaArtigo(artigos.get(i));
    }
    JOptionPane.showMessageDialog(null, revista1.mostrarRevista());
  }
}
