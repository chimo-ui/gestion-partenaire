package com.example.gestionpartenaires.repository;

import com.example.gestionpartenaires.model.Engagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngagementRpository extends JpaRepository<Engagement, Long> {
}
