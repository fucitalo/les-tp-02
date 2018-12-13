<%-- 
    Document   : AlugarCarro
    Created on : 28/09/2018, 08:17:49
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alugar</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %>  
          <% 
              String[][] dados = {{"Popular","2001","ABF3654","Gol","Volkswagen","Verde","Usado","30000","120",
                  "10:00","13:00","150,00","54,00","Ana","20321585657","B","103"}};
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
                "</p></br></p>"+
                       
                "<label class='formLabel'>"+
                "    Hora de início:"+dados[i][9]+
                    
                "</label"+   
                "</p></br></p>"+
                        
                "<label class='formLabel'>"+
                "    Hora de término:"+dados[i][10]+
                    
                "</label"+   
                "</p></br></p>"+
                       
                "<label class='formLabel'>"+
                "    Valor total:"+dados[i][11]+
                    
                "</label"+   
                "</p></br></p>"+
                        
                "</p><label class='formLabel'>"+
                "    Valor antecipado:"+dados[i][12]+
                    
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
                        
                "</p><label class='formLabel'>"+
                "    Código:"+dados[i][16]+
                    
                "</label"+   
                "</br></br>"+
                
                "<a href='Alugado.jsp'><input type='submit' value='Alugar'/></a>"+
                "<a href='ReceberCarro.jsp'><input type='submit' value='Receber'/></a>"
                    );
                    
                    
                }
            %>
    </body>
</html>
