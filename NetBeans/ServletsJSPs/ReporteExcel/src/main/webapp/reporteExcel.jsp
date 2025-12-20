<%@page errorPage="/WEB-INF/manejoErrores.jsp"%>
<%@page import="utilerias.Conversiones, java.util.Date"%>

<%@page contentType="application/vnd.ms-excel;charset=UTF-8"%>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripción</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis básica de Java</td>
                <td><%= Conversiones.format("500") %></td>
            </tr>
            
            <tr>
                <td>2. Programación con Java</td>
                <td>Pondremos en práctica los conceptos de la POO</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
