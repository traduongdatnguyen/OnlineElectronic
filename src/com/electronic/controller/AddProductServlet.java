package com.electronic.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.electronic.DAO.ConnectSQL;
import com.electronic.DAO.ContactDAO;
import com.electronic.Model.Account;
import com.electronic.Model.Product;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn= ConnectSQL.getConnection();
		String Name=request.getParameter("Name");
		String Detail=request.getParameter("Detail");
		String Price = request.getParameter("Price");
		String PriceNew=request.getParameter("PriceNew");
		String Images="Images/"+request.getParameter("Images");
		String Status = request.getParameter("Status");
		
		Product pr = new Product(Name,Detail,Price,PriceNew,Images,Status);
		
			ContactDAO da = new ContactDAO();
			try {
				da.addProduct(conn, pr);
				RequestDispatcher dispatcher=request.getRequestDispatcher("/add.jsp");
				response.sendRedirect("/ThiGK//IndexServlet");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
