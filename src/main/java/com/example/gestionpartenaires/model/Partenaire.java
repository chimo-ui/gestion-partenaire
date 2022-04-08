package com.example.gestionpartenaires.model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partenaires")
public class Partenaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String denomination;
    @NotBlank
    private String localisation;
    @NotBlank
    private String pays;
    @NotBlank
    private String logo;
    @NotBlank
    private String appartenance;

    @OneToOne
    TypePartenaire type;
    @OneToMany(targetEntity = Contact.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "partenaire_id" , referencedColumnName = "id")
    private List<Contact> contacts;
    @OneToMany(targetEntity = Partenariat.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "partenaire_id" , referencedColumnName = "id")
    private List<Partenariat> partenariats;
}
