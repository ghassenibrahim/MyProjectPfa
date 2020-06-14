package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contrat")
public class Contrat {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_contrat;
	@Column(name="id_fournisseur")
	private int id_fournisseur;
	@Column(name="id_demande")
	private int id_demande;
	@Column(name="date")
	private String date;
	@Column(name="description")
	private String description;
	@Column(name="validation")
	private int validation;
	
	public Contrat(int id_contrat, int id_fournisseur, int id_demande, String date, String description,
			int validation) {
		super();
		this.id_contrat = id_contrat;
		this.id_fournisseur = id_fournisseur;
		this.id_demande = id_demande;
		this.date = date;
		this.description = description;
		this.validation = validation;
	}
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_contrat() {
		return id_contrat;
	}
	public void setId_contrat(int id_contrat) {
		this.id_contrat = id_contrat;
	}
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public int getId_demande() {
		return id_demande;
	}
	public void setId_demande(int id_demande) {
		this.id_demande = id_demande;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getValidation() {
		return validation;
	}
	public void setValidation(int validation) {
		this.validation = validation;
	}
	

}
