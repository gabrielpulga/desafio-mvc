package com.gft.desafiomvc.model;

import java.math.BigInteger;
import java.text.DateFormat;

public class funcionario {

    private BigInteger id;
    private String cargo;
    private DateFormat inicio_wa;
    private String matricula;
    private String nome;
    private DateFormat termino_wa;
    private BigInteger gft_id;
    private BigInteger vaga_id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public DateFormat getInicio_wa() {
        return inicio_wa;
    }

    public void setInicio_wa(DateFormat inicio_wa) {
        this.inicio_wa = inicio_wa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DateFormat getTermino_wa() {
        return termino_wa;
    }

    public void setTermino_wa(DateFormat termino_wa) {
        this.termino_wa = termino_wa;
    }

    public BigInteger getGft_id() {
        return gft_id;
    }

    public void setGft_id(BigInteger gft_id) {
        this.gft_id = gft_id;
    }

    public BigInteger getVaga_id() {
        return vaga_id;
    }

    public void setVaga_id(BigInteger vaga_id) {
        this.vaga_id = vaga_id;
    }
}
