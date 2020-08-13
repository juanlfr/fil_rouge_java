<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau Film</title>
</head>
<body>

<h1>Bienvenu sur la page de création de film</h1>

<%@ include file="menu.jsp" %>

<form:form action="/ajouter" method="POST" modelAttribute="film">
	<form:label path="nom">Nom :</form:label>
	<form:input path="nom"/><br/>
	<form:label path="description">Description :</form:label>
	<form:input path="description"/><br/>
	<form:label path="duree">Durée :</form:label>
	<form:input path="duree"/><br/>
	<form:label path="releaseYear">Année de réalisation :</form:label>
	<form:input path="releaseYear"/><br/>
	
	<form:label path="category.id">Category :</form:label>
		<form:select path="category.id">
			<c:forEach items="${ categorys }" var="category">
				<form:option value="${category.id}">${category.nom}</form:option>
			</c:forEach>
		</form:select><br/>
	
	<form:label path="language.id">Language :</form:label>
		<form:select path="language.id">
			<c:forEach items="${language }" var="language">
				<form:option value="${ language.id}">${ language.nom}</form:option>
			</c:forEach>
		</form:select><br/>
	<form:button>Ajouter le film</form:button>
</form:form>

</body>
</html>