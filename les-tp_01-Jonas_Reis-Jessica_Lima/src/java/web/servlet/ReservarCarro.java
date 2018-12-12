/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Carro;
import api.servico.ServicoCarro;
import core.servico.ServicoC;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "ReservarCarro", urlPatterns = {"/ReservarCarro"})
public class ReservarCarro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = request.getServletContext();
         ServicoCarro servicoCarro = new ServicoC();
         List<Carro> carro = servicoCarro.findAll();
         List<String> categoria = new ArrayList<>();
         for(int i=0;i<carro.size();i++){
            //categoria.add(carro.get(i).getCategoria());
            request.setAttribute("categoria", carro.get(i).getCategoria());
            request.setAttribute("ano", carro.get(i).getAno());
            request.setAttribute("modelo", carro.get(i).getModelo());
            request.setAttribute("fabricante", carro.get(i).getFabricante());
            request.setAttribute("cor", carro.get(i).getCor());
            request.setAttribute("estadoConservacao", carro.get(i).getEstado_conservacao());
            request.setAttribute("quilometragem", carro.get(i).getQuilometragem());
            request.setAttribute("tanque", carro.get(i).getTanque());
            request.setAttribute("placa", carro.get(i).getPlaca());  
         }
                     request.setAttribute("carro", (List)carro);
        try{
        context.getRequestDispatcher("/dynamic/jsp/ReservarCarro.jsp").forward(request, response);            
        } catch (Exception e){}
    }


}
