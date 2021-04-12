package model;

public class Apuracao {

	private int id_escola;
	private int id_quesito;
	private int id_jurado;
	private float nota;
	private int notaValida;
	
	public int getEscola() {
		return id_escola;
	}
	public void setEscola(int id_escola) {
		this.id_escola = id_escola;
	}
	
	public int getQuesito() {
		return id_quesito;
	}
	public void setQuesito(int id_quesito) {
		this.id_quesito = id_quesito;
	}
	
	public int getJurado() {
		return id_jurado;
	}
	public void setJurado(int id_jurado) {
		this.id_jurado = id_jurado;
	}
	
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public int getNotaValida() {
		return notaValida;
	}
	public void setNotaValida(int notaValida) {
		this.notaValida = notaValida;
	}
}
