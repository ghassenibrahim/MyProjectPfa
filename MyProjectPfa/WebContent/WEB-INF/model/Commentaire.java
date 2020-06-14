package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commentaire")
public class Commentaire {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_commentaire;
	@Column(name="id_intervention")
	private int id_intervention;
	@Column(name="note")
	private int note;
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commentaire(int id_commentaire, int id_intervention, int note) {
		super();
		this.id_commentaire = id_commentaire;
		this.id_intervention = id_intervention;
		this.note = note;
	}
	public int getId_commentaire() {
		return id_commentaire;
	}
	public void setId_commentaire(int id_commentaire) {
		this.id_commentaire = id_commentaire;
	}
	public int getId_intervention() {
		return id_intervention;
	}
	public void setId_intervention(int id_intervention) {
		this.id_intervention = id_intervention;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	

}
