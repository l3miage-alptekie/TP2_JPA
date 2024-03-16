package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.lang.Long;
import java.util.Set;

@Entity
public class EtudiantEntity {
    @Id
    private Long agalan;

    private String nom;

    private String email;

    @ManyToMany(mappedBy="etudiants")
    private Set<ClubSportifEntity> clubsSportif;

}
