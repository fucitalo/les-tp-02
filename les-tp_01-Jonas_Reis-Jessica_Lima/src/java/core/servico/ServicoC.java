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
import java.util.List;

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

    @Override
    public List<Carro> findAll() {
        CarroDao carroDao = new CarroDaoBd();
        List<Carro> c = carroDao.findAll();
        return c;
    }

    @Override
    public Carro findByCategoria(String categoria) {
        CarroDao carroDao = new CarroDaoBd();
        Carro c = carroDao.findByCategoria(categoria);
        return c;    
    }

    @Override
    public void delete(Long placa) {
        CarroDao carroDao = new CarroDaoBd();
        carroDao.delete(placa);
        
    }

    @Override
    public Carro findByPlaca(long placa) {
        CarroDao carroDao = new CarroDaoBd();
        Carro c = carroDao.findByPlaca(placa);
        return c;
    }

    @Override
    public void update(String placa, Carro carroAtual) {
        CarroDao carroDao = new CarroDaoBd();
        carroDao.update(placa, carroAtual);
    }
    
}
