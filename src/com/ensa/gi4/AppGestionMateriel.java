package com.ensa.gi4;

import com.ensa.gi4.controller.GestionMaterielController;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("all")
public class AppGestionMateriel {
    private static final ApplicationContext APPLICATION_CONTEXT;
     private static final XmlBeanFactory FACTORY;

    static { // bloc static pour initilialisation
        APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/app-context.xml");
        FACTORY = new XmlBeanFactory (new ClassPathResource("/beans/dao-context.xml"));
    }

    public static void main(String[] args) {
        final GestionMaterielController gestionMaterielController = APPLICATION_CONTEXT.getBean(GestionMaterielController.class);
        while (true) { // pour que l'appliation tourne jusqu'à la demande de l'utilisateur de l'arrêter
            gestionMaterielController.afficherMenu();
        }

    }
}
