package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.Promo;
import com.pfa.model.Service;

public interface IPromoDao {
	public Promo getPromoById(int id);
	public List<Promo> getAllPromo();
	public void  addPromo(Promo c);
	public void  deletePromo(int id);
	public Promo update(Promo c);
	public List<Compte> getAllCompte();
	public Compte getCompteById(int id);
	public Service getServiceById(int id);
	public List<Service> getAllService();
}
