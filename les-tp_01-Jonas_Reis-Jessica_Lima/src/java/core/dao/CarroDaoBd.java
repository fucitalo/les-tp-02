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
        Carro c;
        List<Carro> lista = new ArrayList<>();
        try{   
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.carro");  
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Dados carregados");
            
            while (rs.next()) {
                c = new Carro();
                c.setCategoria(rs.getString("categoria"));
                c.setAno(rs.getString("ano"));
                c.setModelo(rs.getString("modelo"));                
                c.setFabricante(rs.getString("fabricante"));
                c.setCor(rs.getString("cor"));
                c.setEstado_conservacao(rs.getString("estadoConservacao"));
                c.setQuilometragem(rs.getInt("quilometragem"));
                c.setTanque(rs.getInt("tanque"));
                c.setPlaca(rs.getLong("placa"));
                lista.add(c);
                
            }            
            /*for(Carro c1:lista){
                    System.out.println(c1.getModelo()+"\n"+c1.getFabricante());
            }*/
            comandoSQLp.close();
            rs.close();

            return lista;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de busca por todos\n");
        }
        return lista;
    }

    @Override
    public Carro update(Carro CarroAntigo, Carro carroAtual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long placa) {
        try{              
            String sql = ("delete from web2.carro where placa='"+placa+"'");                    
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
    public Carro findByCategoria(String categoria) {
        Carro c=null;
        try{   
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.carro where categoria='" + categoria + "'");
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Dados carregados");

            rs.next();
            c = new Carro();
            c.setCategoria(rs.getString("categoria"));
            c.setAno(rs.getString("ano"));
            c.setModelo(rs.getString("modelo"));
            c.setFabricante(rs.getString("fabricante"));
            c.setCor(rs.getString("cor"));
            c.setEstado_conservacao(rs.getString("estadoConservacao"));
            c.setQuilometragem(rs.getInt("quilometragem"));
            c.setTanque(rs.getInt("tanque"));
            c.setPlaca(rs.getLong("placa"));
            
            comandoSQLp.close();
            rs.close();

            return c;
        } catch (Exception e) {
            System.out.print("\nErro de busca por categoria\n");
        }
        return c;
    
    }

    @Override
    public Carro findByPlaca(long placa) {
      Carro c=null;
        try{   
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from web2.carro where placa='" + placa + "'");
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Dados carregados");

            rs.next();
            c = new Carro();
            c.setCategoria(rs.getString("categoria"));
            c.setAno(rs.getString("ano"));
            c.setModelo(rs.getString("modelo"));
            c.setFabricante(rs.getString("fabricante"));
            c.setCor(rs.getString("cor"));
            c.setEstado_conservacao(rs.getString("estadoConservacao"));
            c.setQuilometragem(rs.getInt("quilometragem"));
            c.setTanque(rs.getInt("tanque"));
            c.setPlaca(rs.getLong("placa"));
            
            comandoSQLp.close();
            rs.close();

            return c;
        } catch (Exception e) {
            System.out.print("\nErro de busca por placa\n");
        }
        return c;
     
    }
    
}
