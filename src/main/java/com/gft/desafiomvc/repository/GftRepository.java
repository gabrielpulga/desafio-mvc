package com.gft.desafiomvc.repository;

import com.gft.desafiomvc.model.Gft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GftRepository extends JpaRepository<Gft, Long> {
}
