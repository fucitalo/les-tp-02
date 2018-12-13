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
@WebServlet(name = "AlterarCarro", urlPatterns = {"/AlterarCarro"})
public class AlterarCarro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = request.getServletContext();
        ServicoCarro servicoCarro = new ServicoC();
        long placa = Long.parseLong(request.getParameter("placa"));
        Carro carro = servicoCarro.findByPlaca(placa);

        request.setAttribute("categoria", carro.getCategoria());
        request.setAttribute("ano", carro.getAno());
        request.setAttribute("modelo", carro.getModelo());
        request.setAttribute("fabricante", carro.getFabricante());
        request.setAttribute("cor", carro.getCor());
        request.setAttribute("estadoConservacao", carro.getEstado_conservacao());
        request.setAttribute("quilometragem", carro.getQuilometragem());
        request.setAttribute("tanque", carro.getTanque());
        request.setAttribute("placa", carro.getPlaca());

        try {
            context.getRequestDispatcher("/dynamic/jsp/AlterarCarro.jsp").forward(request, response);
        } catch (Exception e) {
        }
    }

}
