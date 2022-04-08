package com.example.gestionpartenaires.model;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inst_gouvernementale")
public class Inst_gouvernementale extends TypePartenaire{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nom;
    @NotBlank
    private String ministere;
}
