package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.Demande;
import com.pfa.model.Disponibilite;
import com.pfa.model.Service;

public interface IDemandeDao {
	public Demande getDemandeById(int id);
	public List<Demande> getAllDemande();
	public void  addDemande(Demande c);
	public void  deleteDemande(int id);
	public Demande update(Demande c);
	public List<Compte> getAllCompte();
	public Compte getCompteById(int id);
	public Service getServiceById(int id);
	public List<Service> getAllService();
	public List<Demande> getAllServiceId(int id);
	public List<Demande> Recherche(String o);
}
