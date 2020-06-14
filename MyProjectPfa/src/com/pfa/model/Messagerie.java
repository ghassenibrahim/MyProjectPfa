package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messagerie")
public class Messagerie {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_msg;
	@Column(name="id_sender")
	private int id_sender;
	@Column(name="id_receiver")
	private int id_receiver;
	@Column(name="titre")
	private String titre;
	@Column(name="date")
	private String date;
	@Column(name="received_read")
	private int received_read;
	@Column(name="received_delete")
	private int received_delete;
	@Column(name="send_read")
	private int send_read;
	@Column(name="send_delete")
	private int send_delete;
	
	public Messagerie(int id_msg, int id_sender, int id_receiver, String titre, String date, int received_read,
			int received_delete, int send_read, int send_delete) {
		super();
		this.id_msg = id_msg;
		this.id_sender = id_sender;
		this.id_receiver = id_receiver;
		this.titre = titre;
		this.date = date;
		this.received_read = received_read;
		this.received_delete = received_delete;
		this.send_read = send_read;
		this.send_delete = send_delete;
	}
	public Messagerie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_msg() {
		return id_msg;
	}
	public void setId_msg(int id_msg) {
		this.id_msg = id_msg;
	}
	public int getId_sender() {
		return id_sender;
	}
	public void setId_sender(int id_sender) {
		this.id_sender = id_sender;
	}
	public int getId_receiver() {
		return id_receiver;
	}
	public void setId_receiver(int id_receiver) {
		this.id_receiver = id_receiver;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getReceived_read() {
		return received_read;
	}
	public void setReceived_read(int received_read) {
		this.received_read = received_read;
	}
	public int getReceived_delete() {
		return received_delete;
	}
	public void setReceived_delete(int received_delete) {
		this.received_delete = received_delete;
	}
	public int getSend_read() {
		return send_read;
	}
	public void setSend_read(int send_read) {
		this.send_read = send_read;
	}
	public int getSend_delete() {
		return send_delete;
	}
	public void setSend_delete(int send_delete) {
		this.send_delete = send_delete;
	}

}
