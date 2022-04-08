package com.example.gestionpartenaires.repository;
import com.example.gestionpartenaires.model.Partenariat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartenariatRepository extends JpaRepository<Partenariat, Long> {
}
