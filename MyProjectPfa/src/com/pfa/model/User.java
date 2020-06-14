package com.pfa.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="record_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="person_type")
public  abstract class User  {
	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="tel")
	private String tel;
	@Column(name="date_naissance")
	private String date_naissance;
	@Column(name="country")
	private String country;
	@Column(name="city")
	private String city;
	
	
	 
	public User(int id_user, String nom, String prenom, String tel, String date_naissance, String country,
			String city) {
		super();
		this.id = id_user;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.date_naissance = date_naissance;
		this.country = country;
		this.city = city;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id_user) {
		this.id = id_user;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [id_user=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", date_naissance="
				+ date_naissance + ", country=" + country + ", city=" + city + "]";
	}
	
	
}
