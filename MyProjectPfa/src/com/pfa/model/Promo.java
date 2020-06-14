package com.pfa.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Promo")
public class Promo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String offre;
	private Timestamp date_publication;
	private String image;
	@ManyToOne
	@JoinColumn(name = "compte_id")
	private Compte compte;
	@JoinColumn(name="service_id")
	private Service service;
	public Promo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Promo(int id, String offre, Timestamp date_publication, String image, Compte compte, Service service) {
		super();
		this.id = id;
		this.offre = offre;
		this.date_publication = date_publication;
		this.image = image;
		this.compte = compte;
		this.service = service;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOffre() {
		return offre;
	}
	public void setOffre(String offre) {
		this.offre = offre;
	}
	public Timestamp getDate_publication() {
		return date_publication;
	}
	public void setDate_publication(Timestamp date_publication) {
		this.date_publication = date_publication;
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
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	
}
