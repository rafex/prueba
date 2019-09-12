package mx.rafex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registroPersonas")
public class RegistroPersona extends HttpServlet {

    private static final long serialVersionUID = 5436699406890556670L;
    private static final List<Persona> listaPersonas = new ArrayList<>();

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
        final String title = "Listado personas";

        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println(title);
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<ol type=\"A\">");

        for (int i = 0; i < listaPersonas.size(); i++) {
            out.println("<li>");
            out.println("Identificador: " + (i + 1) + " ");
            out.println(listaPersonas.get(i).toString());
            out.println("</li>");
        }
        out.println("</ol>");
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

        listaPersonas.add(new Persona(nombre, apellidoPaterno, apellidoMaterno, edad));

        final String title = "Registro exitoso";
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println(title);
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<p> Identificador de registro:" + listaPersonas.size() + "</p>");
        out.println("</BODY></HTML>");
        out.close();

    }

    @Override
    public void doPut(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        final String nombre = request.getParameter("nombre");
        final String apellidoPaterno = request.getParameter("apellidoPaterno");
        final String apellidoMaterno = request.getParameter("apellidoMaterno");
        int edad = 0;
        if ((request.getParameter("edad") != null) && !request.getParameter("edad").isEmpty()) {
            edad = Integer.parseInt(request.getParameter("edad"));
        }
        final Integer identificador = Integer.valueOf(request.getParameter("identificador"));

        final Persona persona = listaPersonas.get(identificador - 1);

        listaPersonas.remove(persona);

        if ((nombre != null) && !nombre.isEmpty()) {
            persona.setNombre(nombre);
        }

        if ((apellidoPaterno != null) && !apellidoPaterno.isEmpty()) {
            persona.setApellidoPaterno(apellidoPaterno);
        }

        if ((apellidoMaterno != null) && !apellidoMaterno.isEmpty()) {
            persona.setApellidoMaterno(apellidoMaterno);
        }

        if (edad != 0) {
            persona.setEdad(edad);
        }

        listaPersonas.add(persona);

        final String title = "Modificación exitosa";
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println(title);
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<p> Modificación:" + persona.toString() + "</p>");
        out.println("</BODY></HTML>");
        out.close();

    }

    @Override
    public void doOptions(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public void doDelete(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        final Integer identificador = Integer.valueOf(request.getParameter("identificador"));

        final Persona persona = listaPersonas.get(identificador - 1);

        listaPersonas.remove(persona);

        final String title = "Eliminacion exitosa";
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>");
        out.println(title);
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "</H1>");
        out.println("<p>" + persona.toString() + "</p>");
        out.println("</BODY></HTML>");
        out.close();

    }

}
