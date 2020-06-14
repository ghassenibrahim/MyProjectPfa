package com.pfa.dao;

import java.util.List;

import com.pfa.model.Categorie;


public interface ICategorieDao {
	public Categorie getCategorieById(int id);
	public List<Categorie> getAllCategorie();
	public void  addDemandeur(Categorie c);
	public void  deleteDemandeur(int id);
	public Categorie update(Categorie c);
	

}
