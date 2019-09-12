package mx.rafex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulario")
public class Formulario extends HttpServlet {

    private static final long serialVersionUID = 5436699406890556670L;

    @Override
    public void init() throws ServletException {
        System.out.println("Se ha creado el servlet formulario");
    }

    @Override
    public void destroy() {
        System.out.println("Se ha destruido el servlet formulario");
    }

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        final String title = "Simple Servlet Output";

        System.out.println(request.getQueryString());

        final String nombre = request.getParameter("nombre");
        final String apellidoPaterno = request.getParameter("apellidoPaterno");

        // primero selecciona el tipo de contenidos y otros campos de cabecera de la
        // respuesta
        response.setContentType("text/html");
        // Luego escribe los datos de la respuesta
        out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println(title);
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<P>This is output from SimpleServlet. " + nombre + " " + apellidoPaterno);
        out.println("</BODY></HTML>");
        out.close();
    }

    @Override
    public void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        final String nombre = request.getParameter("nombre");
        final String apellidoPaterno = request.getParameter("apellidoPaterno");
        final String apellidoMaterno = request.getParameter("apellidoMaterno");
        int edad = 0;
        if ((request.getParameter("edad") != null) && !request.getParameter("edad").isEmpty()) {
            edad = Integer.parseInt(request.getParameter("edad"));
        }

        PrintWriter out;
        response.setContentType("application/json");
        out = response.getWriter();
        out.println(
                "{\n" + "  \"nombre\": \"" + nombre + "\",\n" + "  \"apellidoPaterno\": \"" + apellidoPaterno + "\",\n"
                        + "  \"apellidoMaterno\": \"" + apellidoMaterno + "\",\n" + "  \"edad\": \"" + edad + "\",\n" +

                        "  \"direccion\": {\n" + "    \"calle\": \"juan escutia\",\n" + "    \"numero\": \"43\"\n"
                        + "  }\n" + "}");

        out.close();

    }

    @Override
    public void doPut(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public void doOptions(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public void doDelete(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }

}
