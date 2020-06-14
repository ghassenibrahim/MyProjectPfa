package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.Message;



public interface IMessageDao {
	public Message getMessageById(int id);
	public List<Message> getAllMessage();
	public List<Message> getAllMessageRecus(int id);
	public void  addMessage(Message c);
	public void  deleteMessage(int id);
	public Message update(Message c);
	public List<Compte> getAllCompte();
	public Compte getCompteById(int id);
	public void deletereceive(int id);
	public List<Message> getAllMessageEnvoye(int id);
	public List<Message>getAllMessageRecusNonLu(int id);
	public List<Message> getAllMessageEnvoyes(int id);
	public List<Message> getconverstaion(int id1,int id2);
	public List<Message> getAllMessageById(int id);
	public List<Message> getAllMessageNonReadInConversation(int id1, int id2);
	
}
