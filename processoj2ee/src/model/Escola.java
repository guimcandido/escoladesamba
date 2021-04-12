package model;

public class Escola {

	private int id_escola;
	private String nome;
	private float notaTotal;
	
	public int getId() {
		return id_escola;
	}
	public void setId(int id_escola) {
		this.id_escola = id_escola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNotaTotal() {
		return notaTotal;
	}
	public void setNotaTotal(float notaTotal) {
		this.notaTotal = notaTotal;
	}
	@Override
	public String toString() {
		return this.nome;
	}
}
