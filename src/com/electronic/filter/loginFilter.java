package com.electronic.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.electronic.DAO.ConnectSQL;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter(urlPatterns = {"/IndexServlet"})
public class loginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public loginFilter() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request1, ServletResponse response2, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) request1;
		HttpServletResponse response=(HttpServletResponse) response2;
		String name=request.getParameter("userName");
		String pass=request.getParameter("password");
		
		Connection coon= ConnectSQL.getConnection();
		String querry= "select id  from Account where userName=? and password=?";
		HttpSession sess=request.getSession();
		Object o=sess.getAttribute("nick");
		if(o!=null) {
			chain.doFilter(request, response);
		}else {
		try {
		
			PreparedStatement stm=coon.prepareStatement(querry);
			stm.setString(1, name);
			stm.setString(2, pass);
			ResultSet rs=stm.executeQuery();
			if(rs.next()&&name!=null&&pass!=null) {
				sess.setAttribute("nick",name);
				sess.setAttribute("id",rs.getInt(1));
				chain.doFilter(request1, response2);
				
			}else {
				response.sendRedirect("/ThiGK//loginServlet");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
