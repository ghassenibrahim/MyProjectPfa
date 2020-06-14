package com.pfa.dao;

import java.util.List;

import com.pfa.model.Conversation;



public interface IConversationDao {
	public Conversation getConversationById(int id);
	public List<Conversation> getAllConversation();
	public void  addConversation(Conversation c);
	public void  deleteConversation(int id);
	public Conversation update(Conversation c);

}
