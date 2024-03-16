package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class CategorieDeProduit{
    @Id
    private Long id;
    private String nom;

}
