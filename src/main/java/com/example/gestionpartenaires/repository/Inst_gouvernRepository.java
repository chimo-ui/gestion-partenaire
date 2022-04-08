package com.example.gestionpartenaires.repository;
import com.example.gestionpartenaires.model.Inst_gouvernementale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Inst_gouvernRepository extends JpaRepository<Inst_gouvernementale, Long> {
}
