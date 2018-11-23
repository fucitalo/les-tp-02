<%-- 
    Document   : ReservaJstl
    Created on : 04/10/2018, 15:44:32
    Author     : jonas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="static/css/Pagina.css">
        <link rel="stylesheet" type="text/css" href="static/css/Fonte.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservas</title>
    </head>
    <body>
        <%@include file= "menu.jsp" %> 
        <form class="baseForm" action="Reservado.action" method="get">
         <c:forEach var="i" begin="1" end="12">
            <select id="select01" name="categoria" size="1">
             <c:choose>
                 <c:when i="1">
                        <option value="ec">Econômico</option>
                 </c:when>
                 <c:when i="2">
                        <option value="co">Compacto</option>
                 </c:when>
                 <c:when i="3">
                        <option value="st">Standard</option>
                 </c:when>
                 <c:when i="4">
                        <option value="lx">Luxo</option>
                 </c:when>
                 <c:when i="5">
                        <option value="mv">Minivan</option>
                 </c:when>
                 <c:when i="6">
                        <option value="suv">SUV</option>
                 </c:when>
                 <c:when i="7">
                        <option value="fs">Full Size</option>
                 </c:when>
                 <c:when i="8">
                        <option value="in">Intermediário</option>
                 </c:when>
                 <c:when i="9">
                        <option value="ut">Utilitário</option>
                 </c:when>
                 <c:when i="10">
                        <option value="pr">Premium</option>
                 </c:when>
                 <c:when i="11">
                        <option value="esp">Especial</option>
                 </c:when>
                 <c:when i="12">
                        <option value="van">Van</option>
                 </c:when>
                         
             </c:choose>
            </select>
         </c:foreach>
                    </br>
                    </br>
                    <label class='formLabel'>Ano:2013</label>
                    </br>
                    </p>
                    <label class='formLabel'>Placa:GTD2651</label>
                    </br>
                    </p>
                    <label class='formLabel'>Modelo:HB20</label>
                    </br>
                    </p>
                    <label class='formLabel'>Fabricante:Hyundai</label>
                    </br>
                    </p>
                    <label class='formLabel'>Cor:Prata</label>
                    </br>
                    </p>
                    <label class='formLabel'>Estado de conservação:Usado</label>
                    </br>
                    </p>
                    <label class='formLabel'>Quilometragem:19000</label>
                    </br>
                    </p>
                    <label class='formLabel'>Tanque de combustível:50</label>
                    </br>
                    </p>
                    <label class='formLabel'>Situação:Disponível</label>
                    </br>
                </p>
                <a href='Reservado.jsp'><input type='submit' class='botao' value='Reservar'/></a>
                </form>
    </body>
</html>
