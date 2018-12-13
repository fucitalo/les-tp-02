/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Reservas;
import java.util.List;

/**
 *
 * @author Aluno
 */
public interface ServicoReserva {
    
    public void insert(Reservas reservas);
    public Reservas findById(Long id);
    public List<Reservas> findAll();
    public void delete(Long id);
    public void update(Long id, Reservas r);
}
