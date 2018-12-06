<%-- 
    Document   : alterar
    Created on : 04/12/2018, 11:23:38
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <title>Alterar veículo</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
    <center>
        <form class="baseForm" action="AlterarCarro.action" method="post">
            <input name=uid id=codigo01 type="hidden" value="1"/>
            <label class="formLabel">
                Digite a placa do carro a ser alterado:
                <input name="placa" type="text" required class="formInput formTextInput">
            </label>
            </p>
            <input type="submit" class="botao" id="btnEnviar" value="Enviar"/>
        </form>

    </center>
</body>
</html>

