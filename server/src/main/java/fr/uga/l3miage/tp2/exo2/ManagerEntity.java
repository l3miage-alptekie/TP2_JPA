package fr.uga.l3miage.tp2.exo2;


import javax.persistence.*;

@Entity
@DiscriminatorValue("M")
public class ManagerEntity extends EmployeeEntity{
    String niveauGestion;
}