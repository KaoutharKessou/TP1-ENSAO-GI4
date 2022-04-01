
package com.ensa.gi4.service.impl;

import com.ensa.gi4.DAO.MaterielDAO;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionChaiseService;
import java.util.Scanner;


public class GestionChaiseServiceImpl implements GestionChaiseService{

    
     MaterielDAO dao;
    
    public GestionChaiseServiceImpl(MaterielDAO dao){
        this.dao = dao;
    }
    
    @Override
    public void init() {
        //l'initialisation du service est réalier par la gestionMateriel
    }

    @Override
    public void listerMateriel() {
        //la liste des materiaux est indepandante du type, donc réaliser ppar gestionMateriell
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        System.out.println("Veuillez saisir le nom de la chaise que vous voulez ajouter : ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        materiel = new Chaise();
        materiel.setName(nom);
        dao.ajouterNouveauMateriel(materiel);
    }

    @Override
    public void supprimerMateriel() {
        System.out.println("Veuillez saisir le nom de la chaise que vous voulez supprimer : ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.next();
        int id=-1;
        for(int i = 0;i<dao.getAllMateriel().size();i++)
	        {
				if(dao.getAllMateriel().get(i).getClass().toString().equals("class com.ensa.gi4.modele.Chaise") && dao.getAllMateriel().get(i).getName().equals(nom)) // si c'est une chaise avec le nom chercher
				{
					id=i;break;
				}
	        }
        if(id>=0)
        {
            dao.supprimerMateriel(id);
            System.out.println("la suppression de la chaise est effectué avec succés ");
        }
        else
            System.out.println("Chaise introuvable");
    }

    @Override
    public void modifierMateriel() {
        System.out.println("Veuillez saisir le nom de la chaise que vous voulez modifier : ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.next();
        int id=-1;
        for(int i = 0;i<dao.getAllMateriel().size();i++)
	        {
				if(dao.getAllMateriel().get(i).getClass().toString().equals("class com.ensa.gi4.modele.Chaise") && dao.getAllMateriel().get(i).getName().equals(nom)) // si c'est une chaise avec le nom chercher
				{
					id=i;
                                        System.out.println("Chaise trouvé, veullez saisir le nouveau nom : ");
                                        nom = scanner.next();
                                        break;
				}
	        }
        if(id>=0)
        {
            dao.modifierMateriel(id,nom);
            System.out.println("la modification de la chaise est effectué avec succés ");
        }
        else
            System.out.println("Chaise introuvable");
    }

    @Override
    public Materiel chercherMateriel() {
        
                 System.out.println("Veuillez saisir le nom de la chaise que vous voulez chercher : ");
	        Scanner scanner = new Scanner(System.in);
	        String nom = scanner.next();
                int id=-1;
        for(int i = 0;i<dao.getAllMateriel().size();i++)
	        {
				if(dao.getAllMateriel().get(i).getClass().toString().equals("class com.ensa.gi4.modele.Chaise") && dao.getAllMateriel().get(i).getName().equals(nom)) // si c'est une chaise avec le nom chercher
				{
					id=i;break;
				}
	        }
        if(id>=0)
            {
        	System.out.println("chaise recherch� est trouv�");
        	return dao.getAllMateriel().get(id);
            }
        else {
        	System.out.println("chaise recherch� est introuvable");
        	return null;
        }
    }
    
}
