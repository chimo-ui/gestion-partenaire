package com.example.gestionpartenaires.model;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "projets")
public class Projet extends TypePartenariat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String objet;
    @NotBlank
    private String duree;
    @NotBlank
    private Date date_debut;
    @NotBlank
    private Date date_fin;
    @NotBlank
    private String equipe;
    @NotBlank
    private String chef;

}
