package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.CadastraNota;
import persistence.ICadastrarNota;
import model.Apuracao;


@WebServlet("/cadastroatividade")
public class ApuracaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ApuracaoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String erro = "";
		int escola = Integer.parseInt(request.getParameter("escola"));
		int jurado = Integer.parseInt(request.getParameter("jurado"));
		int quesito = Integer.parseInt(request.getParameter("quesito"));
		float nota = Float.parseFloat(request.getParameter("nota"));

		Apuracao apuracao = new Apuracao();
		apuracao.setEscola(escola);
		apuracao.setJurado(jurado);
		apuracao.setQuesito(quesito);
		apuracao.setNota(nota);
		
		ICadastrarNota iNota = new ICadastrarNota();
		
		/*
		
		
		al.setCodigo(Integer.parseInt(codigoAluno));
		al.setNome(nomeAluno);
		AtividadesAlunos aa = new AtividadesAlunos();
		aa.setAluno(al);
		aa.setAltura(altura);
		aa.setPeso(peso);
		IAtividadeDao aDao = new AtividadeDao();
		try {
			al = aDao.insereAtividade(aa);
			aa = aDao.consultaAtividade(al);
		} catch (SQLException e) {
			erro = e.getMessage();
		} finally {
			request.setAttribute("erro", erro);
			request.setAttribute("alunoatividade", aa);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}*/
	}

}
