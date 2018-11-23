<%-- 
    Document   : entrar
    Created on : 15/09/2018, 14:49:18
    Author     : jonas
--%>

<%@page import="api.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <title>Entrar</title>
        <script src="static/javascript/eventos.js"></script>
    </head>
    <body>
        <% Usuario u = (Usuario)request.getAttribute("usuarioLogado"); %> 
        
        <center>
            <p class="formTitulo">
                    ALUGUEL DE CARROS
            </p>
            <form class="baseForm" action="Autenticar.action" method="post">
                <input name=uid id=codigo01 type="hidden" value="1"/>
                <label class="formLabel">
                    Usuário:
                    <input name="nomeUsuario" type="text" required class="formInput formTextInput">
                </label>
                </p>
                <label class="formLabel">
                    Senha:
                    <input name="senha" type="password" required class="formInput formTextInput">
                </label>   
                </p>
                <input type="submit" class="botao" id="btnLogin" value="Enviar"/>
            </form>
	</center>
    </body>
</html>
