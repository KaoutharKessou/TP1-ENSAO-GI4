# TP1-ENSAO-GI4

Spring respecte un principe comme montre la figure :


![alt text](https://objis.com/wp-content/uploads/2009/04/tutoriel_spring_objis_introduction_spring_mvc_2.png)


Nous avons essayer de respecter cette convention. Donc les principaux packages du projet sont : 
  
1- Le Package /ensa/gi4/DAO ==> Fournit tous les fonctionnalités(ajout, suppression,modification,...) en relation avec la base de données (representer par une liste). 


2- Le Package /ensa/gi4/controller ==> dans lequel est dévelopé le contrôleur de l'application. 

3-Le Package /ensa/gi4/modele ==> contient la definition des trois modeles (Materiel, Livre, et chaise)

4-Le package src/beans ==> Contient la declaration des beans de notre projet (sépération du bean materieldao des autres bean dans un autre context puis l'importer dans app-context)

5-Le Package /ensa/gi4/service ==> Represente les services de gestion de materiels, de livres et de chaises

+ Pour les models : 

    Chaque materiel (livre, chaise) est identifié par un nom et les accesseurs associés


+ Pour la Gestionmateriels, elle implemente les services : 

 (a) init ==> qui permet d'initialiser le service avec un affichage;
 
 (b) listerMateriel ==> qui permet de lister les Materiaux à travers la couche DAO;
 
 (c)AjouterNouveauMateriel/supprimerMateriel/modifierMateriel/chercherMateriel ==> qui permet de decider si on veutr ajouter/supprimer/modifier/chercher un livre ou chaise et par la suite deleger le travail au service correcpondant (gestionLivreservice ou gestionChaiseservice  



+ Pour les Libraries, nous avons importer la liste suivante : 

1- spring-beans

2- spring-context

3-spring-core

4-spring-expression

5-commons-logging






