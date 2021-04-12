<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produto</title>
</head>
<body>

	<div align="center">
		<form action="cadproduto" method="post">
			<table>
				<tr>
					<td><input type="text" name="escola" id="escola"
						placeholder="Escola de samba"></td>
				</tr>
				<tr>
					<td><input type="text" name="jurado" id="jurado"
						placeholder="Número do jurado"></td>
				</tr>
				<tr>
					<td><input type="text" name="quesito" id="quesito"
						placeholder="Quesito"></td>
				</tr>
				<tr>
					<td><input type="text" name="nota" id="nota"
						placeholder="Nota"></td>
				</tr>
				<tr>
					<td><input type="submit" name="enviar" value="Enviar">
				</tr>
				<c:if test="${not empty saida }">
				<tr>
					<td><c:out value="${saida }" /></td>
				</tr>
				</c:if>
			</table>
		</form>
	</div>

</body>
</html>