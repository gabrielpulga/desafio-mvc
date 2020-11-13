package com.gft.desafiomvc.repository;

import com.gft.desafiomvc.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepository extends JpaRepository<Tecnologia, Long> {
}
