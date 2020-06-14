package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Categorie;
import com.pfa.model.Compte;
import com.pfa.model.Service;

public class ServiceDaoImp implements IServiceDao {
	EntityManager em;

	public ServiceDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public Service getServiceById(int id) {
		Service r=em.find(Service.class,id);
		return r;
	}

	@Override
	public List<Service> getAllService() {
		Query req=em.createQuery("select e from Service e ");
		List<Service>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addService(Service c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDemandeur(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Service update(Service c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorieById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> getAllCategorie() {
		// TODO Auto-generated method stub
		return null;
	}

}
