package com.gft.desafiomvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
public class Vaga {

    @ManyToMany
    private List<Tecnologia> tecnologia;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Data de abertura não pode ser nula.")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date abertura_vaga;

    @NotBlank(message = "Favor preencher o código da vaga.")
    private String codigo;

    @NotBlank(message = "Favor prencher descrição da vaga.")
    private String descricao_vaga;

    @NotBlank(message = "Favor preencher o campo do projeto.")
    private String projeto;

    @NotNull(message = "Quantidade de vagas não pode ser nula.")
    private int qtdVaga;

    public Vaga() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAbertura_vaga() {
        return abertura_vaga;
    }

    public void setAbertura_vaga(Date abertura_vaga) {
        this.abertura_vaga = abertura_vaga;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public List<Tecnologia> getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(List<Tecnologia> tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getQtdVaga() {
        return qtdVaga;
    }

    public void setQtdVaga(int qtdVaga) {
        this.qtdVaga = qtdVaga;
    }
}
