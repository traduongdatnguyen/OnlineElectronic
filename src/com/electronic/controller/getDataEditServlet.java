package com.electronic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.electronic.DAO.ContactDAO;
import com.electronic.Model.Product;

/**
 * Servlet implementation class getDataEditServlet
 */
@WebServlet("/getDataEditServlet")
public class getDataEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int String = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDataEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		List<Product> listProductByID= ContactDAO.getDataaByID(id);
		request.setAttribute("listProductByID", listProductByID);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/edit.jsp");
		dispatcher.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
