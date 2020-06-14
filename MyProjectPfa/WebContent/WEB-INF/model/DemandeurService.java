package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demandeurservice")

public class DemandeurService {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_demandeur;
	@Column(name="id_compte")
	private int id_compte;
	public DemandeurService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DemandeurService(int id_demandeur, int id_compte) {
		super();
		this.id_demandeur = id_demandeur;
		this.id_compte = id_compte;
	}
	public int getId_demandeur() {
		return id_demandeur;
	}
	public void setId_demandeur(int id_demandeur) {
		this.id_demandeur = id_demandeur;
	}
	public int getId_compte() {
		return id_compte;
	}
	public void setId_compte(int id_compte) {
		this.id_compte = id_compte;
	}
	
	
}
