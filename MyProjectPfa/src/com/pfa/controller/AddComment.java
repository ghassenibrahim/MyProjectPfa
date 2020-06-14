package com.pfa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.CommentaireDaoImp;
import com.pfa.dao.ContratDaoImp;
import com.pfa.dao.DisponibiliteDaoImp;
import com.pfa.dao.ICommentaireDao;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IDisponibiliteDao;
import com.pfa.dao.IInterventionDao;
import com.pfa.dao.InterventionDaoImp;
import com.pfa.model.Commentaire;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Disponibilite;
import com.pfa.model.Intervention;
import com.pfa.model.Message;

/**
 * Servlet implementation class AddComment
 */
@WebServlet("/AddComment")
public class AddComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuper compte user connecté
		HttpSession session = request.getSession();
		Compte compte = (Compte) session.getAttribute("compte");
		int id_compte=compte.getId();
		//recuper id dispo
		
		int id1 = (int) session.getAttribute("dispo_id");
		//verifier si existe un contrat entre eux ou nn avec validation 1
		IContratDao dao3=new ContratDaoImp();
		Contrat contrat=dao3.verif(id_compte,id1);
		
	
		if(contrat==null) {
			Intervention intervention=null;
			session.setAttribute("intervention",intervention);
		}else {
			int id =contrat.getId();
			IInterventionDao dao1=new InterventionDaoImp();
			Intervention intervention=dao1.getInterventionByIdContrat(id);
			if(intervention==null) {
				Intervention intervention1=null;
				session.setAttribute("intervention",intervention1);
			}else {
				session.setAttribute("intervention",intervention);
		//ajouter comment
		ICommentaireDao dao=new CommentaireDaoImp();
		
		Commentaire commentaire=new Commentaire();
		String comment=request.getParameter("comment");
		commentaire.setComment(comment);
		commentaire.setIntervention(intervention);
		dao.addCommentaire(commentaire);
		response.sendRedirect("http://localhost:8085/MyProjectPfa/Contact?id="+id1+"");
		}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
