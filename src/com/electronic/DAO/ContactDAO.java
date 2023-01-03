package com.electronic.DAO;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;
import com.electronic.DAO.*;
import com.electronic.Model.*;


public class ContactDAO extends ConnectSQL{
	
	public static ArrayList<Category> getData() {
        ArrayList<Category> category= new ArrayList<Category>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Category" );
            while (rs.next()) {
            	Category categorys = new Category();
            	categorys.setCategoryID(rs.getInt("CategoryID"));
            	categorys.setName(rs.getString("Name"));
            	category.add(categorys);
            	
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return category;
      
	}
	public static ArrayList<Product> getDataa() {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product" );
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setImages(rs.getString("Images"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));            	
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return product;
      
	}
	public static ArrayList<Product> getDataSale() {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where Status ='Sale'" );
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setImages(rs.getString("Images"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));            	
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return product;
      
	}
	public static ArrayList<Product> getDataHot() {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where Status = 'Hot'" );
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setImages(rs.getString("Images"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));            	
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return product;
      
	}
	public static ArrayList<Product> getDataHotDeal() {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where Status ='Hot Deal'" );
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setImages(rs.getString("Images"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));            	
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return product;
      
	}
	public static ArrayList<Product> getDataNew() {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where Status ='New'" );
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setImages(rs.getString("Images"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));            	
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return product;
      
	}
	public static ArrayList<Product> getDataSlider() {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where Status ='Slider'" );
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setImages(rs.getString("Images"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));            	
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
        return product;
      
	}
	
	public static ArrayList<Product> getDataaByID(String ProductID) {
        ArrayList<Product> product= new ArrayList<Product>();
        try {
            Connection conn = ConnectSQL.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where ProductID =" +ProductID);
            while (rs.next()) {
            	Product products = new Product();
            	products.setProductID(rs.getString("ProductID"));
            	products.setName(rs.getString("Name"));
            	products.setDetail(rs.getString("Detail"));
            	products.setPrice(rs.getString("Price"));
            	products.setImages(rs.getString("Images"));
            	products.setPriceNew(rs.getString("PriceNew"));
            	products.setStatus(rs.getString("Status"));
            	products.setCategoryID(rs.getString("CategoryID"));
            	products.setProductID(rs.getString("ProductID"));
            
            	product.add(products);
            }
        }catch (Exception ex) {
            System.out.println("sai");
            ex.printStackTrace();
        }
        return product;
      
	}
	 public static void addUser(Connection conn, Account user) throws SQLException {
	        String sql = "Insert into Account( userName, password) values (?,?)";
	        PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, user.getUserName());
	        pstm.setString(2, user.getPassword());

	        pstm.executeUpdate();
	    }
	 public static void addProduct(Connection conn, Product pr) throws SQLException {
	        
		 	String sql = "INSERT INTO Product (Name, Detail, Price, PriceNew,  Images, Status) values (?,?,?,?,?,?) GO";
		 	System.out.println();
		 	PreparedStatement pstm = conn.prepareStatement(sql);
	        pstm.setString(1, pr.getName());
	        pstm.setString(2, pr.getDetail());
	        pstm.setString(3, pr.getPrice());
	        pstm.setString(4, pr.getPriceNew());
	        pstm.setString(5, pr.getImages()); 
	        pstm.setString(6, pr.getStatus());
	         	    

	        pstm.executeUpdate();
	        
	    }
	 
	 public static void updateData(Connection conn,Product pr) throws  SQLException{
	        String sql = "UPDATE Product SET Name=?, Detail=? , Price = ?, PriceNew = ?, Images= ?, Status = ?  where ProductID=? ";
	        PreparedStatement statement = conn.prepareStatement(sql);
	        statement.setString(1, pr.getName());
	        statement.setString(2, pr.getDetail());
	        statement.setString(3, pr.getPrice());
	        statement.setString(4, pr.getPriceNew());
	        statement.setString(5, pr.getImages());
	        statement.setString(6, pr.getStatus());
	        statement.setString(7, pr.getProductID());
	        int rowsInserted = statement.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println(" updated successfully!");
	        }
	        // close connection
	        conn.close();
	}
	    
	 
	 public static boolean delete(Connection conn, Product product) {
		 	String sql = "DELETE FROM Product WHERE ProductID = ?";
			try {
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, product.getProductID());
				if(pst.executeUpdate() > 0)
					return true;
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}

	 public static void addCart(Connection conn, String ProductID) {
	        
	        try {
	         String sql ="insert into Cart(Name,Price,Images,ProductID) Select Name,PriceNew,Images,ProductID from Product where ProductID=?";
	        	PreparedStatement pstm = conn.prepareStatement(sql);
	        	pstm.setString(1,ProductID);
		        pstm.executeUpdate();
	        }catch (Exception ex) {
	            System.out.println("error");
	            ex.printStackTrace();
	        }
	 }
	 public static ArrayList<Cart> getCart() {
	        ArrayList<Cart> cart= new ArrayList<Cart>();
	        try {
	            Connection conn = ConnectSQL.getConnection();
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from Cart");
            while (rs.next()) {
	            	Cart carts = new Cart();
	            	carts.setProductID(rs.getString("ProductID"));
	            	carts.setName(rs.getString("Name"));;
	            	carts.setPrice(rs.getString("Price"));
	            	carts.setImages(rs.getString("Images"));            	
	            	cart.add(carts);
	            }
	        }catch (Exception ex) {
	            System.out.println("error");
	            ex.printStackTrace();
	        }
	        return cart;
	 
	 }
	 public static boolean deleteCart(Connection conn, Cart cart) {
			String sql = "delete from Cart where ProductID = ?";
			try {
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, cart.getProductID());
				if(pst.executeUpdate() > 0)
					return true;
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
}
