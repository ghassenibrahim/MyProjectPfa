package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pfa.model.Compte;
import com.pfa.model.Disponibilite;
import com.pfa.model.Message;

public class MessageDaoImpl implements IMessageDao {
	EntityManager em;

	public MessageDaoImpl() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("pfa");
		  this.em=fact.createEntityManager();
	
	}

	@Override
	public Message getMessageById(int id) {
		Message c=em.find(Message.class,id);
		return c;
	}

	@Override
	public List<Message> getAllMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMessage(Message c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteMessage(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message update(Message c) {
		em.getTransaction().begin();
		
		Message c1=em.merge(c);
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
	public List<Message> getAllMessageRecus(int id) {
     Query req=em.createQuery("select p from Message p where p.receiver.id="+id+" and p.receivedel=0 ");
		
		List<Message>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void deletereceive(int id) {
		
		Query req=em.createQuery("UPDATE  Message p SET p.receivedel=1 where p.id="+id+" ");
		
	}

	@Override
	public List<Message> getAllMessageEnvoye(int id) {
		  Query req=em.createQuery("select p from Message p where p.sender.id="+id+" and p.senddel=0 ");
			
			List<Message>liste1=req.getResultList();
			
			return liste1;
	}

	@Override
	public List<Message> getAllMessageRecusNonLu(int id) {
		String sql = "SELECT *FROM message WHERE receiver_id="+id+" and receiveread=0 and date in (SELECT max(d.date) FROM(SELECT a.date,a.receiver_id as user from message as a where a.sender_id="+id+" union SELECT b.date ,b.sender_id as user FROM message as b where b.receiver_id="+id+")as d GROUP BY d.user) ";
			
		Query query = em.createNativeQuery(sql, Message.class);
		 
		
		List<Message>liste1=query.getResultList();
		
		return liste1;
	}

	@Override
	public List<Message> getAllMessageEnvoyes(int id) {
		 Query req=em.createQuery("select p from Message p where p.sender.id="+id+" and p.senddel=0 ");
			
			List<Message>liste1=req.getResultList();
			
			return liste1;
	}

	@Override
	public List<Message> getconverstaion(int id1, int id2) {
		 Query req=em.createQuery("select p from Message p where (( p.sender.id="+id1+" and p.receiver.id="+id2+") or ( p.sender.id="+id2+" and p.receiver.id="+id1+"))  and p.senddel=0 and p.receivedel=0 group by p.date");
			
			List<Message>liste1=req.getResultList();
			
			return liste1;
	}

	@Override
	public List<Message> getAllMessageById(int id) {
		String sql = "SELECT *FROM message WHERE date in (SELECT max(d.date) FROM(SELECT a.date,a.receiver_id as user from message as a where a.sender_id="+id+" union SELECT b.date ,b.sender_id as user FROM message as b where b.receiver_id="+id+")as d GROUP BY d.user) order by date DESC";

		Query query = em.createNativeQuery(sql, Message.class);
		 
			
			List<Message>liste1=query.getResultList();
			
			return liste1;
	}

	@Override
	public List<Message> getAllMessageNonReadInConversation(int id1, int id2) {
		 Query req=em.createQuery("select p from Message p where p.sender.id="+id1+" and p.receiver.id="+id2+"  and p.receiveread=0");
			
			List<Message>liste1=req.getResultList();
			
			return liste1;	
	}
}
