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
import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IGestionDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.Message;

/**
 * Servlet implementation class Messagerie
 */
@WebServlet("/Messagerie")
public class Messagerie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Messagerie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		IMessageDao dao1=new MessageDaoImpl();
		Compte compte = (Compte) session.getAttribute("compte");
		int id=compte.getId();
		
		
		//liste de conversation
		List<Message>msg=dao1.getAllMessageById(id);
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
		//conversation
		if (request.getParameter("id") != null) {
		int id1 = Integer.parseInt(request.getParameter("id"));
		session.setAttribute("contact_id",id1);
		//when open message we set receiveread value 1
		List<Message>message=dao1.getAllMessageNonReadInConversation(id1, id);
		  for (int i = 0; i < message.size(); i++) {
			 
		     Message m1=message.get(i);
		     m1.setReceiveread(1);
		     dao1.update(m1);
		    }
		
		List<Message> liste = dao1.getconverstaion(id, id1);
		request.setAttribute("c", liste);
		//recuper compte du personne que vous etes en contact avec lui
		IGestionDao dao2= new GestionDaoImp();
		Compte compte1=dao2.getCompteById(id1);
		request.setAttribute("c1", compte1);
		
		}else {
			List<Message> liste = dao1.getconverstaion(id,id);
			request.setAttribute("c", liste);
			
		}
		
		
		List<Message>msg_reçu_nn_lu=dao1.getAllMessageRecusNonLu(id);
		int size = msg_reçu_nn_lu.size();
		
		List<Message>msg_envoye=dao1.getAllMessageEnvoye(id);
		int size1 = msg_envoye.size();
		request.setAttribute("size1",size1 );
		request.setAttribute("size",size );
		request.setAttribute("list", msg);
		
					 // size of contrat nn valide
					IContratDao dao2 = new ContratDaoImp();
					List<Contrat> contrat_nn_valide = dao2.getAllContratNnValide(id);
					int size2 = contrat_nn_valide.size();
					request.setAttribute("size2", size2);
		request.getRequestDispatcher("messagerie.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
