package fr.uga.l3miage.tp2.exo3.models;


import javax.persistence.*;

@Entity
class CategorieDeProduitEntity{
    @Id
    private Long id;
    private String nom;

    @ManyToOne
    private ProduitEntity produit;

}
