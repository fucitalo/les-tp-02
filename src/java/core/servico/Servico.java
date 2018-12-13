/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;



import api.DAO.UsuarioDao;
import api.modelo.Papel;
import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.DAO.UsuarioDaoBd;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Servico implements ServicoUsuario{
    @Override
    public void insert(Usuario usuario) {
        UsuarioDao usuarioDao = new UsuarioDaoBd();
        usuarioDao.insert(usuario);
    }

    @Override
    public Usuario findByNomeUsuario(String nomeUsuario) {
        UsuarioDao usuarioDao = new UsuarioDaoBd();
        Usuario u = usuarioDao.findByNomeUsuario(nomeUsuario);
        return u;
    }


}
