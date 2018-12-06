
import api.servico.ServicoCarro;
import core.servico.ServicoC;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Alterado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep)
            throws ServletException, IOException {

        ServletContext context = req.getServletContext();
        long placa = Long.parseLong(req.getParameter("placa"));
        ServicoCarro servicoCarro = new ServicoC();
        servicoCarro.delete(placa);
       
        try{
        context.getRequestDispatcher("/dynamic/jsp/Alterado.jsp").forward(req, rep);            
        } catch (Exception e){}
    }
}
