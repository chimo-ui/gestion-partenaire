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
@Table(name = "accords")
public class Accords extends TypePartenariat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String objet;
    @NotBlank
    private String duree;
    @NotBlank
    private Date contrat;
}
