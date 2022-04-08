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
@Table(name = "echanges")
public class Echange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String sujet;
    @NotBlank
    private String type_courrier;
    @NotBlank
    private Date date_echange;

}
