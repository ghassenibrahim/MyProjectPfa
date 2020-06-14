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
import com.pfa.dao.IServiceDao;
import com.pfa.dao.InterventionDaoImp;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.dao.ServiceDaoImp;
import com.pfa.model.Commentaire;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.Intervention;
import com.pfa.model.Message;
import com.pfa.model.Service;

/**
 * Servlet implementation class Profile
 */
@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		Compte compte = (Compte) session.getAttribute("compte");
		if (compte == null) {
			
			response.sendRedirect("Connexion");
		} else {
			int id = compte.getId();
			IDisponibiliteDao dao4=new DisponibiliteDaoImp();
			List<Disponibilite>dispo =dao4.getAllDispoByCompteId(id);
			
			if(dispo.size()>0) {
			
				
				request.setAttribute("dispo", dispo);
				session.setAttribute("dispo", dispo);
				
			
			}
			session.setAttribute("id",id);
			IMessageDao dao = new MessageDaoImpl();
			List<Message> msg_reçu_nn_lu = dao.getAllMessageRecusNonLu(id);
			int size = msg_reçu_nn_lu.size();
			request.setAttribute("size", size);
		    // size of contrat nn valide
			IContratDao dao2 = new ContratDaoImp();
			List<Contrat> contrat_nn_valide = dao2.getAllContratNnValide(id);
			int size2 = contrat_nn_valide.size();
			request.setAttribute("size2", size2);
			//liste de conversation
			List<Message>msg=dao.getAllMessageById(id);
			// get id first conversation
			if(msg.size()>0) {
			 Message m2=msg.get(0);
			Compte c3=m2.getReceiver();
			Compte c4=m2.getSender();
			int id_receiver=c3.getId();
			int id_sender=c4.getId();
			if(id==id_receiver) {
				//besoin de id compte pour recupere liste conversation
				session.setAttribute("id3",id_sender);
		
		}else {
			session.setAttribute("id3",id_receiver);
		}
		}
		
		//liste des service pour remplir la demande
		IServiceDao dao3 = new ServiceDaoImp();
		List<Service>service=dao3.getAllService();
		request.setAttribute("service", service);
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
