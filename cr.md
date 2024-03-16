### Explications pour le premier exo de exo1 de TP2:

Pour cet exercice on n'avait pas compris au début comment faire
avec le mode validate et ce qu'on avait compris que la relation many to many entre les deux classes
developper_miage et projet doit créer la classe developer_miage_projet
qui est une classe d'association.

MAIS, comme on est dans le mode validate
on s'est dit que peut être il faut créer manuellement cette classe en
donnant comme Id la clé composée des deux clés primaires de deux classes
en créant une classe:

    @Embeddable
    public class CleComposee implements Serializable {
    private String lastName;
    private bigint id;
    }
    et donc la clé de notre classe developer_miage_projet est 

     @EmbeddedId
    private CleComposee id;
    
    et contiendera aussi les deux relatios manyToMany vers les deux classes

    @ManyToMany(mappedBy = "developer_miage_projets")
    private List<DevelopperMiage> developperMiages;

    @ManyToMany(mappedBy = "developer_miage_projets")
    private List<Projet> projets;


    et dans les deux classe Projet et developperMiage on aura aussi une liste 
    developer_miage_projet.


A cause d'une erreur à la dernière minute on n'a pas pu écrire cela
et on a créé que les deux classes et c'est en mode create qu'on regarde
la classe d'association résultante.
