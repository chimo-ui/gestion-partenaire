package com.example.gestionpartenaires.repository;

import com.example.gestionpartenaires.model.Accords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccordsRepository extends JpaRepository<Accords, Long> {
}
