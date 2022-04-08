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
@Table(name = "engagement")
public class Engagement extends TypePartenariat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String sujet;
    @NotBlank
    private Date date_signature;
    @NotBlank
    private String responsable;
}
