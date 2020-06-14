package com.pfa.dao;

import java.util.List;

import com.pfa.model.Contrat;
import com.pfa.model.Intervention;



public interface IInterventionDao {
	public Intervention getInterventionById(int id);
	public List<Intervention> getAllIntervention();
	public void  addIntervention(Intervention c);
	public void  deleteIntervention(int id);
	public Intervention update(Intervention c);
	public Intervention getInterventionByContratId(int id);
	public Intervention getInterventionByIdContrat(int id1);
	public List<Intervention> getAllInterventionEnCours(int id);

}
