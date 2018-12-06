<%-- 
    Document   : Reservas
    Created on : 28/09/2018, 07:47:41
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <!--<link rel="stylesheet" type="text/css" href="static/css/Formularios.css">-->
        <title>Reservas</title>
        
    </head>
    
        <%@include file= "menu.jsp" %>  
          <% 
              String[][] dados = {{"Luxo","2005","FDX1235","C4","Citroen","Preto","Novo","20000","100","Reservado"},
                  {"Popular","2001","ABF3654","Gol","Volkswagen","Verde","Usado","30000","120","Aguardando"}};
                for(int i=0;i<2;i++){
                    out.print(" <form class='formularios' action='AlugarCarro.action' method ='get'> </p><label class='formLabel'>"+
                    "Categoria:"+dados[i][0]+
                "</label>"+
                "</p>"+
                "<label class='formLabel'>"+
                "    Ano:"+dados[i][1]+
                    
                "</label>"+   
                "</p>"+
                
                "<label class='formLabel'>"+
                "    Placa:"+dados[i][2]+
                    
                "</label>"+
                "</p>"+
                "<label class='formLabel'>"+
                "    Modelo:"+dados[i][3]+
                    
                "</label>"+   
                "</p>"+
                
                "<label class='formLabel'>"+
                "    Fabricante:"+dados[i][4]+
                    
                "</label>"+   
                "</p>"+
                
                "<label class='formLabel'>"+
                "    Cor:"+dados[i][5]+
                    
                "</label>"+   
                "</p>"+
                
                "<label class='formLabel'>"+
                "    Estado de conservação:"+dados[i][6]+
                    
                "</label>"+   
                "</p>"+
                
                "<label class='formLabel'>"+
                "    Quilometragem:"+dados[i][7]+
                    
                "</label>"+   
                "</p>"+
                
                "<label class='formLabel'>"+
                "    Tanque de combustível:"+dados[i][8]+
                    
                "</label"+   
                "</p>"+
                        
                "</p><label class='formLabel'>"+
                "    Situação:"+dados[i][9]+
                    
                "</label"+   
                "</p>"+
                "<a href='AlugarCarro.jsp'>" + 
                "</br><input type='submit' class='botao' action='AlugarCarro.action' method='get' value='Alugar'/></a></form>"+
                "<form class='formularios' action='Remover.action' method ='post'>"+
                "</br><a href='Removido.jsp'><input type='submit' class='botao' value='Excluir'/></a>" +
                    "</form>"+
                "<form class='formularios' action='Alterar.action' method ='post'>"+
                "</br><input type='submit' class='botao' value='Alterar'/></a>" +
                    "</form>");
                    
                    
                }
            %>
         
                
                
            </p>
    
</html>
