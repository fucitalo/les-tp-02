package web.servlet;

import api.modelo.Carro;
import api.servico.ServicoCarro;
import core.servico.ServicoC;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@WebServlet(name = "Alterado", urlPatterns = {"/Alterado"})
public class Alterado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep)
            throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        String placa = req.getParameter("placa"); 
        String categoria = req.getParameter("categoria");
        String ano = req.getParameter("ano");
        String modelo = req.getParameter("modelo");
        String fabricante = req.getParameter("fabricante");
        String cor = req.getParameter("cor");
        String estadoConservacao = req.getParameter("estadoConservacao");
        String quilometragem = req.getParameter("quilometragem");
        String tanque = req.getParameter("tanque");
        System.out.println(placa+categoria+tanque);
        Carro c = new Carro(categoria, ano, modelo, fabricante, cor, estadoConservacao, Integer.parseInt(quilometragem), 
                Integer.parseInt(tanque), Long.parseLong(placa));
        ServicoCarro servicoCarro = new ServicoC();
        servicoCarro.update(placa,c);
       
        try{
        context.getRequestDispatcher("/dynamic/jsp/Alterado.jsp").forward(req, rep);            
        } catch (Exception e){}
    }
}
