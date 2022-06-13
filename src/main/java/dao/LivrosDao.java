package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Livros;

public class LivrosDao {

	public List<Livros> listar() {

		List<Livros> livros = new ArrayList<Livros>();

		Conexao conn = new Conexao();

		try {

			Statement stmt = (Statement) conn.getConn().createStatement();
			ResultSet rs = stmt.executeQuery("Select * from livros");
			while (rs.next()) {
				Livros livro = new Livros();
				livro.setId(rs.getInt("id_livro"));
				livro.setNome(rs.getString("nome_livro"));
				livro.setAutor(rs.getString("autor_livro"));
				livro.setEditora(rs.getString("editora_livro"));

				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

				Date dt = sf.parse(rs.getString("data_edicao"));

				String st = sf.format(dt);

				livro.setData(st);

				livros.add(livro);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			// conn.fecharConexao();
		}
		return livros;

	}

	public String inserir(Livros livro) {

		String retorno = "falha";
		Conexao conn = new Conexao();
		try {
			Statement stmt = (Statement) conn.getConn().createStatement();
			stmt.execute("insert into livros (nome_livro, autor_livro, editora_livro, data_edicao)  " + "values ('"
					+ livro.getNome() + "','" + livro.getAutor() + "', '" + livro.getEditora() + "','" + livro.getData()
					+ "')");
			retorno = "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.fecharConexao();
		}

		return retorno;

	}

}
