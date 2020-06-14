package com.pfa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.jmx.snmp.Timestamp;

@Entity
@Table(name = "contrat")
public class Contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prix;
	private String date;
	private String time;
	private String address;
	private String description;
	private int validation;
	private int sendread;
	private int receivedel;
	private int senddel;
	private int receiveread;
	private Timestamp datepub;
	@OneToOne
	@JoinColumn(name = "dispo_id")
	private Disponibilite dispo;
	@OneToOne
	@JoinColumn(name = "compte_id")
	private Compte compte;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getValidation() {
		return validation;
	}

	public void setValidation(int validation) {
		this.validation = validation;
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

	public void setReceivedel(int receivedel) {
		this.receivedel = receivedel;
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

	public Disponibilite getDispo() {
		return dispo;
	}

	public void setDispo(Disponibilite dispo) {
		this.dispo = dispo;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Contrat(int id, String prix, String date, String time, String address, String description, int validation,
			int sendread, int receivedel, int senddel, int receiveread, Timestamp datepub, Disponibilite dispo,
			Compte compte) {
		super();
		this.id = id;
		this.prix = prix;
		this.date = date;
		this.time = time;
		this.address = address;
		this.description = description;
		this.validation = validation;
		this.sendread = sendread;
		this.receivedel = receivedel;
		this.senddel = senddel;
		this.receiveread = receiveread;
		this.datepub = datepub;
		this.dispo = dispo;
		this.compte = compte;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	
}
