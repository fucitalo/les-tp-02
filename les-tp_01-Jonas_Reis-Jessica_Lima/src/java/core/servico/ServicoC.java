/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.DAO.CarroDao;
import api.modelo.Carro;
import api.servico.ServicoCarro;
import core.DAO.CarroDaoBd;

/**
 *
 * @author Aluno
 */
public class ServicoC implements ServicoCarro{

    @Override
    public void insert(Carro carro) {
        CarroDao carroDao = new CarroDaoBd();
        carroDao.insert(carro);
    }

    @Override
    public Carro findByNomeCarro(String nomeCarro) {
        CarroDao carroDao = new CarroDaoBd();
        Carro c = carroDao.findByNomeCarro(nomeCarro);
        return c;
    }
    
}
