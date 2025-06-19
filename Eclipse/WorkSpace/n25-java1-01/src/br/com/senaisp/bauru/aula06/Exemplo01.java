package br.com.senaisp.bauru.aula06;

public class Exemplo01 {

	public static void main(String[] args) {
		//definindo um vetor de flores  com 4 posiçoes 
		String[] flores = new String[4];
		//ultilizandio o  vetor e atribuindo o conteudo
		flores[0] = "Rosa";
		flores[1] = "Cravo";
		flores[2] = "Lírio";
		flores[3] = "Margarida";
		//mostrando os valores com for 
		for(int i=0;i<flores.length;i++) {
			System.out.println(flores[i]);
			
		}
		System.out.println("-".repeat(20));
				//ultilizando o for em conjunto (foreach)
		for(String it: flores) {
			System.out.println(it);
		}
	}

}
