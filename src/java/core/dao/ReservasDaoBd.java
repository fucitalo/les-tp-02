/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.ReservasDao;
import api.modelo.Reservas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ReservasDaoBd implements ReservasDao {
  Connection conexao;

    public ReservasDaoBd() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
           
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web2","admin","admin"); 
            System.out.println("Conectado com sucesso\n");
        } catch (Exception e){
            System.out.print("Erro de conexão ao banco.\n");
        }
    }

    
    
    @Override
    public void insert(Reservas reservas) {
        try {

            String sql = ("insert into web2.reservas(id, horaRetirada, horaDevolucao, valorTotal, valorAntecipado, valorDevolucao, idCarro, idAgenda) "
                    + "values('" + reservas.getId() + "','" + reservas.getHoraRetirada() + "','" + reservas.getHoraDevolucao()+ "','" + reservas.getValorTotal() + "','" + reservas.getValorAntecipado()+ "','" + 
                    reservas.getValorDevolucao()+ "','" + reservas.getIdCarro()+ "','" + reservas.getIdAgenda() + "')");
            PreparedStatement comandoSQLp = conexao.prepareStatement(sql);
            comandoSQLp.executeUpdate(sql);
            System.out.println("Conectado");

            comandoSQLp.close();
            //rs.close();
        } catch (Exception e) {
            System.out.print("\nErro de inserção\n");
        }
    }

    @Override
    public Reservas findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reservas> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Long id, Reservas r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
