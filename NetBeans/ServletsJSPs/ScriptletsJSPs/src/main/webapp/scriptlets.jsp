<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br/>
        <!-- Scriptlet para enivar información al navegador -->
        <%
            out.println("Saludos desde un scriptlet");
        %>
        
        <br/>
        
        <!-- Scriptlet para acceder a los objetos implícitos -->
        <%
            String nombreAplicacion = request.getContextPath();
            out.println("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        
        <!-- Scriptlet con código condicionado -->
        <% 
            if (session != null && session.isNew()){
        %>
        
        la sesión SI es nueva
        
        <% 
            } else if(session != null){
        %>
        
        la sesión NO es nueva
        
        <%
            }
        %>
        <br/>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
