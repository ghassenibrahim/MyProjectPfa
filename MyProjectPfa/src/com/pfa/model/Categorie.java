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
	private int id;
	@Column(name="cat")
	private String cat;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(int id_cat, String cat) {
		super();
		this.id = id_cat;
		this.cat = cat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id_cat) {
		this.id = id_cat;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	

}
