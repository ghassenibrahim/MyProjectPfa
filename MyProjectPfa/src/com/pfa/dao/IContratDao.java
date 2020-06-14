package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.Contrat;


public interface IContratDao {
	public Contrat getContratById(int id);
	public List<Contrat> getAllContrat();
	public List<Contrat>getAllContratNnValide(int id);
	public void  addContrat(Contrat c);
	public void  deleteContrat(int id);
	public Contrat update(Contrat c);
	public List<Compte> getAllCompte();
	public Compte getCompteById(int id);
	public List<Contrat>getAllContratRecus(int id);
	public List<Contrat>getAllContratEnCours(int id);
	public List<Contrat>getAllContratEnvoye(int id);
	public Contrat verif(int id1,int id2);
	

}
