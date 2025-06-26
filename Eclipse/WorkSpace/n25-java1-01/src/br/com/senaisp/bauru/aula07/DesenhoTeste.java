package br.com.senaisp.bauru.aula07;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DesenhoTeste {

	public static void main(String[] args) {
		JOptionPane pnl = new JOptionPane();
		JDialog dlg = pnl.createDialog("Desenhos em java");
		dlg.setSize(800, 600);
		//mostrar quantidade de instancias 
		System.out.println("Qtde: "+Desenho.getQtdeInstancias());
		//criando o Desenho
		Retangulo ret = new Retangulo(50, 50, 300, 200, Color.BLUE);
		Quadrado quad = new Quadrado(50, 50, 400, Color.RED);
		Triangulo tri = new Triangulo(50, 50, 300, 200, Color.GREEN);
		//mostrar quantidade de instancias
		System.out.println("Qtde: "+Desenho.getQtdeInstancias());
		//aplicando o desenho na janela
		dlg.setContentPane(tri);
		//mostrando a ajanela
		dlg.setVisible(true);
		

	}

}
