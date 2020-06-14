package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.FournisseurService;
import com.pfa.model.User;

public class FournisseurDaoImp implements IFournisseurDaoImp  {
	EntityManager em;
	public FournisseurDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public FournisseurService getFournisseurById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FournisseurService> getAllFournisseur() {
		Query req=em.createQuery("select e from FournisseurService e ");
		List<FournisseurService>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addFournisseur(FournisseurService c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteFournisseur(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FournisseurService update(FournisseurService c) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
