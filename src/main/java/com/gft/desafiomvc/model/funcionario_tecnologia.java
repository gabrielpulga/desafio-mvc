package com.gft.desafiomvc.model;

import java.math.BigInteger;

public class funcionario_tecnologia {

    private BigInteger funcionarios_id;
    private BigInteger tecnologia_id;

    public BigInteger getFuncionarios_id() {
        return funcionarios_id;
    }

    public void setFuncionarios_id(BigInteger funcionarios_id) {
        this.funcionarios_id = funcionarios_id;
    }

    public BigInteger getTecnologia_id() {
        return tecnologia_id;
    }

    public void setTecnologia_id(BigInteger tecnologia_id) {
        this.tecnologia_id = tecnologia_id;
    }
}
