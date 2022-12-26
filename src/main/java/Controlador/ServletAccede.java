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

@WebServlet(name = "ServletAccede", value = "/ServletAccede")
public class ServletAccede extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        if (gestor == null) {
            gestor = new GestorViajes();
            contexto.setAttribute("gestor", gestor);
        }

        // Obtengo el parámetro del formulario
        request.getSession(true);
        String codCli = request.getParameter("codCli");
        request.getSession().setAttribute("codCli",codCli);
        // Creo la página web con la respuesta
        RequestDispatcher vista = request.getRequestDispatcher("menu.jsp");
        vista.forward(request, response);

    }
}
