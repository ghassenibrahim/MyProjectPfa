package com.pfa.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Commentaire {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String comment ;
	private Timestamp date;
	@ManyToOne
	@JoinColumn(name="intervention_id")
	private Intervention intervention;
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commentaire(int id, String comment, Timestamp date, Intervention intervention) {
		super();
		this.id = id;
		this.comment = comment;
		this.date = date;
		this.intervention = intervention;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public Intervention getIntervention() {
		return intervention;
	}
	public void setIntervention(Intervention intervention) {
		this.intervention = intervention;
	}
	
	

}
