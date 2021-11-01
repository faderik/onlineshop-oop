package com.onlineshop.erikiwan;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String id;
	private Date date;
	private String status;
	private ArrayList<Item> items;
	
	public Order(String id, Date date, String status, ArrayList<Item> items) {
		super();
		this.id = id;
		this.date = date;
		this.status = status;
		this.items = items;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void updateStatus(String status) {
		this.setStatus(status);
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public Double getTotalPrice() {
		Double total = 0.0;
		
		for (int counter = 0; counter < this.getItems().size(); counter++) {
	          total += this.getItems().get(counter).getTotalPrice();
	    }
		
		return total;
	}
	
}
