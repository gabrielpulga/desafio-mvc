package com.gft.desafiomvc.model;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Override
    public String toString() {
        return nome;
    }

    public Tecnologia() {
    }

    public Tecnologia(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
