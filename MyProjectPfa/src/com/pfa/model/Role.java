package com.pfa.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;
@Entity
@Table(name="role")
public class Role {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_role;
	@Column(name="type_compte")
	private String type_compte;
	
	
	
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	public String getType_compte() {
		return type_compte;
	}
	public void setType_compte(String type_compte) {
		this.type_compte = type_compte;
	}
	public Role(int id_role, String type_compte) {
		super();
		this.id_role = id_role;
		this.type_compte = type_compte;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
