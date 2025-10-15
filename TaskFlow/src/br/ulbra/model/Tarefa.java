/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;
import java.util.Date;
public class Tarefa {
    private int id_tarefa;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String status;
    private Date prazo;
    private Usuario usuario;
    private java.sql.Date prazoSql;

    public Tarefa(){
        
        
    }

    public java.sql.Date getPrazoSql() {
        return prazoSql;
    }
    
    public Tarefa(int id_tarefa, String titulo, String descricao, String prioridade, String status, Date prazo, Usuario usuario) {
        this.prazoSql = new java.sql.Date(prazoSql.getTime());
        this.id_tarefa = id_tarefa;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
        this.prazo = prazo;
        this.usuario = usuario;
        this.prazoSql = new java.sql.Date(prazoSql.getTime());
    }

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id_tarefa=" + id_tarefa + ", titulo=" + titulo + ", descricao=" + descricao + ", prioridade=" + prioridade + ", status=" + status + ", prazo=" + prazo + ", usuario=" + usuario + '}';
    }
    
    
    
}
