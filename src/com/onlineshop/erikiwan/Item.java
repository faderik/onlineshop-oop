package com.onlineshop.erikiwan;

public class Item {
	private int quantity;
	private Product product;
	
	public Item(Integer quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double getTotalPrice() {
		return product.getPrice() * this.getQuantity();
	}
	
}
