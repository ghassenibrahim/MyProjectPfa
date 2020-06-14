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
import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Message;

/**
 * Servlet implementation class DetailContrat
 */
@WebServlet("/DetailContrat")
public class DetailContrat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailContrat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Compte compte = (Compte) session.getAttribute("compte");
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
		}
		//recuper id et open contrat par modification du champ receiveread=1
				int id = Integer.parseInt(request.getParameter("id"));
				IContratDao dao2 = new ContratDaoImp();
				Contrat contrat=dao2.getContratById(id);
				request.setAttribute("c", contrat);
				contrat.setReceiveread(1);
				dao2.update(contrat);
				// size of msg reçu nn lu
				IMessageDao dao1=new MessageDaoImpl();
				List<Message>msg_reçu_nn_lu=dao1.getAllMessageRecusNonLu(id);
				int size = msg_reçu_nn_lu.size();
				request.setAttribute("size",size );
				 // size of contrat nn valide
				IContratDao dao3 = new ContratDaoImp();
				List<Contrat> contrat_nn_valide = dao3.getAllContratNnValide(id);
				int size2 = contrat_nn_valide.size();
				request.setAttribute("size2", size2);
				request.getRequestDispatcher("detailcontrat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
