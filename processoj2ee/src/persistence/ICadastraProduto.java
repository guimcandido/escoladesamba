package persistence;

import java.sql.SQLException;

import model.Produto;
import model.ProdutoMensagens;

public interface ICadastraProduto {

	public void cadastraProduto(Produto produto, ProdutoMensagens pm) throws SQLException;
	
}
