package com.pfa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfa.dao.ContratDaoImp;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IInterventionDao;
import com.pfa.dao.InterventionDaoImp;
import com.pfa.model.Contrat;
import com.pfa.model.Intervention;

/**
 * Servlet implementation class AcceptContrat
 */
@WebServlet("/AcceptContrat")
public class AcceptContrat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptContrat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuper id et accept contrat par modification du champ validation=1
		int id = Integer.parseInt(request.getParameter("id"));
		IContratDao dao2 = new ContratDaoImp();
		Contrat contrat=dao2.getContratById(id);
		contrat.setValidation(1);
		dao2.update(contrat);
		IInterventionDao dao1=new InterventionDaoImp();
		Intervention intervention=new Intervention();
		intervention.setContrat(contrat);
		intervention.setEtat(0);
		dao1.addIntervention(intervention);
		response.sendRedirect("ListeContrat");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
