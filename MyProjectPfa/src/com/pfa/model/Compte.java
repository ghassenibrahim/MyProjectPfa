package com.pfa.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="compte")
public class Compte {
	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="date_creation")
	private Timestamp date_creation;
	private int cnx;
	
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@JoinColumn(name="role_id")
	private Role role;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compte(int id, String email, String password, Timestamp date_creation, int cnx, User user, Role role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.date_creation = date_creation;
		this.cnx = cnx;
		this.user = user;
		this.role = role;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Timestamp getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Timestamp date_creation) {
		this.date_creation = date_creation;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getCnx() {
		return cnx;
	}
	public void setCnx(int cnx) {
		this.cnx = cnx;
	}
	
	
}