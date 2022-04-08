package com.example.gestionpartenaires.model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "partenariat")
public class Partenariat {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @NotBlank
        private String objet;
        @NotBlank
        private Date date_signature;
        @NotBlank
        private String duree_fixe;
        @NotBlank
        private String duree_estime;
        @NotBlank
        @OneToOne
        TypePartenariat type;
        @OneToMany(targetEntity = Echange.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
        @JoinColumn(name = "partenariat_id" , referencedColumnName = "id")
        private List<Echange> echanges;

    }


