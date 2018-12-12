<%-- 
    Document   : menu
    Created on : 16/09/2018, 23:58:24
    Author     : jonas
--%>

<%@page import="api.modelo.Usuario"%>
<%@page import="api.modelo.Papel"%>
<%@page import="api.modelo.EnumPapeis"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header
    <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
    <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
    <nav>
        
        <center>
        <p class="formTitulo" id="titulo">
            ALUGUEL DE CARROS
        </p>
        </center>
        
        <ul class="navMenuList">
             
            <li> <a href="<%=request.getContextPath()%>/Reservas.action" class="formLabel"> Gerenciar reservas </a> </li>
            <li> <a href="<%=request.getContextPath()%>/CadastrarCarro.action" class="formLabel"> Cadastrar carro </a> </li>
            <li> <a href="<%=request.getContextPath()%>/CadastrarCliente.action" class="formLabel"> Cadastrar cliente </a> </li>
            <li> <a href="<%=request.getContextPath()%>/VisualizarFrota.action" class="formLabel"> Visualizar frota </a></li>
            <li> <a href="<%=request.getContextPath()%>/ReservarCarro.action" class="formLabel"> Reservar carro </a></li>
            
            <li> <a href="${pageContext.request.contextPath}" class="formLabel">Sair </a></li>
        </ul>
    </nav>
</header>
