package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Categorie;
import com.pfa.model.Disponibilite;

public class CategorieDaoImp implements ICategorieDao {
	EntityManager em;

	public CategorieDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public Categorie getCategorieById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> getAllCategorie() {
		Query req=em.createQuery("select e from Categorie e ");
		List<Categorie>liste1=req.getResultList();
		
		
		return liste1;
	}

	@Override
	public void addDemandeur(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDemandeur(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categorie update(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

}
