package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite S ou N: ");
		String res = sc.nextLine();
		// usando operador ternario
		// testelogico ? valo_se_verdade : valor_se_falso
		System.out.println("Você digitou " + 
			( res.charAt(0) =='S' ? "Sim" : "Não" ));
	sc.close();
	}
}
