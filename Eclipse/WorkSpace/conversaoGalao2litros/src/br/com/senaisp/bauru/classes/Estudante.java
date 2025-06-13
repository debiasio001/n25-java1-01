package br.com.senaisp.bauru.classes;

public class Estudante {
	//fields ou campos ou variaveis de instancia 
	private String nome;
	private int ra;
	private double nota;
	private boolean ehFumante;
	//constructor
	public Estudante() {
		setNome("Sem nome");
		ra = 0;
		nota = 0.0;
		ehFumante = false;
		
	}
	public Estudante(int ra, String nome) {
		setRa(ra);
		setNome(nome);
		nota = 0;
		ehFumante = false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean isEhfumante() {
		return ehFumante;
	}
	public void setEhfumante(boolean ehfumante) {
		this.ehFumante = ehfumante;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome:" + getNome() + "\n" +
		"Ra" + getRa() + "\n" +
		"Nota" + getNota() + "\n" +
		"Fumante" + isEhfumante();
		}
}
