package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
class ProduitEntity {
    @Id
    private Long id;
    private String nom;
    private double prix;
    private int quantite;

    // relation oneToOne avec Adresse
    @OneToMany(mappedBy = "produit")
    private Set<CategorieDeProduitEntity> categoriesDeProduit;
}

