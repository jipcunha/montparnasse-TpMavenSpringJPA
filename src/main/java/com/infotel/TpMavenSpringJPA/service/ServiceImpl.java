package com.infotel.TpMavenSpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringJPA.dao.Idao;
import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

@Service("service")
public class ServiceImpl implements Iservice {

	@Autowired
	private Idao dao; //est-ce qu'il faut faire les getters et setters de dao?
	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}
	@Override
	public Personne getPersonne(int id) {
		// TODO Auto-generated method stub
		return dao.getPersonne(id);
	}
	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(p);
	}
	@Override
	public Personne affichagePersonne(int id) {
		// TODO Auto-generated method stub
		return dao.affichagePersonne(id);
	}
	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifierPersonne(p);
	}
	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return dao.findAllPersonnes();
	}
	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.ajouterAdresse(a);
	}
	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return dao.getAdresse(idAdresse);
	}
	@Override
	public int supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.supprimerAdresse(a);
	}
	@Override
	public Adresse affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return dao.affichageAdresse(idAdresse);
	}
	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.modifierAdresse(a);
	}
	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return dao.findAllAdresses();
	}

}
