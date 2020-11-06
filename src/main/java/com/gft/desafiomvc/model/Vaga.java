package com.gft.desafiomvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @NotNull(message = "Data de abertura não pode ser nula.")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date abertura_vaga;

    private String codigo_vaga;

    @NotBlank(message = "Favor descrição da vaga.")
    private String descricao_vaga;

    @NotBlank(message = "Favor preencher o campo do projeto.")
    private String projeto;

    @NotNull(message = "Quantidade de vagas não pode ser nula.")
    private int qtd_vaga;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getAbertura_vaga() {
        return abertura_vaga;
    }

    public void setAbertura_vaga(Date abertura_vaga) {
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
