package com.pfa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fournisseurservice")
@DiscriminatorValue(value="Fournisseur_type")
public class FournisseurService extends User {
	
	
	private String description;
	private String prix;
	private String experience;
	private String tags;
	private String image;
	
	public FournisseurService(String description, String prix, String experience, String tags, String image) {
		super();
		this.description = description;
		this.prix = prix;
		this.experience = experience;
		this.tags = tags;
		this.image = image;
	}
	public FournisseurService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FournisseurService(int id_user, String nom, String prenom, String tel, String date_naissance, String country,
			String city) {
		super(id_user, nom, prenom, tel, date_naissance, country, city);
		// TODO Auto-generated constructor stub
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
