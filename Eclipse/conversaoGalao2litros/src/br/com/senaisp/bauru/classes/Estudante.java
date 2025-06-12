package br.com.senaisp.bauru.classes;

public class Estudante {
	//fields ou campos ou variaveis de instancia 
	private String nome;
	private int ra;
	private double nota;
	private boolean ehfumante;
	//constructor
	public Estudante() {
		setNome("Sem nome");
		ra = 0;
		nota = 0.0;
		ehfumante = false;
		
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
		return ehfumante;
	}
	public void setEhfumante(boolean ehfumante) {
		this.ehfumante = ehfumante;
	}
}
