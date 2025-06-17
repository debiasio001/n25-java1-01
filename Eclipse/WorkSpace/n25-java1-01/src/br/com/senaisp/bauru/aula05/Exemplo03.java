package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento: ");
		String dtNasc = sc.nextLine();
		// Criando um Scanner de apoio
		Scanner sc2 = new Scanner(dtNasc);//passando o texto 
		sc2.useDelimiter("/"); //Mudando o delimitador para /
		int dia = sc2.nextInt();
		int mes = sc2.nextInt();
		int ano = sc2.nextInt();
		System.out.println("Você tem " + (2025 - ano) + " anos ");
		sc.close();
		sc2.close();
		//verificando se o mes é valido 
		boolean ehValido = true;
		if (mes<1 || mes>12) {
			ehValido = false;
		}
		// Tratando o dia 
		if (dia<1 || dia>31) {
			ehValido = false;
		} else if (dia>30 && (mes==2 || mes==4 || mes==6 || mes==11)) {
			ehValido = false;
		} else if (dia > 28 && mes==2 && ano % 4 !=0 ) {
			ehValido = false;
		}
		//Mostrando a mensagem 
		if (ehValido) {
			System.out.println("Data Válida!");
		} else {
			System.out.println("data Inválida!");
		}
	}

}
