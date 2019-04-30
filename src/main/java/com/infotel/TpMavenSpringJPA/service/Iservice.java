package com.infotel.TpMavenSpringJPA.service;

import java.util.List;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

public interface Iservice {
	public int ajouterPersonne(Personne p);
	public Personne getPersonne(int id);
	public int supprimerPersonne(Personne p);
	public Personne affichagePersonne(int id);
	public int modifierPersonne(Personne p);
	public List<Personne> findAllPersonnes();
	
	public int ajouterAdresse(Adresse a);
	public Adresse getAdresse(int idAdresse);
	public int supprimerAdresse(Adresse a);
	public Adresse affichageAdresse(int idAdresse);
	public int modifierAdresse(Adresse a);
	public List<Adresse> findAllAdresses();
}

