package com.pfa.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="intervention")
public class Intervention {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private int etat;
	@OneToOne
	@JoinColumn(name = "contrat_id")
	private Contrat contrat;
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intervention(int id, int etat, Contrat contrat) {
		super();
		this.id = id;
		this.etat = etat;
		this.contrat = contrat;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}

	
}
