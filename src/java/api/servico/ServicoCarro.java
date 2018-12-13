/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Carro;
import java.util.List;

/**
 *
 * @author Aluno
 */
public interface ServicoCarro {
    public void insert(Carro carro);
    public Carro findByNomeCarro(String nomeCarro);
    public Carro findByCategoria(String categoria);
    public Carro findByPlaca(long placa);
    public List<Carro> findAll();
    public void delete(Long placa);
    public void update(String placa, Carro carroAtual);
}
