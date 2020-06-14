package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Demande;
import com.pfa.model.DemandeurService;
import com.pfa.model.Disponibilite;
import com.pfa.model.Role;
import com.pfa.model.Service;
import com.pfa.model.User;

public class DemandeDaoImp implements IDemandeDao {
	EntityManager em;

	public DemandeDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public Demande getDemandeById(int id) {
		Demande u=em.find(Demande.class,id);
		return u;
	}

	@Override
	public List<Demande> getAllDemande() {
		Query req=em.createQuery("select e from Demande e ");
		List<Demande>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addDemande(Demande c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteDemande(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Demande update(Demande c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte getCompteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Service getServiceById(int id) {
		Service r=em.find(Service.class,id);
		return r;
	}

	@Override
	public List<Service> getAllService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Demande> getAllServiceId(int id) {
Query req=em.createQuery("select p from Demande p where p.service.id="+id+"");
		
		List<Demande>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public List<Demande> Recherche(String o) {
Query req=em.createQuery("select p from Demande p where p.service.libelle='" +o+ "' or p.compte.user.nom='" +o+"' or p.compte.user.prenom='" +o+ "' or p.compte.user.tel='" +o+ "'  or p.address='" +o+ "' ");
		
		List<Demande>liste1=req.getResultList();
		
		return liste1;
	}

	
}
