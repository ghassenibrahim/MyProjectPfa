package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;

import com.pfa.model.FournisseurService;

public interface IFournisseurDaoImp {
	public FournisseurService getFournisseurById(int id);
	public List<FournisseurService> getAllFournisseur();
	public void  addFournisseur(FournisseurService c);
	public void  deleteFournisseur(int id);
	public FournisseurService update(FournisseurService c);
	
}
