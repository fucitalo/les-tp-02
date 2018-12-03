/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.EnumPapeis;
import api.modelo.Papel;
import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.servico.Servico;
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
//@WebServlet(name = "Cadastrado", urlPatterns = {"/Cadastrado"})
public class Cadastrado extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
         ArrayList<Papel> p = new ArrayList<>();
        p.add(new Papel(Long.MIN_VALUE, EnumPapeis.USUARIO));
        
        ServletContext context = req.getServletContext();
        String nome = req.getParameter("nome");
        String nomeUsuario = req.getParameter("nomeUsuario");
        String senha = req.getParameter("senha");
        String email = req.getParameter("email");
        String cnh = req.getParameter("cnh");
        String catCnh = req.getParameter("catCnh");
        Usuario u = new Usuario(Long.MIN_VALUE, nome, senha, nomeUsuario, email, cnh, catCnh, p);
        ServicoUsuario servicoUsuario = new Servico();
        servicoUsuario.insert(u);
       
        try{
        context.getRequestDispatcher("/dynamic/jsp/Cadastrado.jsp").forward(req, res);            
        } catch (Exception e){}
    }
}
