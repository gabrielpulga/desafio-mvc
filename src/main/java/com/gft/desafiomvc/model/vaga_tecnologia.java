package com.gft.desafiomvc.model;

import java.math.BigInteger;

public class vaga_tecnologia {

    private BigInteger vagas_id;
    private BigInteger tecnologia_id;

    public BigInteger getVagas_id() {
        return vagas_id;
    }

    public void setVagas_id(BigInteger vagas_id) {
        this.vagas_id = vagas_id;
    }

    public BigInteger getTecnologia_id() {
        return tecnologia_id;
    }

    public void setTecnologia_id(BigInteger tecnologia_id) {
        this.tecnologia_id = tecnologia_id;
    }
}
