<%@page import="java.util.List"%>
<%@page import="dao.LivrosDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Livros"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="inserirLivro.jsp">Inserir Livro</a>

	<%
	LivrosDao dao = new LivrosDao();
	List<Livros> livs = dao.listar();
	%>
	<table class="table table-striped table-hover" border="1" role="all">

		<tr class="table-active">
			<td>Id_Livo</td>
			<td>Nome_Livro</td>
			<td>Autor</td>
			<td>Editora</td>
			<td>Data Edição</td>
			<td>Ações</td>

		</tr>


		<%
		
		
		for (int i = 0; i < livs.size(); i++) {
			Livros livro = livs.get(i);
		%>
		<tr>
			<td><%=livro.getId()%></td>
			<td><%=livro.getNome()%></td>
			<td><%=livro.getAutor()%></td>
			<td><%=livro.getEditora()%></td>
			<td><%=livro.getData()%></td>
			<td><a href="alterarLivro.jsp?id=" <%=livro.getId()%>>Alterar</a></td>
		</tr>

		<%
		}
		%>


	</table>



</body>
</html>