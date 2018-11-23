<%-- 
    Document   : inicio
    Created on : 02/10/2018, 15:57:55
    Author     : jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <title>RentCar Aluguel de carros</title>
    </head>
    <body>   
       <% Usuario u = (Usuario)request.getAttribute("usuarioLogado"); %> 
       <%@include file= "menu.jsp" %>  
       <center> Seja bem-vindo! Escolha no menu a opção desejada. </center>
    </body>
</html>
