package com.pfa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.FournisseurDaoImp;
import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IFournisseurDaoImp;
import com.pfa.dao.IGestionDao;
import com.pfa.model.Compte;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("connexion.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGestionDao dao = new GestionDaoImp();
		
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String pass =dao.decrypt( password);
		
		Compte compte=dao.verif(email, pass);
		if(compte==null) {
			response.sendRedirect("Connexion");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("compte",compte);
			
			int compte_id=compte.getId();
			session.setAttribute("compte_id",compte_id);
		
			String lien_precedent =(String) session.getAttribute("lien");
			if(lien_precedent==null) {
			response.sendRedirect("Accueil");
			}
			else {
				response.sendRedirect(lien_precedent);
			}
			}
		}
		}
	


