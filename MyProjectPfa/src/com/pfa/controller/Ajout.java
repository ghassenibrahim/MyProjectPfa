package com.pfa.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.pfa.dao.DisponibiliteDaoImp;
import com.pfa.dao.FournisseurDaoImp;
import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IDisponibiliteDao;
import com.pfa.dao.IFournisseurDaoImp;
import com.pfa.dao.IGestionDao;
import com.pfa.model.Compte;
import com.pfa.model.Disponibilite;
import com.pfa.model.FournisseurService;
import com.pfa.model.Role;
import com.pfa.model.Service;

/**
 * Servlet implementation class Ajout
 */
@WebServlet("/Ajout")
public class Ajout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ajout() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("inscri_fournisseur2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IFournisseurDaoImp dao = new FournisseurDaoImp();
		IGestionDao dao1 = new GestionDaoImp();
		IDisponibiliteDao dao2 = new DisponibiliteDaoImp();
		//recuperer les parametres du fournisseur
		String description = request.getParameter("description");
		String prix = request.getParameter("prix");
		String tags = "tags";
		String experience = request.getParameter("experience");
		String image = request.getParameter("image");

		HttpSession session = request.getSession();
		FournisseurService f = (com.pfa.model.FournisseurService) session.getAttribute("fournisseur");
		
		// ajouter les parametres du fournisseur
		f.setDescription(description);
		f.setExperience(experience);
		f.setPrix(prix);
		f.setTags(tags);
		f.setImage(image);
		dao.addFournisseur(f);
		session.setAttribute("user", f);
		
        //cree compte 
		Compte compte = (Compte) session.getAttribute("compte");
		dao1.addCompte(compte);
		
        //ajouter specialite du fournisseur
		Disponibilite d = new Disponibilite();
		int specialite=Integer.parseInt(request.getParameter("specialite"));
		Service service = dao2.getServiceById(specialite);
		d.setService(service);
		d.setCompte(compte);
		d.setDispo(1);
		dao2.addDisponibilite(d);
		response.sendRedirect("Accueil");

	}
}