package Lab3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	public int orderID;
	public LocalDate orderDate;
	public OrderDetail lineItems;
	public int count;
	
	public Order() {
		
	}
	public Order(int orderID ,LocalDate orderDate ) {
		this.orderID = orderID;
		this.orderDate = orderDate;
	}

	
	public int getCount() {
		return count;
	}
	public OrderDetail getLineitems() {
		return lineItems;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setLineitems(OrderDetail lineitems) {
		this.lineItems = lineitems;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public void addLineItem(Product p , int x) {
		lineItems.add(new OrderDetail(p,x));
	}
	public double calcTotalCharge(){
		return Product.getPrice()*lineItems.getQuatity();
	}
//	public String toString(){
//		return String.format("%-5d %-10s",orderID,orderDate);
//	}
}

