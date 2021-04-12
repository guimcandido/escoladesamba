package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Produto;
import model.ProdutoMensagens;

public class CadastraProduto implements ICadastraProduto {

	private Connection c;
	
	public CadastraProduto() throws ClassNotFoundException, SQLException {
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
		PreparedStatement ps = c.prepareStatement("EXEC sp_insere");
		ps.execute();
		ps.close();
	}
	
	@Override
	public void cadastraProduto(Produto produto, ProdutoMensagens pm)
			throws SQLException {

	}

}