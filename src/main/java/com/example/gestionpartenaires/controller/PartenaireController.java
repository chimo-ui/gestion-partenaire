package com.example.gestionpartenaires.controller;

import com.example.gestionpartenaires.model.Entreprise;
import com.example.gestionpartenaires.model.Partenaire;
import com.example.gestionpartenaires.service.PartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class PartenaireController {
    @Autowired
    PartenaireService partenaireService;

    @PostMapping("/ajouterP")
    public ResponseEntity<Partenaire> ajouterPartenaire(@RequestBody Partenaire partenaire){
        return partenaireService.savePartenaire(partenaire);
    }
    @PostMapping("/ajouterE")
    public ResponseEntity<Entreprise> ajouterPartenaire(@RequestBody Entreprise e){
        return partenaireService.saveE(e);
    }
    @GetMapping("/entreprises")
    List<Entreprise> findAllEntreprise ()
    {
        return partenaireService.getAllEntreprise();
    }
    @GetMapping("/partenaires")
    List<Partenaire> findAllPartenaire ()
    {
        return partenaireService.getAllPartenaire();
    }
    @DeleteMapping("/partenaire/{id}")
    void deletePartenaire (@PathVariable Long id){
        partenaireService.deletePartenaire(id);
    }

    @GetMapping("/partenaire/{id}")
    public Optional<Partenaire> findOnePartenaire(@PathVariable Long id){
        return partenaireService.findPartenaireById(id);
    }

    @PutMapping("/partenaire/{id}")
    Partenaire replacePrsnMorale(@RequestBody Partenaire newPartenaire, @PathVariable Long id){
        return partenaireService.replacePartenaire(newPartenaire,id);
    }
}
