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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value  = Projet.class, name = "pro"),
        @JsonSubTypes.Type(value  = Accords.class, name = "acc"),
        @JsonSubTypes.Type(value  = Engagement.class, name = "eng"),
})
public abstract class TypePartenariat {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
}
