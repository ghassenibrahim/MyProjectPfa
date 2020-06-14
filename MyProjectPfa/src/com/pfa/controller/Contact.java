package com.pfa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.CommentaireDaoImp;
import com.pfa.dao.ContratDaoImp;
import com.pfa.dao.DisponibiliteDaoImp;
import com.pfa.dao.ICommentaireDao;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IDisponibiliteDao;
import com.pfa.dao.IInterventionDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.InterventionDaoImp;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Commentaire;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.FournisseurService;
import com.pfa.model.Intervention;
import com.pfa.model.Message;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Compte compte = (Compte) session.getAttribute("compte");
		if (compte == null) {
			// memoriser lien precedent
			String lien = "ListeBricoleur";
			session.setAttribute("lien", lien);
			response.sendRedirect("Connexion");
		} else {
			int id1 = compte.getId();
			IMessageDao dao7 = new MessageDaoImpl();
			//liste de conversation
			List<Message>msg=dao7.getAllMessageById(id1);
			// get id first conversation
			if(msg.size()>0) {
			 Message m2=msg.get(0);
			Compte c3=m2.getReceiver();
			Compte c4=m2.getSender();
			int id_receiver=c3.getId();
			int id_sender=c4.getId();
			if(id1==id_receiver) {
				//besoin de id compte pour recupere liste conversation
				session.setAttribute("id3",id_sender);
		
		}else {
			session.setAttribute("id3",id_receiver);
		}
		
			IDisponibiliteDao dao = new DisponibiliteDaoImp();
			int id = Integer.parseInt(request.getParameter("id"));
			Disponibilite dispo = dao.getDisponibiliteById(id);
			request.setAttribute("dispo", dispo);

			session.setAttribute("dispo_id", id);
			// size of msg reçu nn lu
			IMessageDao dao1 = new MessageDaoImpl();
			List<Message> msg_reçu_nn_lu = dao1.getAllMessageRecusNonLu(id);
			int size = msg_reçu_nn_lu.size();
			request.setAttribute("size", size);
			// size of contrat nn valide
			IContratDao dao2 = new ContratDaoImp();
			List<Contrat> contrat_nn_valide = dao2.getAllContratNnValide(id);
			int size2 = contrat_nn_valide.size();
			request.setAttribute("size2", size2);
			// liste des commenataire by dispo id
			ICommentaireDao dao3 = new CommentaireDaoImp();
			List<Commentaire> commentaire = dao3.getCommentaireByDispo(id);
			int size5 = commentaire.size();
			request.setAttribute("size5", size5);
			request.setAttribute("commentaire", commentaire);
			// verifier si ilya'a une intervention entre eux ou nn et reserver dans une
			// session

			// recuper compte user connecté

			int id_compte = compte.getId();

			// verifier si existe un contrat entre eux ou nn avec validation 1
			IContratDao dao4 = new ContratDaoImp();
			Contrat contrat = dao4.verif(id_compte, id);

			if (contrat == null) {
				Intervention intervention = null;
				session.setAttribute("intervention", intervention);
			} else {
				int id2 = contrat.getId();
				IInterventionDao dao5 = new InterventionDaoImp();
				Intervention intervention = dao5.getInterventionByIdContrat(id2);
				if (intervention == null) {
					Intervention intervention1 = null;
					session.setAttribute("intervention", intervention1);
				} else {
					session.setAttribute("intervention", intervention);

				}
			}
		}
		}
		request.getRequestDispatcher("contact.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
