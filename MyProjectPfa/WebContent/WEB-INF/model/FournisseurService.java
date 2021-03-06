package com.pfa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fournisseurservice")
public class FournisseurService extends DemandeurService {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_fournisseur;
	private String description;
	private String prix;
	private String experience;
	private String tags;
	private String image;
	public FournisseurService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FournisseurService(int id_demandeur, int id_compte) {
		super(id_demandeur, id_compte);
		// TODO Auto-generated constructor stub
	}
	public FournisseurService(int id_fournisseur, String description, String prix, String experience, String tags,
			String image) {
		super();
		this.id_fournisseur = id_fournisseur;
		this.description = description;
		this.prix = prix;
		this.experience = experience;
		this.tags = tags;
		this.image = image;
	}
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	

}
