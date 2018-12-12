<%-- 
    Document   : AlugarCarro
    Created on : 21/09/2018, 08:01:16
    Author     : Aluno
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="api.modelo.Carro"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <title>Reservar Carro</title>
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
            out.println("<br>"+"<form class='formularios' action='Reservado.action' method ='get'>"+
                "</br><input type='submit' class='botao' value='Reservar'/></a>" +
                    "</form>");
            
            
        }

          %>
         
                
                
                </p>
    </body>
</html>
