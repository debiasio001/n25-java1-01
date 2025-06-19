package br.com.senaisp.bauru.aula06;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//criando uma mariz 
		//cinema com 5 fileiras e 9 cadeiras por fileira
		char[][] cinema = new char[5][9];
		//inicializando com _
		for(int i=0;i<cinema.length;i++) {
		//prenchendo as poltronas
			for(int j=0;j<cinema[i].length;j++) {
				cinema[i][j] = '_';
			}
		}
		//iniciando o progama
		String continua;
		do {
			//mostrando os assentos 
			System.out.println("Cinema do Povo");
			System.out.println("  1 2 3 4 5 6 7 8 9");
			for (int i=0;i<cinema.length;i++) {
				System.out.print((i+1));// mostrando a fileira 
				for(int j=0;j<cinema[i].length;j++) {
					System.out.print(" "+cinema[i][j]);
				}//fim for j
				System.out.println();//quebrando a linha
				
			}//fim fo i 
			System.out.println("Digite a fileira desejada: ");
			int fil=sc.nextInt();
			System.out.println("Digite a poltrona desejada: ");
			int pol=sc.nextInt();
			//pegando o enter
			sc.nextLine();
			System.out.println("Deseja continuar (S/N)?");
			continua = sc.nextLine();
			//verificando a posiçao e marcando-a
			if (fil>=1 && fil<=5 && pol>=1 && pol<=9) {
				cinema[fil][pol]='X';
			}
		}while(continua.charAt(0)=='S');
		

	}

}
