package com.pfa.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.DemandeurDaoImp;
import com.pfa.dao.FournisseurDaoImp;
import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IDemandeurDao;
import com.pfa.dao.IFournisseurDaoImp;
import com.pfa.dao.IGestionDao;
import com.pfa.model.Compte;
import com.pfa.model.DemandeurService;
import com.pfa.model.FournisseurService;
import com.pfa.model.Role;

/**
 * Servlet implementation class Ajout_Fournisseur
 */
@WebServlet("/Ajout_Fournisseur")
public class Ajout_Fournisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ajout_Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("inscri_fournisseur.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IFournisseurDaoImp dao = new FournisseurDaoImp();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tel = request.getParameter("tel");
		String pays = request.getParameter("pays");
		String ville = request.getParameter("city");
		String date_naissance = request.getParameter("date");
		

		FournisseurService f = new FournisseurService();
		f.setNom(nom);
		f.setPrenom(prenom);
		f.setTel(tel);
		f.setCountry(pays);
		f.setCity(ville);
		f.setDate_naissance(date_naissance);

		HttpSession session = request.getSession();
		session.setAttribute("fournisseur", f);
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//crypter password
		IGestionDao dao1 = new GestionDaoImp();
		String pass=dao1.encrypt( password);
		
		Timestamp date_creation = null;

		
		Role role = dao1.getRoleById(3);

		Compte compte = new Compte();
		compte.setEmail(email);
		compte.setPassword(pass);

		compte.setDate_creation(date_creation);
		compte.setUser(f);
		compte.setRole(role);
		session.setAttribute("compte", compte);
		response.sendRedirect("Ajout");
	}
}
