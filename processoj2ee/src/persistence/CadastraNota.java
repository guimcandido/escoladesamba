package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Apuracao;

public class CadastraNota implements ICadastrarNota {

	private Connection c;
	
	public CadastraNota(int id_escola, int id_quesito, int id_jurado, float nota) throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
		PreparedStatement ps = c.prepareStatement("EXEC sp_insere_nota "+id_escola+", "+id_quesito+", "+id_jurado+", "+nota);
		ps.execute();
		ps.close();
	}
	
	@Override
	public void cadastraNota(Apuracao apuracao)
			throws SQLException {

	}

}