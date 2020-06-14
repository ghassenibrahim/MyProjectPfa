package com.pfa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfa.dao.CategorieDaoImp;
import com.pfa.dao.ICategorieDao;
import com.pfa.dao.IServiceDao;
import com.pfa.dao.ServiceDaoImp;
import com.pfa.model.Categorie;
import com.pfa.model.Promo;
import com.pfa.model.Service;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ICategorieDao dao=new CategorieDaoImp();
		List<Categorie>cat=dao.getAllCategorie();
		IServiceDao dao1=new ServiceDaoImp();
		List<Service>service=dao1.getAllService();
		request.setAttribute("service",service);
		request.setAttribute("cat", cat);
		request.getRequestDispatcher("product.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
