package fr.uga.l3miage.tp2.exo1.models;

import fr.uga.l3miage.tp2.exo1.models.DeveloperMiageEntity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@Entity
public class ProjetEntity {

    @Id
    private BigInteger id;

    private String name;

    private String description;

    @ManyToMany
    private Set<DeveloperMiageEntity> developersMiage;


}
