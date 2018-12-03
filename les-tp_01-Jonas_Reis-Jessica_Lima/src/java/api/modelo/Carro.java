/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String categoria;
    private String ano;
    private String modelo;
    private String fabricante;
    private String cor;
    private String estado_conservacao;
    private int quilometragem;
    private int tanque;
    private Long placa;

    public Carro(){};
    public Carro(String categoria, String ano, String modelo, String fabricante, String cor, String estado_conservacao, int quilometragem, int tanque, Long placa) {
        this.categoria = categoria;
        this.ano = ano;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.estado_conservacao = estado_conservacao;
        this.quilometragem = quilometragem;
        this.tanque = tanque;
        this.placa = placa;
    }

    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstado_conservacao() {
        return estado_conservacao;
    }

    public void setEstado_conservacao(String estado_conservacao) {
        this.estado_conservacao = estado_conservacao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public Long getPlaca() {
        return placa;
    }

    public void setPlaca(Long placa) {
        this.placa = placa;
    }
    
    
    
}
