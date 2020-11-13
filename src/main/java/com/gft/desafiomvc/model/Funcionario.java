package com.gft.desafiomvc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Entity
public class Funcionario {

    private boolean alocado;

    @ManyToMany
    private List<Tecnologia> tecnologia;

    @ManyToOne
    private Vaga vaga;

    @ManyToOne
    private Gft gft;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Favor preencher cargo.")
    private String cargo;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Data de início não pode ser nula.")
    private Date inicio_wa;

    @NotBlank(message = "Favor preencher matrícula.")
    private String matricula;

    @NotBlank(message = "Favor preencher nome.")
    private String nome;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @NotNull(message = "Previsão de término não pode ser nula")
    private Date termino_wa;

    public Funcionario() {
    }

    public boolean isAlocado() {
        return alocado;
    }

    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }

    public List<Tecnologia> getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(List<Tecnologia> tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Gft getGft() {
        return gft;
    }

    public void setGft(Gft gft) {
        this.gft = gft;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getInicio_wa() {
        return inicio_wa;
    }

    public void setInicio_wa(Date inicio_wa) {
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

    public Date getTermino_wa() {
        return termino_wa;
    }

    public void setTermino_wa(Date termino_wa) {
        this.termino_wa = termino_wa;
    }

}
