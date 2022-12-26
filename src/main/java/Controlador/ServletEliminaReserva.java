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

@WebServlet(name = "ServletEliminaReserva", value = "/ServletEliminaReserva")
public class ServletEliminaReserva extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        request.setCharacterEncoding("UTF-8");
        GestorViajes gestor = (GestorViajes) contexto.getAttribute("gestor");
        String codViaje = request.getParameter("codViaje");
        System.out.println("El código que me están pasando es " + codViaje + "" );
        HttpSession sesion = request.getSession();
        String codCli = (String) sesion.getAttribute("codCli");
        if(codCli == null) {
            RequestDispatcher vista = request.getRequestDispatcher("index.html");
            vista.forward(request, response);
        }

        System.out.println("Datos"+ codViaje + codCli);
        JSONObject res = gestor.anulaReserva(codViaje, codCli);
        System.out.println(res);
        request.setAttribute("res",res);
        RequestDispatcher vista = request.getRequestDispatcher("resEliminaReserva.jsp");
        vista.forward(request, response);

    }
}
