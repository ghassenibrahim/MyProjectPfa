package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.Disponibilite;
import com.pfa.model.Role;
import com.pfa.model.Service;
import com.pfa.model.User;





public interface IDisponibiliteDao {
	public Disponibilite getDisponibiliteById(int id);
	public List<Disponibilite> getAllDisponibilite();
	public void  addDisponibilite(Disponibilite c);
	public void  deleteDisponibilite(int id);
	public Disponibilite update(Disponibilite c);
	public List<Compte> getAllCompte();
	public Compte getCompteById(int id);
	public Service getServiceById(int id);
	public List<Service> getAllService();
	public List<Disponibilite> getAllServiceId(int id);
	public List<Disponibilite> getAllDispoByCompteId(int id);
	public List<Disponibilite> Recherche(String o);
	public Disponibilite getDispo(int id1, int id2);

}
