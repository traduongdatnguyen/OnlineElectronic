package com.electronic.Model;

public class Cart {
	private String id;
	private String Name;
	private String Price;
	private String Images;
	private String ProductID;
	public Cart(String id, String name, String price, String images, String productID) {
		super();
		this.id = id;
		Name = name;
		Price = price;
		Images = images;
		ProductID = productID;
	}
	public Cart() {
		super();
	}
	
	
	public Cart(String productID) {
		super();
		ProductID = productID;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getImages() {
		return Images;
	}
	public void setImages(String images) {
		Images = images;
	}
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
	}
	
	
	
	

}
