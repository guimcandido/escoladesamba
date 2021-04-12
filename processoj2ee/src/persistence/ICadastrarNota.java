package persistence;

import java.sql.SQLException;

import model.Apuracao;


public interface ICadastrarNota {

	public void cadastraNota(Apuracao apuracao) throws SQLException;
	
}
