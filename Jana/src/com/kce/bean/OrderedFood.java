package com.kce.bean;

public class OrderedFood {
 private String Pname;
private int quantity;
public OrderedFood(String Pname, int quantity) {
	this.Pname = Pname;
	this.quantity = quantity;
}
public String getPname() {
	return Pname;
}
public int getQuantity() {
	return quantity;
}


}
