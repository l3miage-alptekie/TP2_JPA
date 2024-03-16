package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DeveloperMiageEntity {

    @Id
    private String lastname;

    private String firstname;

    private String email;

    @ManyToMany(mappedBy = "developersMiage")
    private Set<ProjetEntity> projets;
}
