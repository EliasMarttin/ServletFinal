<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>
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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta charset="UTF-8">
    <title>BlablaUji</title>
</head>
<link rel="stylesheet" href="Vista/CSS/mystyle.css">
<body>
<img src="Vista/recursos/img.png" alt="Italian Trulli"  id="fotoMain">
<h1>BlaBla UJI</h1>
<h2>Viajes Disponibles desde <%=request.getParameter("codViaje")%></h2>
<div>
    <table>

        <tr>
            <th>Código de Viaje |</th>
            <th>Código Propietario |</th>
            <th>Destino |   </th>
            <th>Fecha |</th>
            <th>Precio |</th>
            <th>Nº Plazas |</th>
            <th>Pasajeros |</th>
        </tr>
        <%
            JSONArray res = (JSONArray) request.getAttribute("res");
            for (int i = 0; i< res.size(); i++) {
                JSONObject object = (JSONObject) res.get(i);
        %>
        <tr>
            <td><%=object.get("codviaje")%>
            </td>
            <td><%=object.get("codprop")%>
            </td>
            <td><%=object.get("destino")%>
            </td>
            <td><%=object.get("fecha")%>
            </td>
            <td><%=object.get("precio")%>
            </td>
            <td><%=object.get("numplazas")%>
            </td>
            <td><%=object.get("pasajeros")%>
            </td>
        </tr>
        <% } %>
    </table>
    <br>
    <a href="menu.jsp">Menú</a>
</div>
</body>
</html>
