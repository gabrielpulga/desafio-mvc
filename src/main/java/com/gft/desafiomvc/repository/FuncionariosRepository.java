package com.gft.desafiomvc.repository;

import com.gft.desafiomvc.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionario, Long> {
    public List<Funcionario> findFuncionariosByAlocadoIsTrueAndNomeIsContaining(String nome);
    public List<Funcionario> findFuncionariosByAlocadoIsFalseAndNomeIsContaining(String nome);
    public Funcionario findByMatricula(String matricula);
}