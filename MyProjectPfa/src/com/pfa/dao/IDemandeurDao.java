package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.DemandeurService;
import com.pfa.model.Role;


public interface IDemandeurDao {
	public DemandeurService getDemandeurById(int id);
	public List<DemandeurService> getAllDemandeur();
	public void  addDemandeur(DemandeurService c);
	public void  deleteDemandeur(int id);
	public DemandeurService update(DemandeurService c);
	public Role getRoleById(int id);
	public List<Compte> getAllCompte();
	
	

}
