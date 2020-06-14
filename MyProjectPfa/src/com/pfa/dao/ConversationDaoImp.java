package com.pfa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pfa.model.Conversation;

public class ConversationDaoImp implements IConversationDao {
	EntityManager em;

	public ConversationDaoImp() {
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("pfa");
		this.em = fact.createEntityManager();
	}

	@Override
	public Conversation getConversationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conversation> getAllConversation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addConversation(Conversation c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteConversation(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conversation update(Conversation c) {
		// TODO Auto-generated method stub
		return null;
	}
}