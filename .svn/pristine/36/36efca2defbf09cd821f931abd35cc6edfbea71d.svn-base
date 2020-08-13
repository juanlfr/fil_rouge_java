<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Liste des films</h1>

<%@ include file="menu.jsp" %>

<table border="1">
	<tr>
		<th>Nom</th>
		<th>Description</th>
		<th>Duree</th>
		<th>Release Year</th>
		<th>Category</th>
		<th>Language</th>
	</tr>
		<c:forEach items="${liste}" var="film">
			<tr>
				<td>${ film.nom }</td>
				<td>${ film.description }</td>
				<td>${ film.duree }</td>
				<td>${ film.releaseYear }</td>
				<td>${ film.category.nom }</td>
				<td>${ film.language.nom }</td>
				<td id="boutonSupprimer">
					<form action="/liste" method="POST">
						<input type="hidden" name="id" value="${ film.id }" /> <input
							type="submit" value="x" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>