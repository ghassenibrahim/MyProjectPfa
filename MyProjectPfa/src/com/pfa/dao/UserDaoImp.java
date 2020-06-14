package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.User;

public class UserDaoImp implements IUserDao{
	EntityManager em;

	public UserDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}
	
	@Override
	public User getUserById(int id) {
		User u=em.find(User.class,id);
		return u;
	}

	@Override
	public List<User> getAllUser() {
		Query req=em.createQuery("select e from User e ");
		List<User>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addUser(User c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}

	@Override
	public void deleteUser(int id) {
		em.getTransaction().begin();
		User c=em.find(User.class,id);
		em.remove(c);
		em.getTransaction().commit();
		
	}

	@Override
	public User update(User c) {
		// TODO Auto-generated method stub
		return null;
	}

}
