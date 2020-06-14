package com.pfa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="conversation")
public class Conversation {
	@Id @GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	@ManyToOne
	@JoinColumn(name="compte1_id")
	private Compte compte1;
	@JoinColumn(name="compte2_id")
	private Compte compte2;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="conversation")
	private List<Message>message;
	public Conversation(int id, Compte compte1, Compte compte2) {
		super();
		this.id = id;
		this.compte1 = compte1;
		this.compte2 = compte2;

	}
	public Conversation(int id, Compte compte1, Compte compte2, List<Message> message) {
		super();
		this.id = id;
		this.compte1 = compte1;
		this.compte2 = compte2;
		this.message = message;
	}
	public Conversation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Compte getCompte1() {
		return compte1;
	}
	public void setCompte1(Compte compte1) {
		this.compte1 = compte1;
	}
	public Compte getCompte2() {
		return compte2;
	}
	public void setCompte2(Compte compte2) {
		this.compte2 = compte2;
	}
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	
	
	
}
