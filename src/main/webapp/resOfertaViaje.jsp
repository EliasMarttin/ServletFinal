<%@ page import="org.json.simple.JSONObject" %><%--
  Created by IntelliJ IDEA.
  User: ELIAS
  Date: 17/12/2022
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BlablaUji</title>
</head>
<link rel="stylesheet" href="Vista/CSS/mystyle.css">
<body>
<img src="Vista/recursos/img.png" alt="Italian Trulli"  id="fotoMain">
<h1>BlaBla UJI</h1>
<%
    JSONObject viaje = (JSONObject) request.getAttribute("res");
    if(!viaje.isEmpty()) {
%>
<h2> Datos del viaje ofertado </h2>
<div>
    <ul>
        <li> Código de viaje: <%= viaje.get("codviaje")%></li>
        <li> Código del propietario: <%= viaje.get("codprop")%></li>
        <li> Origen: <%= viaje.get("origen")%></li>
        <li> Destino: <%= viaje.get("destino")%></li>
        <li> Fecha: <%= viaje.get("fecha")%></li>
        <li> Pasajeros: <%= viaje.get("pasajeros")%></li>
        <li> Plazas disponibles: <%= viaje.get("numplazas")%></li>
    </ul>
</div>
<% } else {%>
<h2>No se ha podido realizar la oferta </h2>
<%}%>
<br>
<a href="menu.jsp">Menú</a>

</body>
</html>
