package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@Entity
class AdresseEntity {

    @Id
    private Long id;
    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

    // relation one to one avec client
    @OneToOne
    private ClientEntity client;

}
