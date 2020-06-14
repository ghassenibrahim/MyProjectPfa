package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demande")
public class Demande {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_demande;
	@Column(name="id_demandeur")
	private int id_demandeur;
	@Column(name="id_localisation")
	private int id_localisation;
	@Column(name="id_service")
	private int id_service;
	@Column(name="titre")
	private String titre;
	@Column(name="description")
	private String description;
	@Column(name="date_creation")
	private String date_creation;
	@Column(name="date_travaux")
	private String date_travaux;
	@Column(name="prix")
	private String prix;
	@Column(name="image")
	private String image;
	
	public Demande(int id_demande, int id_demandeur, int id_localisation, int id_service, String titre,
			String description, String date_creation, String date_travaux, String prix, String image) {
		super();
		this.id_demande = id_demande;
		this.id_demandeur = id_demandeur;
		this.id_localisation = id_localisation;
		this.id_service = id_service;
		this.titre = titre;
		this.description = description;
		this.date_creation = date_creation;
		this.date_travaux = date_travaux;
		this.prix = prix;
		this.image=image;
	}
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_demande() {
		return id_demande;
	}
	public void setId_demande(int id_demande) {
		this.id_demande = id_demande;
	}
	public int getId_demandeur() {
		return id_demandeur;
	}
	public void setId_demandeur(int id_demandeur) {
		this.id_demandeur = id_demandeur;
	}
	public int getId_localisation() {
		return id_localisation;
	}
	public void setId_localisation(int id_localisation) {
		this.id_localisation = id_localisation;
	}
	public int getId_service() {
		return id_service;
	}
	public void setId_service(int id_service) {
		this.id_service = id_service;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
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
	

}
