/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.servico.Servico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "Autenticar", urlPatterns = {"/Autenticar.action"})
public class Autenticar extends HttpServlet {   
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
        try{
            req.setCharacterEncoding("UTF-8"); 
        }catch(Exception e){} 
        String nomeUsuario = req.getParameter("nomeUsuario");
        String senha = req.getParameter("senha");
        ServicoUsuario servicoUsuario = new Servico();
        Usuario usuarioBD = servicoUsuario.findByNomeUsuario(nomeUsuario);      
        ServletContext context = req.getServletContext();
        if (usuarioBD!= null && usuarioBD.getSenha().equals(senha)){
            try{
                req.setAttribute("usuarioLogado",usuarioBD);
                context.getRequestDispatcher("/dynamic/jsp/inicio.jsp").forward(req, resp); 
            }catch( Exception e){
              
            }            
        }
        else{
            try {
                req.setAttribute("falhaAutenticacao", true);
                context.getRequestDispatcher("/dynamic/jsp/login.jsp").forward(req, resp);
            }catch(Exception e){
            }  
        } 
    }
}
