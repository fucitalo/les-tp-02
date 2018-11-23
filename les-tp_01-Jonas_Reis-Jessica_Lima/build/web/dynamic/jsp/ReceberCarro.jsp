<%-- 
    Document   : ReceberCarro
    Created on : 01/10/2018, 09:42:22
    Author     : Aluno
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Receber carro</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
          <% 
              String[][] dados = {{"Popular","2001","ABF3654","Gol","Volkswagen","Verde","Usado","30000","120",
                  "10:00","13:00","150,00","96,00","Ana","20321585657","B"}};
                for(int i=0;i<1;i++){
                    out.print("</p><label class='formLabel'>"+
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
                "    Hora de início:"+dados[i][9]+
                    
                "</label"+   
                "</p>"+
                        
                "</p><label class='formLabel'>"+
                "    Hora de término:"+dados[i][10]+
                    
                "</label"+   
                "</p>"+
                       
                "</p><label class='formLabel'>"+
                "    Valor total:"+dados[i][11]+
                    
                "</label"+   
                "</p>"+
                        
                "</p><label class='formLabel'>"+
                "    Valor de devolução:"+dados[i][12]+
                    
                "</label"+   
                "</p>"+
                       
                        
                "</p><label class='formLabel'>"+
                "    Nome do cliente:"+dados[i][13]+
                    
                "</label"+   
                "</p>"+
                        
                "</p><label class='formLabel'>"+
                "    CNH:"+dados[i][14]+
                    
                "</label"+   
                "</p>"+
                
                "</p><label class='formLabel'>"+
                "    Categoria da CNH:"+dados[i][15]+
                    
                "</label"+   
                "</p>"+
                
                
                "<a href='Recebido.jsp'><input type='submit' value='Receber'/></a>"
                    );
                    
                    
                }
            %>
    </body>
</html>
