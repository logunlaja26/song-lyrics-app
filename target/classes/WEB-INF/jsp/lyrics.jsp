<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.fasterxml.jackson.databind.JsonNode"%>

<html>
<head>
<title></title>
</head>
<body>

	<table>
		<tr>
			<th>Song</th>
			<th>Artist</th>
			<th>Lyrics</th>
		</tr>
		<%-- <c:forEach var="i" items="${results}"> --%>
		<%
			JsonNode results = (JsonNode) request.getAttribute("results");
		%>
		<%
			for (JsonNode node : results) {
		%>
		<tr>
			<%--      	<td>${i}</td> --%>
			<td><%=node.at("/track/track_name").asText()%></td>
			<td><%=node.at("/track/artist_name").asText()%></td>
			<td></td>
		</tr>
		<%
			}
		%>
		<%-- </c:forEach> --%>
	</table>
</body>
</html>