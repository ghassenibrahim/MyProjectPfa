package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Message;

public class ContratDaoImp implements IContratDao {
	EntityManager em;

	public ContratDaoImp() {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("pfa");
		this.em = fact.createEntityManager();

	}

	@Override
	public Contrat getContratById(int id) {
		Contrat c = em.find(Contrat.class, id);
		return c;
	}

	@Override
	public List<Contrat> getAllContrat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addContrat(Contrat c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

	}

	@Override
	public void deleteContrat(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Contrat update(Contrat c) {
		em.getTransaction().begin();

		Contrat c1 = em.merge(c);
		em.getTransaction().commit();
		return c1;
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
	public List<Contrat> getAllContratNnValide(int id) {
		Query req = em.createQuery("select p from Contrat p where p.dispo.compte.id=" + id + " and p.validation=0  and p.receivedel=0 and p.receiveread=0");

		List<Contrat> liste1 = req.getResultList();

		return liste1;
	}

	@Override
	public List<Contrat> getAllContratRecus(int id) {
		Query req = em.createQuery("select p from Contrat p where p.dispo.compte.id="+ id +" and p.validation=0  and p.receivedel=0 ");

		List<Contrat> liste1 = req.getResultList();

		return liste1;
	}

	@Override
	public List<Contrat> getAllContratEnCours(int id) {
		Query req = em.createQuery("select p from Contrat p where ( p.dispo.compte.id="+id+" or p.compte.id="+id+") and p.validation=1  and p.receivedel=0 ");

		List<Contrat> liste1 = req.getResultList();

		return liste1;
	}

	@Override
	public List<Contrat> getAllContratEnvoye(int id) {
		Query req = em.createQuery("select p from Contrat p where p.compte.id="+ id +" and  p.receivedel=0 and p.validation=0");

		List<Contrat> liste1 = req.getResultList();

		return liste1;
	}
	//@Override
	//public List<Contrat> getAllContratEnCoursFournisseur(int id) {
	//	Query req = em.createQuery("select p from Contrat p where p.compte.id="+ id +" and p.validation=1  and p.receivedel=0 ");

	@Override
	public Contrat verif(int id1, int id2) {
		 Query q=em.createQuery("select c from Contrat c where c.compte.id=:id1 and c.dispo.id=:id2 ");
	     try{
	     q.setParameter("id1", id1);
	     q.setParameter("id2", id2);
	     Contrat contrat=(Contrat) q.setMaxResults(1).getSingleResult();
			
			return contrat;
	     } catch(NoResultException e) {
	    	    return null;
	    	  }
	}

		

}
