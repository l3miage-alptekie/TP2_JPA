package fr.uga.l3miage.tp2.exo2;


import javax.persistence.*;

@Entity
@DiscriminatorValue("D")
public class DeveloperEntity extends EmployeeEntity{
    String LangagePrefere;
    String niveauCompetence;
}