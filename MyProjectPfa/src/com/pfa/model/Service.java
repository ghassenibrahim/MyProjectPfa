package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="service")
public class Service {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Categorie cat;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Service(int id, String libelle, Categorie cat) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.cat = cat;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	
	
	
}
