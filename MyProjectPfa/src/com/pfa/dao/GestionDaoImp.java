package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Role;
import com.pfa.model.User;

public class GestionDaoImp implements IGestionDao {
	EntityManager em;

	public GestionDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}
	
	
	@Override
	public Compte getCompteById(int id) {

		Compte c=em.find(Compte.class,id);
		return c;

	}
	@Override
	public Compte getCompteByEmail(String email) {
		Compte c=em.find(Compte.class,email);
		return c;
	}

	@Override
	public List<Compte> getAllCompte() {
		Query req=em.createQuery("select e from Compte e ");
		List<Compte>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addCompte(Compte c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteCompte(int id) {
		em.getTransaction().begin();
		Compte c=em.find(Compte.class,id);
		em.remove(c);
		em.getTransaction().commit();
		
	}

	@Override
	public Compte update(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(int id) {
		Role r=em.find(Role.class,id);
		return r;
	}

	@Override
	public User getUserById(int id) {
		User r=em.find(User.class,id);
		return r;
	}

	@Override
	public List<User> getAllUser() {
		Query req= em.createQuery("select c from User c");
		List<User> liste= req.getResultList();
		return liste;
	}


	@Override
	public List<Role> getAllCategorie() {
		Query req= em.createQuery("select c from Role c");
		List<Role> liste= req.getResultList();
		return liste;
	}


	@Override
	public Compte verif(String email, String pass) {
     Query q=em.createQuery("select c from Compte c where c.email=:email and c.password=:pass ");
     try{
     q.setParameter("email", email);
     q.setParameter("pass", pass);
     Compte compte=(Compte) q.getSingleResult();
		
		return compte;
     } catch(NoResultException e) {
    	    return null;
    	  }
	}

	@Override
	public String encrypt(String password) {
		
		  String crypte= "";
	        for (int i=0; i<password.length();i++)  {
	            int c=password.charAt(i)^48; 
	            crypte=crypte+(char)c;
	        }
	        return crypte;
	    }


	@Override
	public String decrypt(String password) {
		  String aCrypter= "";
	        for (int i=0; i<password.length();i++)  {
	            int c=password.charAt(i)^48; 
	            aCrypter=aCrypter+(char)c;
	        }
	        return aCrypter;
	}
	

}
