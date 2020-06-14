package com.pfa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.DisponibiliteDaoImp;
import com.pfa.dao.IDisponibiliteDao;
import com.pfa.model.Compte;
import com.pfa.model.Disponibilite;

/**
 * Servlet implementation class ChangeDispo
 */
@WebServlet("/ChangeDispo")
public class ChangeDispo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeDispo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Compte compte = (Compte) session.getAttribute("compte");
		int id = compte.getId();
		IDisponibiliteDao dao = new DisponibiliteDaoImp();
		int specialite=Integer.parseInt(request.getParameter("specialite"));
		Disponibilite dispo =dao.getDisponibiliteById(specialite);
		String c=request.getParameter("c");
		if(c==null) {
		dispo.setDispo(0);
		}else {
			dispo.setDispo(1);	
		}
		dao.update(dispo);
		response.sendRedirect("Profile");
		
	}

}
