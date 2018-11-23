<%-- 
    Document   : AlugarCarro
    Created on : 21/09/2018, 08:01:16
    Author     : Aluno
--%>

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
              String[][] dados = {{"Compacto","2013","GTD2651","HB20","Hyundai","Prata","Usado","19000","50","Disponível","54,00"}};
                for(int i=0;i<1;i++){
                    out.print("</p><label class='formLabel'>"+
                                 "<select id='select01' name='categoria' size='1'>" +
                        "<option value='ec'>Econômico</option>" +
                        "<option value='co'>Compacto</option>" +
                        "<option value='st'>Standard</option>" +
                        "<option value='lx'>Luxo</option>" +
                        "<option value='mv'>Minivan</option>" +
                        "<option value='su'>SUV</option>" +
                        "<option value='fs'>Full Size</option>" +
                        "<option value='in'>Intermediário</option>" +
                        "<option value='ut'>Utilitário</option>" +
                        "<option value='pr'>Premium</option>" +
                        "<option value='esp'>Especial</option>" +
                        "<option value='van'>Van</option>" +
                    "</select>" +
                "</label>" +
                "</p>" +
                "</p>Categoria:" + dados[i][0]+
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
                    
                "</label>"+   
                "</p>"+
                        
                "</p><label class='formLabel'>"+
                "    Situação:"+dados[i][9]+
                    
                "</label>"+   
                "</p>"+
                        
                "</p><label class='formLabel'>"+
                "    Valor antecipado:"+dados[i][10]+
                    
                "</label>"+ 
                        
                "<a href='Reservado.jsp'><input type='submit' class='botao' value='Reservar'/></a>"
                
                    );
                    
                    
                }
            %>
         
                
                
                </p>
    </body>
</html>
