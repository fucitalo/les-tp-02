/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.DAO;

import api.DAO.CarroDao;
import api.modelo.Carro;
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
public class CarroDaoBd implements CarroDao{
    Connection conexao;

    public CarroDaoBd() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
           
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web2","admin","admin"); 
            System.out.println("Conectado com sucesso\n");
        } catch (Exception e){
            System.out.print("Erro de conexão ao banco.\n");
        }
    }
       
    
    @Override
    public void insert(Carro carro) {
        try{    
            
            String sql = ("insert into web2.carro(categoria, ano, modelo, fabricante, cor, estadoConservacao, quilometragem, tanque, placa) "+
                    "values('"+carro.getCategoria() +"','"+carro.getAno()+"','"+carro.getModelo()+"','"+carro.getFabricante()+"','"+carro.getCor()+
                    "','"+carro.getEstado_conservacao()+"','"+carro.getQuilometragem()+"','"+carro.getTanque()+"','"+carro.getPlaca()+"')");                    
            PreparedStatement comandoSQLp = conexao.prepareStatement(sql);
            comandoSQLp.executeUpdate(sql);
            System.out.println("Conectado");
            //rs.next();
            //comandoSQLp.setInt(0, 0);
            /*comandoSQLp.setString(0, carro.getCategoria());
            comandoSQLp.setString(1, carro.getAno());
            comandoSQLp.setString(2, carro.getModelo());
            comandoSQLp.setString(3, carro.getFabricante());
            comandoSQLp.setString(4, carro.getCor());
            comandoSQLp.setString(5, carro.getEstado_conservacao());
            comandoSQLp.setInt(6, carro.getQuilometragem());
            comandoSQLp.setInt(7, carro.getTanque());
            comandoSQLp.setLong(8, carro.getPlaca());  */      
                           
            comandoSQLp.close();
            //rs.close();
        }
        catch (Exception e)
        {
            System.out.print("\nErro de inserção\n");
        } 
        
    }

    @Override
    public Carro findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carro findByNomeCarro(String nomeCarro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Carro> findAll() {
        Carro c = null;
        List<Carro> lista = new ArrayList<Carro>();
        try{   
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.carro");  
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Dados carregados");
            
            while (rs.next()) {
                c = new Carro();
                c.setCategoria(rs.getString(0));
                c.setAno(rs.getString(1));
                c.setModelo(rs.getString(2));                
                c.setFabricante(rs.getString(3));
                c.setCor(rs.getString(4));
                c.setEstado_conservacao(rs.getString(5));
                c.setQuilometragem(rs.getInt(6));
                c.setTanque(rs.getInt(7));
                c.setPlaca(rs.getLong(8));
                lista.add(c);
                for(Carro c1:lista){
                    System.out.println(c1.getModelo()+"\n"+c1.getFabricante());
                }
            }            
           
            comandoSQLp.close();
            rs.close();

            return lista;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de busca por usuário\n");
        }
        return lista;
    }

    @Override
    public Carro update(Carro CarroAntigo, Carro carroAtual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Carro carro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
