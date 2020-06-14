package com.pfa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.ContratDaoImp;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IInterventionDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.InterventionDaoImp;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Intervention;
import com.pfa.model.Message;

/**
 * Servlet implementation class Contratenvoye
 */
@WebServlet("/ContratEnvoye")
public class ContratEnvoye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContratEnvoye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuperer id compte
		HttpSession session = request.getSession();
		Compte compte = (Compte) session.getAttribute("compte");
	
		int id=compte.getId();
		IMessageDao dao7 = new MessageDaoImpl();
		//liste de conversation
		List<Message>msg=dao7.getAllMessageById(id);
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
		
		// size of contrat nn valide
		IContratDao dao2 = new ContratDaoImp();
		List<Contrat> contrat_nn_valide = dao2.getAllContratNnValide(id);
		int size2 = contrat_nn_valide.size();
		request.setAttribute("size2", size2);

		// size of msg reçu nn lu
		IMessageDao dao1=new MessageDaoImpl();
		List<Message>msg_reçu_nn_lu=dao1.getAllMessageRecusNonLu(id);
		int size = msg_reçu_nn_lu.size();
		request.setAttribute("size",size );
		
		//liste des contrat recus
		List<Contrat>contrat_reçu=dao2.getAllContratRecus(id);
		int size1 = contrat_reçu.size();
		request.setAttribute("size1",size1 );
		request.setAttribute("contrat_reçu",contrat_reçu );
		
		// liste des contrat en cours d'exucution
				IInterventionDao dao3 = new InterventionDaoImp();
				List<Intervention> intervention_en_cours_execution = dao3.getAllInterventionEnCours(id);
				int size3 = intervention_en_cours_execution.size();
				request.setAttribute("size3", size3);
				request.setAttribute("intervention_en_cours_execution", intervention_en_cours_execution);
				//liste des contrat evoyé
				List<Contrat>contrat_evoye=dao2.getAllContratEnvoye(id);
				int size4 = contrat_evoye.size();
				request.setAttribute("size4",size4 );
				request.setAttribute("contrat_evoye",contrat_evoye );
		request.getRequestDispatcher("contratenvoye.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
