package com.pfa.dao;

import java.util.List;

import com.pfa.model.Compte;
import com.pfa.model.Role;
import com.pfa.model.User;

public interface IGestionDao {
	public Compte getCompteById(int id);

	public Compte getCompteByEmail(String email);

	public List<Compte> getAllCompte();

	public void addCompte(Compte c);

	public void deleteCompte(int id);

	public Compte update(Compte c);

	public Role getRoleById(int id);

	public List<Role> getAllCategorie();

	public User getUserById(int id);

	public List<User> getAllUser();

	public Compte verif(String email, String pass);

	public String encrypt(String password);

	public String decrypt(String password);
}
