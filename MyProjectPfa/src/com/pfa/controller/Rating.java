package com.pfa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.DisponibiliteDaoImp;
import com.pfa.dao.IDisponibiliteDao;
import com.pfa.dao.IInterventionDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.InterventionDaoImp;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.Intervention;
import com.pfa.model.Message;

/**
 * Servlet implementation class Rating
 */
@WebServlet("/Rating")
public class Rating extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Rating() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id3 = Integer.parseInt(request.getParameter("rating"));
	
		
		//recuper id et indiquer travaux terminer par modification du champ etat=1 dans table intervention
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id_c");
		IInterventionDao dao2 = new InterventionDaoImp();
		Intervention intervention=dao2.getInterventionByContratId(id);
		Contrat contrat=intervention.getContrat();
		Disponibilite dispo=contrat.getDispo();
		double rating=dispo.getRating();
		int nbre_rating=dispo.getNbre_rating();
		double rating1=rating+id3;
		int nbre_rating1=nbre_rating+1;
		dispo.setNbre_rating(nbre_rating1);
		dispo.setRating(rating1);
		IDisponibiliteDao dao4= new DisponibiliteDaoImp();
		dao4.update(dispo);
		int a =intervention.getId();
		System.out.println(a);
		int etat=intervention.getEtat();
		System.out.println(etat);
		intervention.setEtat(1);
		dao2.update(intervention);
		//recuperer id compte
		
		Compte compte = (Compte) session.getAttribute("compte");
		int id1=compte.getId();
		//recuperer id dispo
		
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
		
		}
		response.sendRedirect("Accueil");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
