<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="UTF-8">
    <title>BlablaUji</title>
    </head>
<link rel="stylesheet" href="Vista/CSS/mystyle.css">
<body>
<img src="Vista/recursos/img.png" alt="Italian Trulli" >
<h1 id="tituloMain">BlaBla UJI</h1>
<div>
    <form action = "ServletconsultaViajes" method="get">
        <label>Indica el Origen del Viaje </label><input type="text" name="codViaje" required>
        <input type="submit" value="Enviar">
    </form>
    <br>
    <a href="menu.jsp">Menú</a>
</div>
</body>
</html>
