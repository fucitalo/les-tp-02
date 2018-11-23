/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.DAO;

import api.modelo.Usuario;
import java.util.List;
/**
 *
 * @author Aluno
 */
public interface UsuarioDao {
    public Usuario insert(Usuario usuario);
    public Usuario findById(Long id);
    public Usuario findByNomeUsuario(String nomeUsuario);
    public Usuario findByName(String name);
    public List<Usuario> findAll();
    public Usuario update(Usuario usuarioAntigo, Usuario usuarioAtual);
    public boolean delete(Usuario usuario);
    public boolean delete(Long id); 
}
