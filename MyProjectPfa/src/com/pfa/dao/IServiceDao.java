package com.pfa.dao;

import java.util.List;

import com.pfa.model.Categorie;
import com.pfa.model.Service;


public interface IServiceDao {
	public Service getServiceById(int id);
	public List<Service> getAllService();
	public void  addService(Service c);
	public void  deleteDemandeur(int id);
	public Service update(Service c);
	public Categorie getCategorieById(int id);
	public List<Categorie> getAllCategorie();

}
