package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disponibilite")
public class Disponibilite {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_dispo;
	@Column(name="id_service")
	private int id_service;
	@Column(name="id_fournisseur")
	private int id_fournisseur;
	@Column(name="dispo")
	private String dispo;
	public Disponibilite(int id_dispo, int id_service, int id_fournisseur, String dispo) {
		super();
		this.id_dispo = id_dispo;
		this.id_service = id_service;
		this.id_fournisseur = id_fournisseur;
		this.dispo = dispo;
	}
	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_dispo() {
		return id_dispo;
	}
	public void setId_dispo(int id_dispo) {
		this.id_dispo = id_dispo;
	}
	public int getId_service() {
		return id_service;
	}
	public void setId_service(int id_service) {
		this.id_service = id_service;
	}
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public String getDispo() {
		return dispo;
	}
	public void setDispo(String dispo) {
		this.dispo = dispo;
	}
	

}
