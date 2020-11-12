package com.gft.desafiomvc.repository;

import com.gft.desafiomvc.model.Funcionario;
import com.gft.desafiomvc.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VagasRepository extends JpaRepository<Vaga, Long> {
    public List<Vaga> findVagasByProjetoContaining(String projeto);
    public Vaga findByCodigo(String codigo);

}
