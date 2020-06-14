package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Commentaire;
import com.pfa.model.Disponibilite;


public class CommentaireDaoImp implements  ICommentaireDao {
	EntityManager em;

	public CommentaireDaoImp() {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("pfa");
		this.em = fact.createEntityManager();

	}

	@Override
	public Commentaire getCommenataireById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commentaire> getAllCommentaire() {
		Query req=em.createQuery("select e from Commentaire e ");
		List<Commentaire>liste1=req.getResultList();
		
		
		return liste1;
	}

	@Override
	public void addCommentaire(Commentaire c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteCommentaire(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commentaire update(Commentaire c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commentaire> getCommentaireByDispo(int id) {
		Query req= em.createQuery("select c from Commentaire c where c.intervention.contrat.dispo.id="+id+" ");
		List<Commentaire> liste= req.getResultList();
		return liste;
		
	}

}
