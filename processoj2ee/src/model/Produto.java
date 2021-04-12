package model;

public class Produto {

	private String id;
	private String nome;
	private String validade;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
}
