package com.pfa.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.DemandeurDaoImp;
import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IDemandeurDao;
import com.pfa.dao.IGestionDao;
import com.pfa.dao.IUserDao;
import com.pfa.dao.UserDaoImp;
import com.pfa.model.Compte;
import com.pfa.model.DemandeurService;
import com.pfa.model.Role;
import com.pfa.model.User;

/**
 * Servlet implementation class Ajout_User
 */
@WebServlet("/Ajout_Demandeur")
public class Ajout_Demandeur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ajout_Demandeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("inscri_user.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IDemandeurDao dao = new DemandeurDaoImp();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tel = request.getParameter("tel");
		String pays = request.getParameter("pays");
		String ville = request.getParameter("city");
		String date_naissance = request.getParameter("date");

		DemandeurService user=new DemandeurService();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setTel(tel);
		user.setCountry(pays);
		user.setCity(ville);
		user.setDate_naissance(date_naissance);
		dao.addDemandeur(user);

		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		IGestionDao dao1 = new GestionDaoImp();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//crypter password 
		String pass=dao1.encrypt( password);
		Timestamp date_creation = null;

		int id_role = 2;
		Role role = dao1.getRoleById(id_role);

		Compte compte = new Compte();
		compte.setEmail(email);
		compte.setPassword(pass);

		compte.setDate_creation(date_creation);
		compte.setUser(user);
		compte.setRole(role);
		dao1.addCompte(compte);

		session.setAttribute("compte", compte);

		

		response.sendRedirect("Accueil");
	}

}
