package com.pfa.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="demandeur_service")
@DiscriminatorValue(value="Demandeur_type")
public class DemandeurService extends User {
	private String image;

	public DemandeurService() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public DemandeurService(int id_user, String nom, String prenom, String tel, String date_naissance, String country,
			String city, String image) {
		super(id_user, nom, prenom, tel, date_naissance, country, city);
		this.image = image;
	}



	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}
