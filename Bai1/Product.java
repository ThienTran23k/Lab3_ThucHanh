package Lab3;

import java.util.Scanner;

public class Product {
	public String description;
	public String productID;
	public static double price;
	public int quatity;
	

	
	public Product() {
	
	}
	
	public Product(String description,String productID,double price) {
		this.description = description;
		this.price = price;
		this.productID = productID;
	}
	OrderDetail o1 = new OrderDetail();
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getQuatity() {
		return quatity;
	}
	public String getDescription() {
		return description;
	}
	public static double getPrice() {
		return price;
	}
	public String getProductID() {
		return productID;
	}
	public void setDesciption(String desciption) {
		this.description = desciption;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	public void hien() {
		System.out.printf("%10s | %10s | %10.3f | %10d | %10.3f \n",productID,description,price,quatity,o1.calcTotalPrice());
	}
//	@Override
//	public String toString() {
//		return String.format("%-7s%-10s%-5f",productID,description,price);
//	}
	
}
