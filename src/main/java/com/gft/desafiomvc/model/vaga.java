package com.gft.desafiomvc.model;

import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Date;

public class vaga {

    private BigInteger id;
    private DateFormat abertura_vaga;
    private String codigo_vaga;
    private String descricao_vaga;
    private String projeto;
    private int qtd_vaga;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public DateFormat getAbertura_vaga() {
        return abertura_vaga;
    }

    public void setAbertura_vaga(DateFormat abertura_vaga) {
        this.abertura_vaga = abertura_vaga;
    }

    public String getCodigo_vaga() {
        return codigo_vaga;
    }

    public void setCodigo_vaga(String codigo_vaga) {
        this.codigo_vaga = codigo_vaga;
    }

    public String getDescricao_vaga() {
        return descricao_vaga;
    }

    public void setDescricao_vaga(String descricao_vaga) {
        this.descricao_vaga = descricao_vaga;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public int getQtd_vaga() {
        return qtd_vaga;
    }

    public void setQtd_vaga(int qtd_vaga) {
        this.qtd_vaga = qtd_vaga;
    }
}
