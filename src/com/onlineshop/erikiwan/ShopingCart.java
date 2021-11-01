package com.onlineshop.erikiwan;

import java.util.ArrayList;

public class ShopingCart {
	private ArrayList<Item> items;

	public ShopingCart(ArrayList<Item> items) {
		super();
		this.items = items;
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
	
	public void update(ArrayList<Item> items) {
		this.setItems(items);
	}
	
	public void empty() {
		this.getItems().clear();
	}
	
	public void delete(int index) {
		this.getItems().remove(index);
	}
	
	
}
