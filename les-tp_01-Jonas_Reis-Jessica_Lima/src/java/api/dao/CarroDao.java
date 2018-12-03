/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.DAO;

import api.modelo.Carro;
import java.util.List;

/**
 *
 * @author Aluno
 */
public interface CarroDao {
    public void insert(Carro carro);
    public Carro findById(Long id);
    public Carro findByNomeCarro(String nomeCarro);
    public List<Carro> findAll();
    public Carro update(Carro CarroAntigo, Carro carroAtual);
    public boolean delete(Carro carro);
    public boolean delete(Long id);
}
