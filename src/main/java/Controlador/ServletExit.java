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

import java.io.IOException;

@WebServlet(name = "ServletExit", value = "/ServletExit")
public class ServletExit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        gestor.guardaDatos();
        String codcli = (String) request.getSession().getAttribute("codCli");
        request.setAttribute("codCli",null);
        request.getSession().invalidate();
        request.setAttribute("codcli",codcli);
        RequestDispatcher vista = request.getRequestDispatcher("resExit.jsp");
        vista.forward(request, response);
    }
}
