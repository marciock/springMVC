<%-- 
    Document   : exibir
    Created on : 17/02/2018, 23:30:02
    Author     : kdezen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastros</h1>
        
        <div class="container">
            
            <table>
                
                <thead>
                    <tr>
                        <th>Nome</th> 
                        <th>Endereço</th> 
                        <th>Telefone</th> 
                        <th>Email</th> 
                       
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${lista}" var="atributo">
                        <tr>
                            <td>${atributo.nome}</td>
                             <td>${atributo.endereco}</td>
                              <td>${atributo.telefone}</td>
                               <td>${atributo.email}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
