package dao;

import java.util.ArrayList;

import model.Livros;

public class TestConnection {

	public static void main(String[] args) {

		LivrosDao dao = new LivrosDao();

		ArrayList<Livros> livros = (ArrayList<Livros>) dao.listar();
		
		
		for (int i = 0; i < livros.size(); i++) {
			
		
			
		}

	}

}
