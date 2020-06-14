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
import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IContratDao;
import com.pfa.dao.IGestionDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Message;

/**
 * Servlet implementation class Send_msg
 */
@WebServlet("/Send_msg")
public class Send_msg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Send_msg() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int id1 = (int) session.getAttribute("id_receiver");
		IGestionDao dao2 = new GestionDaoImp();
		Compte receiver = dao2.getCompteById(id1);
		IMessageDao dao1 = new MessageDaoImpl();
		Compte compte = (Compte) session.getAttribute("compte");
		// size of msg re�u nn lu
		IMessageDao dao3 = new MessageDaoImpl();
		List<Message> msg_re�u_nn_lu = dao3.getAllMessageRecusNonLu(id1);
		int size = msg_re�u_nn_lu.size();
		request.setAttribute("size", size);
		// size of contrat nn valide
		IContratDao dao4 = new ContratDaoImp();
		List<Contrat> contrat_nn_valide = dao4.getAllContratNnValide(id1);
		int size2 = contrat_nn_valide.size();
		request.setAttribute("size2", size2);

		// repondre par un msg
		Message msg = new Message();
		String message = request.getParameter("message");
		msg.setDate(null);
		msg.setMessage(message);
		msg.setReceiver(receiver);
		msg.setSender(compte);
		msg.setReceivedel(0);
		msg.setSenddel(0);
		msg.setReceiveread(0);
		msg.setSendread(0);
		dao1.addMessage(msg);
		int id2 = (int) session.getAttribute("id_msg");
		response.sendRedirect("http://localhost:8085/MyProjectPfa/DetailMsg?id=" + id2 + "");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
