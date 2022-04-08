package com.example.gestionpartenaires.service;

import com.example.gestionpartenaires.model.Entreprise;
import com.example.gestionpartenaires.model.Partenaire;
import com.example.gestionpartenaires.repository.EntrepriseRepository;
import com.example.gestionpartenaires.repository.PartenaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartenaireService {
    @Autowired
    PartenaireRepository partenaireRepository;
    @Autowired
    EntrepriseRepository entrepriseRepository;

    public ResponseEntity<Partenaire> savePartenaire (Partenaire partenaire){
        try {
            partenaireRepository.save(partenaire);
            System.out.println("creation partenaire");
            return new ResponseEntity<>(partenaire, HttpStatus.CREATED);
        } catch (Exception e){
            System.out.println("error en save " + e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Partenaire> getAllPartenaire() {
        return partenaireRepository.findAll();
    }

    public List<Entreprise> getAllEntreprise() {
        return entrepriseRepository.findAll();
    }

    public void deletePartenaire (Long id){

        partenaireRepository.deleteById(id);
    }

    public ResponseEntity<Entreprise> saveE (Entreprise en){
        try {
            entrepriseRepository.save(en);

            System.out.println("creation entreprise");
            return new ResponseEntity<>(en, HttpStatus.CREATED);
        } catch (Exception e){
            System.out.println("error en save " + e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Optional<Partenaire> findPartenaireById(Long id){
        Optional<Partenaire> partenaire = partenaireRepository.findById(id);
        if(partenaire.isPresent()){
            return partenaire;
        }
        else {
            return  null;
        }
    }
    public Partenaire replacePartenaire (Partenaire newPart, Long id){
        return partenaireRepository.findById(id).map(partenaire -> {
            partenaire.setDenomination(newPart.getDenomination());
            partenaire.setLocalisation(newPart.getLocalisation());
            partenaire.setAppartenance(newPart.getAppartenance());
            partenaire.setLogo(newPart.getLogo());
            partenaire.setPays(newPart.getPays());
            partenaire.setPartenariats(newPart.getPartenariats());
            partenaire.setContacts(newPart.getContacts());
            partenaire.setType(newPart.getType());
            return partenaireRepository.save(partenaire);
        })
                .orElseGet(() -> {
                    newPart.setId(id);
                    return partenaireRepository.save(newPart);
                });
    }



}
