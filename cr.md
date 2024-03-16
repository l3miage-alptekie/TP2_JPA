###  Expliquer pourquoi avoir choisi ce mode en particulier
##### On a choisi la deuxième méthode qui est 'table de joiture' ou JOINED car:


* La méthode de jointure (JOINED) se distingue des autres méthodes
d'héritage en offrant une approche plus claire et plus organisée
 pour représenter les hiérarchies d'objets dans une base de données.
 Contrairement à la méthode de table unique, où toutes les colonnes
 des sous-classes sont regroupées dans une seule table, ce qui peut
 rendre la classe mère encombrée avec des attributs null, la méthode
 de jointure associe chaque classe de la hiérarchie à sa propre table
  distincte. Cela évite la surcharge de la classe mère et rend le schéma
   de la base de données plus lisible et plus maintenable.


* De même, par
   rapport à la méthode de table par classe, où chaque sous-classe a sa
    propre table mais où la classe mère est absente, la méthode de jointure
    conserve la structure d'héritage dans la vue graphique des classes.
     Chaque classe de la hiérarchie est représentée individuellement
      avec ses propres attributs distinctifs, et la relation
      d'héritage avec la classe mère reste clairement définie.
       Ainsi, la méthode de jointure offre une approche équilibrée
        qui maintient la clarté du schéma, la lisibilité de la
        classe mère et la représentation visuelle précise de
         l'héritage, en faisant d'elle un choix optimal pour
         modéliser les hiérarchies d'objets dans une base de
         données.
