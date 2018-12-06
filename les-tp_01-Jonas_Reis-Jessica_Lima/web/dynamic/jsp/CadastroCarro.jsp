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
        <title>Cadastro de carros</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
        <form class="baseForm" action="CadastradoC.action" method="post">
                <input name=uid id=codigo02 type="hidden" value="1"/>
                <label class="formLabel">
                    Categoria:
                    <select id="select01" name="categoria" size="1">
                        <option value="Econômico">Econômico</option>
                        <option value="Compacto">Compacto</option>
                        <option value="Standard">Standard</option>
                        <option value="Luxo">Luxo</option>
                        <option value="Minivan">Minivan</option>
                        <option value="SUV">SUV</option>
                        <option value="Full Size">Full Size</option>
                        <option value="Intermediário">Intermediário</option>
                        <option value="Utilitário">Utilitário</option>
                        <option value="Premium">Premium</option>
                        <option value="Especial">Especial</option>
                        <option value="Van">Van</option>
                    </select>
                </label>
                </p>
                <label class="formLabel">
                    Ano:
                    <input name="ano" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Placa:
                    <input name="placa" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                <label class="formLabel">
                    Modelo:
                    <input name="modelo" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Fabricante:
                    <input name="fabricante" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Cor:
                    <input name="cor" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Estado de conservação:
                    <input name="estadoConservacao" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Quilometragem:
                    <input name="quilometragem" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                
                <label class="formLabel">
                    Tanque de combustível:
                    <input name="tanque" type="text" required class="formInput formTextInput">
                </label>   
                </p>
                </p>
                <br>
                <input type="submit" class='botao' value="Enviar"/>
            </form>
    </body>
</html>
