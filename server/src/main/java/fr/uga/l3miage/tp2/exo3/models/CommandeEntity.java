package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
class CommandeEntity {
    @Id
    private Long id ;
    private String nom;
    private double prix;
    private int quantite;

    // relation avec ClientEntity
    @ManyToOne
    private ClientEntity client;

    // relation avec ProduitEntity
    @OneToMany
    private Set<ProduitEntity> produits;

}