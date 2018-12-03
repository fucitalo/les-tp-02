/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.DAO;

import api.DAO.UsuarioDao;
import api.modelo.Papel;
import api.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

/**
 *
 * @author Aluno
 */
public class UsuarioDaoBd implements UsuarioDao{
    Connection conexao;
    
    public UsuarioDaoBd(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
           
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web2","admin","admin"); 
            System.out.println("Conectado com sucesso\n");
        } catch (Exception e){
            System.out.print("Erro de conexão ao banco.\n");
        }
    }
    
    public Usuario insert(Usuario usuario) {
       try{
            String sql = ("insert into agenda (nome, senha, nomeUsuario, email, cnh, categoriaCnh, idPapeis) "+
                    "values(?,?,?,?,?,?,?)");                    
            PreparedStatement comandoSQLp = conexao.prepareStatement(sql);
            //comandoSQLp.setInt(0, 0);
            comandoSQLp.setString(1, usuario.getNome());
            comandoSQLp.setString(2, usuario.getSenha());
            comandoSQLp.setString(3, usuario.getNomeUsuario());
            comandoSQLp.setString(4, usuario.getEmail());
            comandoSQLp.setString(5, usuario.getCnh());
            comandoSQLp.setString(6, usuario.getCategoriaCnh());
            comandoSQLp.setLong(7, 1);         
            
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();   
            comandoSQLp.close();
            rs.close();
        }
        catch (Exception e)
        {
            System.out.print("\nErro de inserção\n");
        }
          
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return usuario;
    }

    @Override
    public Usuario findById(Long id) {
        Usuario u = null;
        try{                
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.agenda where id = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNomeUsuario(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNome(rs.getString(4));
            u.setEmail(rs.getString(5));
            u.setCnh(rs.getString(6));
            u.setCategoriaCnh(rs.getString(7));
            
            comandoSQLp.close();
            rs.close();
            
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de busca por id\n");
        }
        return u;
    }

    @Override
    public Usuario findByNomeUsuario(String nomeUsuario){
        Usuario u = null;
        try{   
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.agenda where nomeUsuario = ?");  
            comandoSQLp.setString(1, nomeUsuario);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectado...");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNomeUsuario(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNome(rs.getString(4));
            u.setEmail(rs.getString(5));   
            u.setCnh(rs.getString(6));
            u.setCategoriaCnh(rs.getString(7));         
            
            comandoSQLp.close();
            rs.close();
            
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de busca por usuário\n");
        }
        return u;
    }
    
    @Override
    public Usuario findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario update(Usuario usuarioAnt, Usuario usuarioAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
