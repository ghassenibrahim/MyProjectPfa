package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_compte;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="date_creation")
	private String date_creation;
	@Column(name="id_user")
	private int id_user;
	@Column(name="id_role")
	private int id_role;
	
	public int getId_compte() {
		return id_compte;
	}
	public void setId_compte(int id_compte) {
		this.id_compte = id_compte;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	@Override
	public String toString() {
		return "Compte [id_compte=" + id_compte + ", email=" + email + ", password=" + password + ", date_creation="
				+ date_creation + ", id_user=" + id_user + ", id_role=" + id_role + "]";
	}
	
	

}
