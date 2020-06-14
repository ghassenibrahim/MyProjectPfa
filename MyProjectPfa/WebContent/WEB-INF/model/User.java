package com.pfa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="user")
public class User {
	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_user;
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
		this.id_user = id_user;
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
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
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
		return "User [id_user=" + id_user + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", date_naissance="
				+ date_naissance + ", country=" + country + ", city=" + city + "]";
	}
	
	
}
