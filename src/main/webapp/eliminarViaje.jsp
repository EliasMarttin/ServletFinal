<%--
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
<img src="Vista/recursos/img.png" alt="Italian Trulli">
<h1 id="tituloMain">BlaBla UJI</h1>
<div id="divlistadoMain">
    <form action = "ServletEliminaViaje" method="GET">
        <label>Indica el Codigo del viaje que quieres eliminar </label><input type="text" name="codViaje" required>
        <input type="submit" value="Eliminar">
    </form>
    <br>
    <a href="menu.jsp">Menú</a>
</div>
</body>
</html>
