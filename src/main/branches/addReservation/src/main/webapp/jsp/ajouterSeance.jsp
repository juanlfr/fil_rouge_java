<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Créer ta seance!</h2>
	<form:form action="/creationSeance" method="POST" modelAttribute="seance">
		<form:label path="dateDebut">Date et heure de début de la seance</form:label>
		<form:input path="dateDebut" type="datetime-local" />
		<br />
		<form:label path="film.id">Selectionner film :</form:label>
		<form:select path="film.id">
		<c:forEach items="${films}" var="film">
			<form:option value="${film.id}">${film.nom}</form:option>		
		</c:forEach>
		</form:select>
		<div>Pas dans la liste?
		<a href="/ajouter">Ajouter un Film</a>
		</div>
		<br />
		<form:label path="salle.id">Selectionner salle :</form:label>
		<form:select path="salle.id">
		<c:forEach items="${salles}" var="salle">
			<form:option value="${salle.id}">${salle.nom}</form:option>		
		</c:forEach>
		</form:select>
		<br />
		
		<form:button>Ajouter la seance</form:button>
	</form:form>

</body>
</html>