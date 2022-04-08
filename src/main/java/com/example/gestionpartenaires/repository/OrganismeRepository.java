package com.example.gestionpartenaires.repository;

import com.example.gestionpartenaires.model.Organisme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganismeRepository extends JpaRepository<Organisme, Long> {
}
