package com.pfa.dao;

import java.util.List;

import com.pfa.model.Commentaire;



public interface ICommentaireDao {
	public Commentaire getCommenataireById(int id);
	public List<Commentaire> getAllCommentaire();
	public void  addCommentaire(Commentaire c);
	public void  deleteCommentaire(int id);
	public Commentaire update(Commentaire c);
	public List<Commentaire> getCommentaireByDispo(int id);

}
