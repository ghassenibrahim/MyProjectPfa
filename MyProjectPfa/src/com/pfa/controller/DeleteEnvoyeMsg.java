package com.pfa.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfa.dao.IMessageDao;
import com.pfa.dao.MessageDaoImpl;
import com.pfa.model.Message;

/**
 * Servlet implementation class DeleteEnvoyeMsg
 */
@WebServlet("/DeleteEnvoyeMsg")
public class DeleteEnvoyeMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEnvoyeMsg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		IMessageDao dao=new MessageDaoImpl();
		Message msg =dao.getMessageById(id);
		msg.setReceivedel(1);
		
		dao.update(msg);
		response.sendRedirect("http://localhost:8085/MyProjectPfa/Msg");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
