<%-- 
    Document   : VisualizarFrota
    Created on : 21/09/2018, 07:54:43
    Author     : Aluno
--%>

<%@page import="api.modelo.Carro"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <title>Visualizar Frota</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
    <%--/*<c:forEach var="carro" items="${carro}">
        <li>
            <c:out value='${carro.categoria}'><c/out>
        </li> 
    </c:forEach>*/--%>

    <%
        //List<String> categoria = new ArrayList<>();
        String categoria = (String) request.getAttribute("categoria");
        String ano = (String) request.getAttribute("ano");
        long placa = (long) request.getAttribute("placa");
        String modelo = (String) request.getAttribute("modelo");
        String fabricante = (String) request.getAttribute("fabricante");
        String cor = (String) request.getAttribute("cor");
        String estadoConservacao = (String) request.getAttribute("estadoConservacao");
        int quilometragem = (int) request.getAttribute("quilometragem");
        int tanque = (int) request.getAttribute("tanque");

        //categoria = ((ArrayList<String>)request.getAttribute("categoria"));
         List<Carro> carro =   new ArrayList<Carro>();
        carro = ((ArrayList<Carro>)request.getAttribute("carro"));
        for(Carro c:carro){
            out.println("Categoria: "+c.getCategoria()+"<br>");
            out.println("Ano: "+c.getAno()+"<br>");
            out.println("Placa: "+c.getPlaca()+"<br>");
            out.println("Modelo: "+c.getModelo()+"<br>");
            out.println("Fabricante: "+c.getFabricante()+"<br>");
            out.println("Cor: "+c.getCor()+"<br>");
            out.println("Estado de conservação: "+c.getEstado_conservacao()+"<br>");
            out.println("Quilometragem: "+c.getQuilometragem()+"<br>");
            out.println("Tanque: "+c.getTanque()+"<br>");
            out.println("<br>");
        }
        /*for (int i = 0; i < 2; i++) {
            //categoria.add((String) request.getAttribute("categoria"));
            out.print("</p><label class='formLabel'>"
                    + "</p>Categoria:" + categoria
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Ano:" + ano
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Placa:" + placa
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Modelo:" + modelo
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Fabricante:" + fabricante
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Cor:" + cor
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Estado de conservação:" + estadoConservacao
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Quilometragem:" + quilometragem
                    + "</label>"
                    + "</p>"
                    + "<label class='formLabel'>"
                    + "    Tanque de combustível:" + tanque
                    + "</label>"
                    + "</p>"
                    + "</p><label class='formLabel'>"
                    + "    Situação:"
                    +//dados[i][9]+
                    "</label>"
                    + "</p><br>"
            )

        }*/
    %>



</p>
</body>
</html>
