/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;
import java.util.List;
/**
 *
 * @author Aluno
 */
public class Usuario extends Identificador{
    private Long id;
    private String nome;
    private String senha;
    private String nomeUsuario;
    private String email;
    private String papeis;
    
    public Usuario(){}
    public Usuario(Long id, String nome, String senha,
                   String nomeUsuario, String email,
                   String papeis){
        super(id);
        this.setNome(nome);
        this.setSenha(senha);
        this.setNomeUsuario(nomeUsuario);
        this.setEmail(email);
        this.setPapeis(papeis);               
    }

    public Usuario(String usuario, String senha) {
        this.setNomeUsuario(usuario);
        this.setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPapeis() {
        return papeis;
    }

    public void setPapeis(String papeis) {
        this.papeis = papeis;
    }
    
    
}
