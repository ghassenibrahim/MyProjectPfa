package com.pfa.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String message;
	private Timestamp date;
	private int sendread;
	private int receivedel;
	private int senddel;
	private int receiveread;
	
	@ManyToOne
	@JoinColumn(name="sender_id")
	private Compte sender;
	@JoinColumn(name="receiver_id")
	private Compte receiver;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Message(int id, String message, Timestamp date, int sendread, int receivedel, int senddel, int receiveread,
			Compte sender, Compte receiver) {
		super();
		this.id = id;
		this.message = message;
		this.date = date;
		this.sendread = sendread;
		this.receivedel = receivedel;
		this.senddel = senddel;
		this.receiveread = receiveread;
		this.sender = sender;
		this.receiver = receiver;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getSendread() {
		return sendread;
	}
	public void setSendread(int sendread) {
		this.sendread = sendread;
	}
	public int getReceivedel() {
		return receivedel;
	}
	public void setReceivedel(int receicedel) {
		this.receivedel = receicedel;
	}
	public int getSenddel() {
		return senddel;
	}
	public void setSenddel(int senddel) {
		this.senddel = senddel;
	}
	public int getReceiveread() {
		return receiveread;
	}
	public void setReceiveread(int receiveread) {
		this.receiveread = receiveread;
	}
	public Compte getSender() {
		return sender;
	}
	public void setSender(Compte sender) {
		this.sender = sender;
	}
	public Compte getReceiver() {
		return receiver;
	}
	public void setReceiver(Compte receiver) {
		this.receiver = receiver;
	}
	
	
}
