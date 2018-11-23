<%-- 
    Document   : CadastroCliente
    Created on : 21/09/2018, 08:21:18
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <title>Cadastro de cliente</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
        <form class="baseForm" action="Cadastrado.action" method="get">
                <input name=uid id=codigo02 type="hidden" value="1"/>
                <label class="formLabel">
                    Nome de usuário:
                    <input name="usuario" type="usuario" required class="formInput formTextInput">
                </label>
                </p>
                <label class="formLabel">
                    Senha:
                    <input name="senha" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Nome:
                    <input name="nome" type="text" required class="formInput formTextInput">
                </label>
                </p>
                <label class="formLabel">
                    Email:
                    <input name="email" type="text" required class="formInput formTextInput">
                </label>
                </p>
                <label class="formLabel">
                    CNH:
                    <input name="cnh" type="text" required class="formInput formTextInput">
                </label>
                </p>
                <label class="formLabel">
                    Categoria CNH:
                    <input name="catCnh" type="text" required class="formInput formTextInput">
                </label>
                
               <input type='submit' class='botao' value='Cadastrar'/>
            </form>
    </body>
</html>
