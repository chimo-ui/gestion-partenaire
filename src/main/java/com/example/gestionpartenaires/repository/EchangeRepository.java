package com.example.gestionpartenaires.repository;

import com.example.gestionpartenaires.model.Echange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EchangeRepository extends JpaRepository<Echange, Long> {
}
