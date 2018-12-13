<%-- 
    Document   : inicio
    Created on : 02/10/2018, 15:57:55
    Author     : jonas
--%>
<%@page import="api.modelo.Papel"%>
<%@page import="api.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="static/javascript/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="static/javascript/eventos.js" type="text/javascript"></script>
        <script src="static/javascript/JQuery.js" type="text/javascript"></script>   
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">       
        <title>RentCar Aluguel de carros</title>
    </head>
    <body>   
       <% Usuario u = (Usuario)request.getAttribute("usuarioLogado"); %> 
       <%@include file= "menu.jsp" %>  
       <center> <div id='inicio'>Seja bem-vindo! Escolha no menu a opção desejada. </div></center>
    </body>
</html>
