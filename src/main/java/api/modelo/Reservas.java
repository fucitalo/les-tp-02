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
public class Reservas {
    private Long idCarro;
    private Long idAgenda;
    private String horaRetirada;
    private String horaDevolucao;
    private Long valorTotal;
    private Long valorAntecipado;
    private Long valorDevolucao;
    private Long id;

    public Long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Long idCarro) {
        this.idCarro = idCarro;
    }

    public Long getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Long idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(String horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public String getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(String horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getValorAntecipado() {
        return valorAntecipado;
    }

    public void setValorAntecipado(Long valorAntecipado) {
        this.valorAntecipado = valorAntecipado;
    }

    public Long getValorDevolucao() {
        return valorDevolucao;
    }

    public void setValorDevolucao(Long valorDevolucao) {
        this.valorDevolucao = valorDevolucao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
