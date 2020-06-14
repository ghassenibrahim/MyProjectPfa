package com.pfa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfa.dao.ContratDaoImp;
import com.pfa.dao.IContratDao;
import com.pfa.model.Contrat;

/**
 * Servlet implementation class DeleteContratEnvoye
 */
@WebServlet("/DeleteContratEnvoye")
public class DeleteContratEnvoye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteContratEnvoye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recuper id et supp contrat par modification du champ receivedel=1
		int id = Integer.parseInt(request.getParameter("id"));
		IContratDao dao2 = new ContratDaoImp();
		Contrat contrat=dao2.getContratById(id);
		contrat.setReceivedel(1);
		contrat.setSenddel(1);
		dao2.update(contrat);
		response.sendRedirect("ContratEnvoye");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
