/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.UsuarioPapelDao;
import api.modelo.Papel;
import api.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class UsuarioPapelDaoBd implements UsuarioPapelDao{
     Connection conexao;
    
    public UsuarioPapelDaoBd(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conexao = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/web2","admin", "admin");
            //conexao = DriverManager.getConnection("jdbc:mysql://150.163.17.237:3306/agenda?" +
            //                       "user=usuario&password=usuario123");
        } catch (Exception e){
            System.out.print("Erro de conexão");
        }
    }
    
    @Override
    public List<Long> findByUsuario(Usuario u) {
        List<Long> idPapeis = new ArrayList();
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.AgendaPapel where id = ?");  
            comandoSQLp.setString(1, u.getId().toString());
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()){
             idPapeis.add(rs.getLong(2));
            }
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return idPapeis;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Usuario-Papel");
        }
        return idPapeis;
    }

    @Override
    public List<Long> findByPapel(Papel p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

}
