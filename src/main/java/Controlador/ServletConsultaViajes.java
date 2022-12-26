package Controlador;

import Modelo.GestorViajes;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;

import java.io.IOException;

@WebServlet(name = "ServletConsultaViajes", value = "/ServletconsultaViajes")
public class ServletConsultaViajes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext contexto = getServletContext();
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        request.setCharacterEncoding("UTF-8");
        String codCli = (String) request.getSession().getAttribute("codCli");
        if(codCli == null) {
            RequestDispatcher vista = request.getRequestDispatcher("index.html");
            vista.forward(request, response);
        }
        String codViaje = request.getParameter("codViaje");
        System.out.println("El código que me están pasando es " + codViaje + "" );
        JSONArray res =  gestor.consultaViajes(codViaje);
        System.out.println(res);
        request.setAttribute("res", res);
        RequestDispatcher vista = request.getRequestDispatcher("resConsultaViajes.jsp");
        vista.forward(request, response);
    }

}
