package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.CadastraProduto;
import persistence.ICadastraProduto;
import model.Produto;
import model.ProdutoMensagens;

@WebServlet("/cadproduto")
public class CadastroProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroProdutoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
		Produto p = new Produto();
		
		p.setId(request.getParameter("id"));
		p.setNome(request.getParameter("nome"));
		p.setValidade(request.getParameter("validade"));
		ICadastraProduto cPes = new CadastraProduto();
		ProdutoMensagens pm = new ProdutoMensagens();
		try {
			cPes.cadastraProduto(p, pm);
		} catch (SQLException e) {
			pm.setMsgCadastro(e.getMessage());
		} finally {
			request.setAttribute("msgid", pm.getMsgId());
			request.setAttribute("msgcad", pm.getMsgCadastro());
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			view.forward(request, response);
		}
	}

}
