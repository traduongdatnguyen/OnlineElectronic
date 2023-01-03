package com.electronic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.electronic.DAO.*;
import com.electronic.Model.*;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> listCategory= ContactDAO.getData();
		List<Product> listProductSale= ContactDAO.getDataSale();
		List<Product> listProductHot= ContactDAO.getDataHot();
		List<Product> listProductHotDeal= ContactDAO.getDataHotDeal();
		List<Product> listProductNew= ContactDAO.getDataNew();
		List<Product> listProductSlider= ContactDAO.getDataSlider();
		request.setAttribute("listCategory", listCategory);
		request.setAttribute("listProductSale", listProductSale);
		request.setAttribute("listProductHot", listProductHot);
		request.setAttribute("listProductHotDeal", listProductHotDeal);
		request.setAttribute("listProductNew", listProductNew);
		request.setAttribute("listProductSlider", listProductSlider);
		Boolean check=false;
		Boolean admin = false;
		String Name=null;
		HttpSession sess=request.getSession();
		Object o=sess.getAttribute("nick");
		Name=sess.getAttribute("nick").toString();
		if(o!=null) {
			check=true;
		}
		if(o!=null && Name.equals("admin") ) {
			admin= true;
		}
		request.setAttribute("check", check);
		request.setAttribute("admin", admin);
		request.setAttribute("Name", Name);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
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
