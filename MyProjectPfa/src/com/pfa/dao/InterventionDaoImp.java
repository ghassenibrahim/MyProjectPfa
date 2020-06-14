package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.Intervention;

public class InterventionDaoImp implements IInterventionDao {
	EntityManager em;

	public InterventionDaoImp() {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("pfa");
		this.em = fact.createEntityManager();

	}

	@Override
	public Intervention getInterventionById(int id) {
		Intervention c=em.find(Intervention.class,id);
		return c;

	}

	@Override
	public List<Intervention> getAllIntervention() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addIntervention(Intervention c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

	}

	@Override
	public void deleteIntervention(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Intervention update(Intervention c) {
		em.getTransaction().begin();

		Intervention c1 = em.merge(c);
		em.getTransaction().commit();
		return c1;
	}

	@Override
	public Intervention getInterventionByContratId(int id) {
		Query req = em.createQuery("select p from Intervention p where p.contrat.id=" + id + "");

		Intervention intervention = (Intervention) req.getSingleResult();

		return intervention;
	}

	@Override
	public Intervention getInterventionByIdContrat(int id1) {
		 Query q=em.createQuery("select c from Intervention c where c.contrat.id=:id1");
	     try{
	     q.setParameter("id1", id1);
	   
	     Intervention intervention=(Intervention) q.getSingleResult();
			
			return intervention;
	     } catch(NoResultException e) {
	    	    return null;
	    	  }
	}

	@Override
	public List<Intervention> getAllInterventionEnCours(int id) {
		Query req = em.createQuery("select p from Intervention p where ( p.contrat.dispo.compte.id="+id+" or p.contrat.compte.id="+id+") and p.etat=0 and p.contrat.validation=1  and p.contrat.receivedel=0 ");

		List<Intervention> liste1 = req.getResultList();

		return liste1;
	}
}
