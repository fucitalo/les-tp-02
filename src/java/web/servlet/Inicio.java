/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonas
 */
//@WebServlet(name = "Inicio", urlPatterns = {"/Inicio"})
public class Inicio extends HttpServlet {
 @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){      
        ServletContext context = req.getServletContext();
        try{
        context.getRequestDispatcher("/dynamic/jsp/inicio.jsp").forward(req, resp);            
        } catch (Exception e){}
    }
}
