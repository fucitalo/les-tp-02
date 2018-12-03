/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Carro;

/**
 *
 * @author Aluno
 */
public interface ServicoCarro {
    public void insert(Carro carro);
    public Carro findByNomeCarro(String nomeCarro);
}
