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

@WebServlet(name = "ServletReservaViaje", value = "/ServletReservaViaje")
public class ServletReservaViaje extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String codViaje = request.getParameter("codViaje");
        String codCli = (String) request.getSession().getAttribute("codCli");
        if(codCli == null) {
            RequestDispatcher vista = request.getRequestDispatcher("index.html");
            vista.forward(request, response);
        }
        JSONObject res = gestor.reservaViaje(codViaje,codCli);
        System.out.println(res);
        request.setAttribute("res",res);
        RequestDispatcher vista = request.getRequestDispatcher("resReservaViaje.jsp");
        vista.forward(request, response);

    }
}
