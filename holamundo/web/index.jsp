<%-- 
    Document   : index
    Created on : 22/09/2014, 03:36:01 PM
    Author     : S1NW-A3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% int i = 10; %>
        
        <table border = "1">
            
            <% for(int x = 0; x < i;x++){%>
            <tr>
                <td><%= x %></td>
            </tr>
            <%}%>
        </table>
        
        
        <form action="Autenticacion" method="post">
            <input type="text" name="user" id="user"/>
            <input type="password" name="pass" id="pass"/>
            <input type="submit" name="send" id="send" values="login"/>
        </form>
        
        
        <%= i %>
        <%--Este es un comentario --%>
        
        
        <h1>Servidor web de java</h1>
    </body>
</html>
