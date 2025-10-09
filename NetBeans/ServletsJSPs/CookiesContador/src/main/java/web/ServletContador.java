package web;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/ServletContador"})
public class ServletContador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        // Suponemos que el usuario visita por primera vez nuestro sitio
        int numeroVisitas = 0;
        
        // Obtenemos el arreglo de Cookies
        Cookie[] cookies = request.getCookies();
        
        // Buscamos si ya existe una Cookie creada con anterioridad
        // llamada visitanteRecurrente
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("numeroVisitas") && !cookie.getValue().equals("0")) {
                    numeroVisitas = Integer.parseInt(cookie.getValue());
                    break;
                    
                }
            }
        }
        
        String mensaje;
        Cookie visitanteCookie = null;
        visitanteCookie.setMaxAge(3600);
        
        if (numeroVisitas != 0) {
            // Creamos una nueva Cookie para identificar un usuario recurrente
            visitanteCookie = new Cookie("numeroVisitas", String.valueOf(++numeroVisitas));
            response.addCookie(visitanteCookie);
            mensaje = "Has visitado este sitio " + numeroVisitas + " veces";
        }
        else{
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
            visitanteCookie = new Cookie("numeroVisitas", String.valueOf(1));
            response.addCookie(visitanteCookie);

        }
        
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contador de visitas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Contador de visitas</h1>");
            out.println("<p> Mensaje: " + mensaje + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
