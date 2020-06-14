package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorie")
public class Categorie {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_cat;
	@Column(name="cat")
	private String cat;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(int id_cat, String cat) {
		super();
		this.id_cat = id_cat;
		this.cat = cat;
	}
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	

}
