/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandrauss;

/**
 *
 * @author Fernando
 */
public class Produto {
    
    private String codigo;
    private String descricao;
    private Double valor;

    public Produto() {
    }

    public Produto(String codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
            
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
