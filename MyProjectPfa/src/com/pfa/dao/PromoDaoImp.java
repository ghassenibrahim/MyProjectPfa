package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Disponibilite;
import com.pfa.model.FournisseurService;
import com.pfa.model.Promo;
import com.pfa.model.Service;

public class PromoDaoImp implements IPromoDao {
	EntityManager em;

	public PromoDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public Promo getPromoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promo> getAllPromo() {
		Query req=em.createQuery("select e from Promo e ");
		List<Promo>liste1=req.getResultList();
		
		
		return liste1;
	}

	@Override
	public void addPromo(Promo c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePromo(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Promo update(Promo c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte getCompteById(int id) {
		Compte r=em.find(Compte.class,id);
		return r;
		
	}

	@Override
	public List<Compte> getAllCompte() {
		Query req= em.createQuery("select c from Compte c");
		List<Compte> liste= req.getResultList();
		return liste;
	}

	@Override
	public Service getServiceById(int id) {
		Service r=em.find(Service.class,id);
		return r;
	}

	@Override
	public List<Service> getAllService() {
		Query req= em.createQuery("select c from Service c");
		List<Service> liste= req.getResultList();
		return liste;
	}

}
