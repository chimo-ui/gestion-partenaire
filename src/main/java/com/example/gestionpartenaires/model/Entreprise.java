package com.example.gestionpartenaires.model;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "entreprises")
@JsonTypeName("entr")
public class Entreprise extends TypePartenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nom;
    @NotBlank
    private String adresse;
    @NotBlank
    private String activite;
    @NotBlank
    private String domaine;
}
