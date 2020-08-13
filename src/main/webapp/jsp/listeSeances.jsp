<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<th>Seance id</th>
		<th>Film</th>
		<th>date et heure</th>
		<th>Salle</th>
		
	</tr>
	<c:forEach items="${listeDeSeances}" var="seance">
		<tr>
			<td>${ seance.id }</td>
			<td>${ seance.film.nom }</td>
			<td>${ seance.dateDebut }</td>
			<td>${ seance.salle.nom }</td>
			
		</tr>
	</c:forEach>
</table>
	
	
</body>
</html>