package com.pfa.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "demande")
public class Demande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titre;
	
	private String address;
	private String description;
	private Timestamp date_pub;
	private String date_travaux;
	private String prix;
	private String image;
	@ManyToOne
	@JoinColumn(name="compte_id")
	private Compte compte;
	@JoinColumn(name="service_id")
	private Service service;
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Demande(int id, String titre, String address, String description, Timestamp date_pub, String date_travaux,
			String prix, String image, Compte compte, Service service) {
		super();
		this.id = id;
		this.titre = titre;
		this.address = address;
		this.description = description;
		this.setDate_pub(date_pub);
		this.date_travaux = date_travaux;
		this.prix = prix;
		this.image = image;
		this.compte = compte;
		this.service = service;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDate_travaux() {
		return date_travaux;
	}
	public void setDate_travaux(String date_travaux) {
		this.date_travaux = date_travaux;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Compte getCompte() {
		return compte;
	}
	
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getDate_pub() {
		return date_pub;
	}
	public void setDate_pub(Timestamp date_pub) {
		this.date_pub = date_pub;
	}
	

}
