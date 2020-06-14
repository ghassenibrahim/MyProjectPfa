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
import com.pfa.dao.IContratDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Contrat;
import com.pfa.model.Message;

/**
 * Servlet implementation class MsgEnvoye
 */
@WebServlet("/MsgEnvoye")
public class MsgEnvoye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MsgEnvoye() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		IMessageDao dao1=new MessageDaoImpl();
		Compte compte = (Compte) session.getAttribute("compte");
		int id=compte.getId();
		List<Message>msg_envoye=dao1.getAllMessageEnvoye(id);
		List<Message>msg_reçu_nn_lu=dao1.getAllMessageRecusNonLu(id);
		int size = msg_reçu_nn_lu.size();
		int size1 = msg_envoye.size();
		request.setAttribute("size",size );
		request.setAttribute("size1",size1 );
		request.setAttribute("msg_envoye", msg_envoye);
		
					 // size of contrat nn valide
					IContratDao dao2 = new ContratDaoImp();
					List<Contrat> contrat_nn_valide = dao2.getAllContratNnValide(id);
					int size2 = contrat_nn_valide.size();
					request.setAttribute("size2", size2);
		request.getRequestDispatcher("msg_envoye.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
