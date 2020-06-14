package com.pfa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class Service {
	@Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id_service;
	@Column(name="id_cat")
	private int id_cat;
	@Column(name="service")
	private String service;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(int id_service, int id_cat, String service) {
		super();
		this.id_service = id_service;
		this.id_cat = id_cat;
		this.service = service;
	}
	public int getId_service() {
		return id_service;
	}
	public void setId_service(int id_service) {
		this.id_service = id_service;
	}
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}

}
