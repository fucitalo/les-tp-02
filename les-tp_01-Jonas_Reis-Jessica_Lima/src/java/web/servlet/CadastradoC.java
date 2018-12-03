/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Carro;
import api.modelo.EnumPapeis;
import api.modelo.Papel;
import api.modelo.Usuario;
import api.servico.ServicoCarro;
import api.servico.ServicoUsuario;
import core.servico.Servico;
import core.servico.ServicoC;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "CadastradoC", urlPatterns = {"/CadastradoC"})
public class CadastradoC extends HttpServlet {
 protected void doPost(HttpServletRequest req, HttpServletResponse res)
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
        Carro c = new Carro(categoria, ano, modelo, fabricante, cor, estadoConservacao, Integer.parseInt(quilometragem), 
                Integer.parseInt(tanque), Long.parseLong(placa));
        ServicoCarro servicoCarro = new ServicoC();
        servicoCarro.insert(c);
       
        try{
        context.getRequestDispatcher("/dynamic/jsp/CadastradoC.jsp").forward(req, res);            
        } catch (Exception e){}
    }
}
