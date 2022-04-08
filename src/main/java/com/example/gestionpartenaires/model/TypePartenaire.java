package com.example.gestionpartenaires.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.*;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value  = Organisme.class, name = "org"),
        @JsonSubTypes.Type(value  = Entreprise.class, name = "entr"),
        @JsonSubTypes.Type(value  = Inst_gouvernementale.class, name = "inst"),
})
public abstract class TypePartenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
