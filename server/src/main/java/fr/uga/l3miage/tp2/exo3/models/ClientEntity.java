package fr.uga.l3miage.tp2.exo3.models;


import javax.persistence.*;
import java.util.Set;

@Entity
class ClientEntity{
    @Id
    private Long id ;
    private String nom;

    private String email;
    //relation One to Many avec CommandeEntity
    @OneToMany(mappedBy = "clientEntity")
    private Set<CommandeEntity> commandes ;

    // relation OneToOne avec AdresseEntity
    @OneToOne(mappedBy = "client")
    private AdresseEntity adresse;
}