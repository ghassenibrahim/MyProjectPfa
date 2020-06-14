package com.pfa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pfa.dao.GestionDaoImp;
import com.pfa.dao.IGestionDao;
import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Compte;
import com.pfa.model.Message;

/**
 * Servlet implementation class DetailMsg
 */
@WebServlet("/DetailMsg")
public class DetailMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailMsg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// open session
		HttpSession session = request.getSession();
		//read msg
		IMessageDao dao1=new MessageDaoImpl();
		int id1 = Integer.parseInt(request.getParameter("id"));
		Message msg3 =dao1.getMessageById(id1);
		msg3.setReceiveread(1);
		dao1.update(msg3);
		
		
		//recuper id sender
		Message msg1 =dao1.getMessageById(id1);
		Compte sender=msg1.getSender();
		int id2=sender.getId();
		//recuper id receiver
		Compte compte = (Compte) session.getAttribute("compte");
		int id=compte.getId();
		List<Message>msg=dao1.getconverstaion(id,id2);
		
		List<Message>msg_reçu_nn_lu=dao1.getAllMessageRecusNonLu(id);
		int size = msg_reçu_nn_lu.size();
		request.setAttribute("size",size );
		request.setAttribute("msg", msg);
		session.setAttribute("id_receiver", id2);
		session.setAttribute("id_msg", id1);
		request.getRequestDispatcher("detail_msg.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
