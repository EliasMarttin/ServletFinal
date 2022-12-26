package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.json.simple.JSONObject;

import java.io.IOException;

@WebServlet(name = "ServletOfertaViaje", value = "/ServletOfertaViaje")
public class ServletOfertaViaje extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String origen = request.getParameter("origen");
        String destino = request.getParameter("destino");
        String fecha = request.getParameter("fecha");
        long precio = Long.parseLong(request.getParameter("precio"));
        long numPlazas = Long.parseLong(request.getParameter("numPlazas"));
        String codCli = (String) request.getSession().getAttribute("codCli");
        if(codCli == null) {
            RequestDispatcher vista = request.getRequestDispatcher("index.html");
            vista.forward(request, response);
        }
        JSONObject res = gestor.ofertaViaje(codCli, origen, destino, fecha, precio, numPlazas);
        System.out.println(res);
        request.setAttribute("res",res);
        RequestDispatcher vista = request.getRequestDispatcher("resOfertaViaje.jsp");
        vista.forward(request, response);
    }
}
