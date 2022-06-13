package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HttpMethodConstraint;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Livros;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.LivrosDao;

/**
 * Servlet implementation class doPost
 */
@WebServlet("/livro")
public class ControllerLivros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerLivros() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome_livro");
		String autor = request.getParameter("autor_livro");
		String editora = request.getParameter("editora_livro");
		String data = request.getParameter("data_edicao");

		try {
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");

			Date dt = sf.parse(data);

			String st = sf.format(dt);

			Livros livro = new Livros();
			livro.setNome(nome);
			livro.setAutor(autor);
			livro.setEditora(editora);
			livro.setData(st);

			LivrosDao dao = new LivrosDao();
			String retorno = dao.inserir(livro);

			if (retorno.equals("sucesso")) {
				response.sendRedirect("index.jsp");
			} else {
				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<h2>Não foi possivel inserir livro</h2>");
				out.print("<br>");
				out.print("<a href='index.jsp'>Voltar</a>");
				out.print("</html");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
