<%-- 
    Document   : AlterarCarro
    Created on : 04/12/2018, 11:39:19
    Author     : Aluno
--%>
<%-- 
    Document   : cadastro_carro
    Created on : 21/09/2018, 07:33:23
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <title>Alteração de carros</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
        <%
            String categoria = (String) request.getAttribute("categoria");
            String ano = (String) request.getAttribute("ano");
            long placa = (long) request.getAttribute("placa");
            String modelo = (String) request.getAttribute("modelo");
            String fabricante = (String) request.getAttribute("fabricante");
            String cor = (String) request.getAttribute("cor");
            String estadoConservacao = (String) request.getAttribute("estadoConservacao");
            int quilometragem = (int) request.getAttribute("quilometragem");
            int tanque = (int) request.getAttribute("tanque");

            out.print("<form class='baseForm' action='Alterado.action' method='get'>"
                    + "<input name=uid id=codigo02 type='hidden' value='1'/>"
                    + "<label class='formLabel'>"
                    + "Categoria:"
                    + "<select id='select01' readonly name='categoria' size='1'>"
                    + "    <option value='" + categoria + "'>" + categoria + "</option>"
                    + "</select>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "Ano:"
                    + "<input name='ano' readonly type='text' value='" + ano + "' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "Placa:"
                    + "    <input name='placa' readonly type='text' value='" + placa + "' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Modelo:"
                    + "    <input name='modelo' readonly type='text' value='" + modelo + "' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Fabricante:"
                    + "    <input name='fabricante' readonly value='" + fabricante + "' type='text' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Cor:"
                    + "    <input name='cor' type='text' value='" + cor + "'  required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Estado de conservação:"
                    + "    <input name='estadoConservacao' type='text' value='" + estadoConservacao + "' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Quilometragem:"
                    + "    <input name='quilometragem' type='text' value='" + quilometragem + "' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Tanque de combustível:"
                    + "    <input name='tanque' type='text' value='" + tanque + "' required class='formInput formTextInput'>"
                    + "</label>"
                    + "</p>"
                    + "</p>"
                    + "<br>"
                    + "<input type='submit' class='botao' value='Enviar'/>"
                     + "</form>");%>
        
    </body>
</html>
