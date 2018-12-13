/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;

import api.modelo.Papel;
import api.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Aluno
 */
public interface UsuarioPapelDao {
    public List<Long> findByUsuario(Usuario u); 
    
    public List<Long> findByPapel(Papel p);
}
