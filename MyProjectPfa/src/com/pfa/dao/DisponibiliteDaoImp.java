package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Disponibilite;
import com.pfa.model.FournisseurService;
import com.pfa.model.Message;
import com.pfa.model.Role;
import com.pfa.model.Service;
import com.pfa.model.User;

public class DisponibiliteDaoImp implements IDisponibiliteDao {
	EntityManager em;

	public DisponibiliteDaoImp() {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("pfa");
		this.em = fact.createEntityManager();

	}

	@Override
	public Disponibilite getDisponibiliteById(int id) {
		Disponibilite c = em.find(Disponibilite.class, id);
		return c;
	}

	@Override
	public List<Disponibilite> getAllDisponibilite() {
		Query req = em.createQuery("select e from Disponibilite e ");
		List<Disponibilite> liste1 = req.getResultList();

		return liste1;
	}

	@Override
	public void addDisponibilite(Disponibilite c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

	}

	@Override
	public void deleteDisponibilite(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Disponibilite update(Disponibilite c) {
		em.getTransaction().begin();

		Disponibilite c1 = em.merge(c);
		em.getTransaction().commit();
		return c1;
	}

	@Override
	public Service getServiceById(int id) {
		Service r = em.find(Service.class, id);
		return r;

	}

	@Override
	public List<Service> getAllService() {
		Query req = em.createQuery("select c from Service c");
		List<Service> liste = req.getResultList();
		return liste;

	}

	@Override
	public Compte getCompteById(int id) {
		Compte r = em.find(Compte.class, id);
		return r;

	}

	@Override
	public List<Disponibilite> getAllServiceId(int id) {
		Query req = em.createQuery("select p from Disponibilite p where p.service.id=" + id + "");

		List<Disponibilite> liste1 = req.getResultList();

		return liste1;
	}

	@Override
	public List<Disponibilite> Recherche(String o) {
		Query req = em.createQuery("select p from Disponibilite p where p.service.libelle='" + o
				+ "' or p.compte.user.nom='" + o + "' or p.compte.user.prenom='" + o + "' or p.compte.user.tel='" + o
				+ "'  or p.compte.user.country='" + o + "' or p.compte.user.city='" + o + "'");

		List<Disponibilite> liste1 = req.getResultList();

		return liste1;
	}

	public List<Compte> getAllCompte() {
		Query req = em.createQuery("select c from Compte c");
		List<Compte> liste = req.getResultList();
		return liste;
	}

	@Override
	public List<Disponibilite> getAllDispoByCompteId(int id) {
		Query req = em.createQuery("select p from Disponibilite p where p.compte.id=" + id + " ");

		List<Disponibilite> liste1 = req.getResultList();

		return liste1;
	}

	@Override
	public Disponibilite getDispo(int id1, int id2) {
		 Query q=em.createQuery("select c from Disponibilite c where c.compte.id=:id1 and c.service.id=:id2 ");
	     try{
	     q.setParameter("id1",id1 );
	     q.setParameter("id2", id2);
	     Disponibilite dispo=(Disponibilite) q.getSingleResult();
			
			return dispo;
	     } catch(NoResultException e) {
	    	    return null;
	    	  }
	}
}
