package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pfa.model.Compte;
import com.pfa.model.DemandeurService;
import com.pfa.model.Role;

public class DemandeurDaoImp implements IDemandeurDao {
	EntityManager em;

	public DemandeurDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public DemandeurService getDemandeurById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DemandeurService> getAllDemandeur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDemandeur(DemandeurService c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	
		
	}

	@Override
	public void deleteDemandeur(int id) {
		em.getTransaction().begin();
		DemandeurService c=em.find(DemandeurService.class,id);
		em.remove(c);
		em.getTransaction().commit();
		
	}

	@Override
	public DemandeurService update(DemandeurService c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(int id) {
		Role r=em.find(Role.class,id);
		return r;
	}

	@Override
	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
