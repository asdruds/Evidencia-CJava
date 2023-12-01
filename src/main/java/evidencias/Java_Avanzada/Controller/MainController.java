package evidencias.Java_Avanzada.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MainController", value = "/main")
public class MainController extends HttpServlet {


    private Map<String, String> usuariosRegistrados = new HashMap<>();

    private List<String> historialIMC = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("login".equals(action)) {
            String usuario = request.getParameter("usuario");
            String contraseña = request.getParameter("contraseña");
            boolean loginExitoso = iniciarSesion(usuario, contraseña);
            if (loginExitoso) {
                response.sendRedirect("calculadoraIMC.html");
            } else {
                System.out.println("Inicio de sesión fallido. Credenciales incorrectas.");
            }
        } else if ("registro".equals(action)) {

            String usuario = request.getParameter("usuario");
            String contraseña = request.getParameter("contraseña");
            String nombre = request.getParameter("nombre");
            int edad = Integer.parseInt(request.getParameter("edad"));
            char sexo = request.getParameter("sexo").charAt(0);
            double estatura = Double.parseDouble(request.getParameter("estatura"));

            boolean registroExitoso = registrarUsuario(usuario, contraseña, nombre, edad, sexo, estatura);
            if (registroExitoso) {

                response.sendRedirect("inicioSesion.html");
            } else {
                System.out.println("Registro fallido");
            }
        } else if ("calcularIMC".equals(action)) {
            String peso = request.getParameter("peso");
            String altura = request.getParameter("altura");
            String imc = calcularIMC(peso, altura);
            historialIMC.add(imc);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Historial de IMC</h2>");
        out.println("<ul>");
        for (String imc : historialIMC) {
            out.println("<li>" + imc + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }

    private boolean iniciarSesion(String usuario, String contraseña) {
        return usuariosRegistrados.containsKey(usuario) && usuariosRegistrados.get(usuario).equals(contraseña);
    }

    private boolean registrarUsuario(String usuario, String contraseña, String nombre, int edad, char sexo, double estatura) {

        if (!usuariosRegistrados.containsKey(usuario)) {

            usuariosRegistrados.put(usuario, contraseña);
            return true;
        } else {
            return false;
        }
    }

    private String calcularIMC(String peso, String altura) {

        double pesoDouble = Double.parseDouble(peso);
        double alturaDouble = Double.parseDouble(altura);
        double imc = pesoDouble / (alturaDouble * alturaDouble);
        return "IMC: " + String.format("%.2f", imc);
    }
}
