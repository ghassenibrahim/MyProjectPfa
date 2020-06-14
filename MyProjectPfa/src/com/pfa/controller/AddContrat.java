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
import com.pfa.dao.DisponibiliteDaoImp;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IDisponibiliteDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.Message;


/**
 * Servlet implementation class AddContrat
 */
@WebServlet("/AddContrat")
public class AddContrat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContrat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuperer mes champs
		
		
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IContratDao dao = new ContratDaoImp();
		IDisponibiliteDao dao1 = new DisponibiliteDaoImp();
		String prix = request.getParameter("prix");
		String date = request.getParameter("date");
		String time= request.getParameter("time");
		String description = request.getParameter("description");
		String address = request.getParameter("address");
		HttpSession session = request.getSession();
		//recuperer dispo
		
		int id1 = (int) session.getAttribute("dispo_id");
		Disponibilite dispo=dao1.getDisponibiliteById(id1);
		
		//recuper compte connecté par la session
		
		Compte compte = (Compte) session.getAttribute("compte");
		//add contrat
		Contrat contrat =new Contrat();
		contrat.setDate(date);
		contrat.setDescription(description);
		contrat.setPrix(prix);
		contrat.setValidation(0);
		contrat.setTime(time);
		contrat.setDispo(dispo);
		contrat.setCompte(compte);
		contrat.setReceivedel(0);
		contrat.setReceiveread(0);
		contrat.setSenddel(0);
		contrat.setSendread(0);
		contrat.setAddress(address);
		dao.addContrat(contrat);
		
		int id=compte.getId();
		//size of contrat nn valide
		
		List<Contrat>contrat_nn_valide=dao.getAllContratNnValide(id);
		int size2 = contrat_nn_valide.size();
		request.setAttribute("size2",size2 );
		// size of msg reçu nn lu
				IMessageDao dao3=new MessageDaoImpl();
				List<Message>msg_reçu_nn_lu=dao3.getAllMessageRecusNonLu(id);
				int size = msg_reçu_nn_lu.size();
				request.setAttribute("size",size );

		//liste des contrat recus
		List<Contrat>contrat_reçu=dao.getAllContratRecus(id);
		int size1 = contrat_reçu.size();
		request.setAttribute("size1",size1 );
		request.setAttribute("contrat_reçu",contrat_reçu );
		
		//liste des contrat en cours d'exucution
				List<Contrat>contrat_en_cours_execution=dao.getAllContratEnCours(id);
				int size3 = contrat_en_cours_execution.size();
				request.setAttribute("size3",size3 );
				request.setAttribute("contrat_en_cours_execution",contrat_en_cours_execution );
				//liste des contrat evoyé
				List<Contrat>contrat_evoye=dao.getAllContratEnvoye(id);
				int size4 = contrat_evoye.size();
				request.setAttribute("size4",size4 );
				request.setAttribute("contrat_evoye",contrat_evoye );

		request.getRequestDispatcher("contratenvoye.jsp").forward(request, response);
	}

}
