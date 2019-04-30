package com.infotel.TpMavenSpringJPA.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;
import com.infotel.TpMavenSpringJPA.service.Iservice;
import com.infotel.TpMavenSpringJPA.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class Lanceur 
{
    public static void main( String[] args )  {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Personne p = context.getBean("personne", Personne.class);
    	
    	Adresse a = context.getBean("adresse", Adresse.class);
    	
    	
    	Iservice service = context.getBean("service", ServiceImpl.class);
    	
    	a = service.affichageAdresse(1);
   // 	p = service.getPersonne(3);
   // 	p = service.affichagePersonne(4);
    	
    	p.setNom("Doe");
    	p.setPrenom("John");
    	p.setAge(37);
    	p.setAdresse(a);
    	
    	
    	service.ajouterPersonne(p);  
  //  	service.modifierPersonne(p);
  //  	service.supprimerPersonne(p);  
    	
   // 	System.out.println(service.findAllPersonnes());
    	
    	
   //a = service.getAdresse(3);
   //a = service.affichageAdresse(1);
    	    	
    /*	   	a.setNumRue("18");
    	   	a.setNomRue("Bv des Capucines");
    	    a.setVille("Paris");
    	    a.setCp("75000"); */
    	    	
    	//service.ajouterAdresse(a);
    	//service.modifierAdresse(a);
        //service.supprimerAdresse(a);  
    	    	
    	  //System.out.println(service.findAllAdresses());
    	   	
    	context.close();
    	}
}
