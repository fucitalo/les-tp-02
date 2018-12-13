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
            //System.out.println("Conectado com sucesso\n");
        } catch (Exception e){
            System.out.print("Erro de conexão ao banco.\n");
        }
    }
    
    public void insert(Usuario usuario) {
       try{
           System.out.println(usuario.getNome() +"','"+usuario.getSenha()+"','"+usuario.getNomeUsuario()+"','"+
                    "','"+usuario.getEmail()+"','"+usuario.getCnh()+"','"+usuario.getCategoriaCnh()+"','1')");
            String sql = ("insert into web2.agenda(nome, senha, nomeUsuario, email, cnh, categoriaCnh, idPapel) "+
                    "values('"+usuario.getNome() +"','"+usuario.getSenha()+"','"+usuario.getNomeUsuario()+"','"+
                    usuario.getEmail()+"','"+usuario.getCnh()+"','"+usuario.getCategoriaCnh()+"','2')");                    
            PreparedStatement comandoSQLp = conexao.prepareStatement(sql);
            comandoSQLp.executeUpdate(sql);
            System.out.println("Conectado");
                
            comandoSQLp.close();
            //rs.close();
        }
        catch (Exception e)
        {
            System.out.print("\nErro de inserção\n");
        } 
        
    }

    @Override
    public Usuario findById(Long id) {
        Usuario u = null;
        try{                
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.agenda where id = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectado");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNome(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNomeUsuario(rs.getString(4));
            u.setEmail(rs.getString(5));
           // u.setPapeis(rs.getString(6));

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
            u.setNome(rs.getString(2));
            u.setSenha(rs.getString(3));
            u.setNomeUsuario(rs.getString(4));
            u.setEmail(rs.getString(5));
           // u.setPapeis(rs.getString(6));
           
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
