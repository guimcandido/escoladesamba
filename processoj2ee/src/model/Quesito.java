package model;

public class Quesito {

	private int id_quesito;
	private String nome;
	
	public int getId() {
		return id_quesito;
	}
	public void setId(int id_quesito) {
		this.id_quesito = id_quesito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
