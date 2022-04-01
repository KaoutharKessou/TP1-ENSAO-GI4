# TP1-ENSAO-GI4

-->creation la couche MaterielDAO  une sorte d'une base de donnee static
creation une liste des matériaux( contient chaise et livre) puis faire l'initilisation dans le constructeur
implementaion des méthodes CRUD

-->Injection
sépération du bean materieldao des autres bean dans un autre context puis l'importer dans app-context
materielDao injection via constructeur : 

-->creation des services et leurs implémentations : service pour chaque model
1-service générique de l'application: Materiel
2-impl service generique: 
injection du materielDAO via construteur
injection des services de chaise et  livre via accesseur
pour toutes methodes implémentées donner le choix à l utilisateur de choisir entre une chaise ou un livre,
puis selon le choix instancier le service convenable

pour les services des autres types de materiel vont heriter du service generique qui esr materiel
