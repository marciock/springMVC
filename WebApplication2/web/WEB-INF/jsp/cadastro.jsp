<%-- 
    Document   : cadastro
    Created on : 17/02/2018, 12:17:04
    Author     : kdezen
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link  href="<c:url value="resources/css/style.css" />"	rel="stylesheet" type="text/css" />
        <title>Cadastro</title>
    </head>
    <body>
        <div class="container">
                <h1>Tela de Cadastro</h1>
                <div>
                    <form action="inicio" method="POST">
                        <div class="form-group">
                            <label>Nome</label>
                         <input type="text" id="nome" class="form-control">
                        </div>
                         <div class="form-group">
                            <label>Endereço</label>
                         <input type="text" id="endereco" class="form-control">
                        </div>
                         <div class="form-group">
                            <label>Telefone</label>
                         <input type="number" id="telefone" class="form-control">
                        </div>
                         <div class="form-group">
                            <label>Email</label>
                         <input type="email" id="email" class="form-control">
                        </div>
                         <div class="form-group">

                         <input type="submit" id="sbmit" class="form-contro btn btn-infol" value="Cadastrar">
                        </div>
                    </form>
                </div>
        </div>
    </body>
</html>
