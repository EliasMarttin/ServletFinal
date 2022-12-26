<%--
  Created by IntelliJ IDEA.
  User: ELIAS
  Date: 17/12/2022
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>BlablaUji</title>
</head>
<link rel="stylesheet" href="Vista/CSS/mystyle.css">
<body>
<img src="Vista/recursos/img.png" alt="Italian Trulli">
<h1 id="tituloMain">BlaBla UJI</h1>
<h2>Introduce los datos del viaje a Ofertar</h2>
<div>
    <form action = "ServletOfertaViaje" method="POST">
        <table>
            <tr>
                <td><label>Origen</label></td>
                <td><input type="text"  maxlength="20" name="origen" size="20" required></td>
            </tr>
            <tr>
                <td><label>Destino:</label></td>
                <td><input type="text" id="precio" name="destino"  maxlength="20" size="20" required><br></td>
            </tr>
            <tr>
                <td><label>Fecha (dd-mm-aaaa)</label></td>
                <td><input type="text" name="fecha" required><br></td>
            </tr>
            <tr>
                <td><label>Precio</label></td>
                <td><input type="number" name="precio" required min="1"><br></td>
            </tr>
            <tr>
                <td><label>Número de Plazas:</label></td>
                <td><input type="number" name="numPlazas"  maxlength="20" size="20" min="1" required><br></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="ofertar Viaje">

    </form>

    <br>
    <a href="menu.jsp">Menú</a>
</div>
</body>
</html>
