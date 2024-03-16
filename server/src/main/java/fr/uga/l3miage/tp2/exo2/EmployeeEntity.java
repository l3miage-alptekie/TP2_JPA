package fr.uga.l3miage.tp2.exo2;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type")
public abstract class EmployeeEntity{
    @Id
    private String id;
    private String email;
    private String salaire;
}