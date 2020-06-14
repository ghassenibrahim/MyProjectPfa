package com.pfa.model;

import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="disponibilite")
public class Disponibilite {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
    private int dispo;
    private double rating;
    private int nbre_rating;
    

	@ManyToOne
	@JoinColumn(name="compte_id")
	private Compte compte;
	@JoinColumn(name="service_id")
	private Service service;
	
	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disponibilite(int id, int dispo, double rating, int nbre_rating, Compte compte, Service service) {
		super();
		this.id = id;
		this.dispo = dispo;
		this.rating = rating;
		this.nbre_rating = nbre_rating;
		this.compte = compte;
		this.service = service;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDispo() {
		return dispo;
	}
	public void setDispo(int dispo) {
		this.dispo = dispo;
	}
	public double getRating() {
		return rating;
	}
	public String getResult(double actualRating) {
		DecimalFormat df= new DecimalFormat();
		df.setMaximumFractionDigits(1);
		return df.format(actualRating);
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNbre_rating() {
		return nbre_rating;
	}
	public void setNbre_rating(int nbre_rating) {
		this.nbre_rating = nbre_rating;
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