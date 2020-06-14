package com.pfa.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.DemandeDaoImp;
import com.pfa.dao.IDemandeDao;
import com.pfa.dao.IDemandeurDao;
import com.pfa.dao.IServiceDao;
import com.pfa.dao.ServiceDaoImp;
import com.pfa.model.Compte;
import com.pfa.model.Demande;
import com.pfa.model.Service;

/**
 * Servlet implementation class AddDemande
 */
@WebServlet("/AddDemande")
public class AddDemande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDemande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuper compte connecté par la session
				HttpSession session = request.getSession();
				Compte compte = (Compte) session.getAttribute("compte");
		if (compte != null) {
		IDemandeDao dao =new DemandeDaoImp();
		
		//recuperer les champs
		//String service_id=request.getParameter("prix");
		String prix = request.getParameter("prix");
		String date = request.getParameter("date");
		String titre = request.getParameter("titre");
		
		String description = request.getParameter("description");
		String image = request.getParameter("image");
		String date_travaux= request.getParameter("date_travaux");
		String address = request.getParameter("address");
		//recuper service souhaité
		//int specialite=Integer.parseInt(request.getParameter("specialite"));
		IServiceDao dao3 = new ServiceDaoImp();
		int specialite=Integer.parseInt(request.getParameter("specialite"));
		Service service = dao3.getServiceById(specialite);
		//ajouter demande
		Demande d=new Demande();
		Timestamp date_pub = null;
		d.setCompte(compte);
		d.setAddress(address);
		d.setDate_pub(date_pub);
		d.setDate_travaux(date_travaux);
		d.setDescription(description);
		d.setTitre(titre);
		d.setImage(image);
		d.setPrix(prix);
		d.setService(service);
		dao.addDemande(d);
		response.sendRedirect("Accueil");
		}else {
			response.sendRedirect("Connexion");
		}
		}
		
		
	}


