<%@page import="control.ControllerLivros"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css"
	integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>

<style type="text/css">
</style>

</head>
<body>


	<div class="container">

		<div class="row">

			<h1 class="h1">FOMULADO DE CADASTRO</h1>

			<div class="col-6">
				<form action="${pageContext.request.contextPath}/livro" method="post">
					<div class="mb-3">
						<label for="nome" class="form-label">Nome Livro: </label> 
						<input type="text" class="form-control" name="nome_livro" aria-describedby="">
					</div>
					<div class="mb-3">
						<label for="autor" class="form-label">Autor Livro:</label> 
						<input type="text" class="form-control" name="autor_livro">
					</div>

					<div class="mb-3">
						<label for="editora" class="form-label">Editora:</label> 
						<input type="text" class="form-control" name="editora_livro">
					</div>

					<div class="mb-3">
						<label for="data" class="form-label">Data lançamento:</label> 
						<input type="date" class="form-control" name="data_edicao" aria-describedby="">
					</div>
			
					<button type="submit" class="btn btn-primary">Submit</button>


				</form>

			</div>



		</div>

	</div>
</body>
</html>