package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avis")
public class Avis {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_avis;
	@Column(name="id_intervention")
	private int id_intervention;
	@Column(name="date")
	private String date;
	public Avis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Avis(int id_avis, int id_intervention, String date) {
		super();
		this.id_avis = id_avis;
		this.id_intervention = id_intervention;
		this.date = date;
	}
	public int getId_avis() {
		return id_avis;
	}
	public void setId_avis(int id_avis) {
		this.id_avis = id_avis;
	}
	public int getId_intervention() {
		return id_intervention;
	}
	public void setId_intervention(int id_intervention) {
		this.id_intervention = id_intervention;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
