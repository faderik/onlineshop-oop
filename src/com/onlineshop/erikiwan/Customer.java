package com.onlineshop.erikiwan;

import java.util.ArrayList;

public class Customer extends Account {
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private ShopingCart shopingCart;
	private ArrayList<Order> orders;
	
	public Customer(String firstName, String lastName, Address address, String phone, ShopingCart shopingCart,
			ArrayList<Order> orders) {
		super("#id", "example@gmail.com", "example");
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.shopingCart = shopingCart;
		this.orders = orders;
	}
	
	public Customer(String firstName, String lastName, String email, String password) {
		super("#id", email, password);
		this.firstName = firstName;
		this.lastName =  lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ShopingCart getShopingCart() {
		return shopingCart;
	}

	public void setShopingCart(ShopingCart shopingCart) {
		this.shopingCart = shopingCart;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	public void purchase(int index, String method, String id, String number) {
		// membayar order berdasar index list order dengan metode tertentu
		if(method == "wallet") {
			DigitalWallet pay = new DigitalWallet(id, number);
			pay.processPayment(this.getOrders().get(index));
		}
		else if(method == "bank") {
			TransferBank pay = new TransferBank(id, number);
			pay.processPayment(this.getOrders().get(index));
		}
		
		System.out.println(
				this.getFirstName() + 
				" telah membayar order ke " + index + "\n"
				);
		
	}
	
	public void updateCart(ArrayList<Item> items) {
		this.getShopingCart().update(items);
	}
	
	public void deleteCart(int index) {
		this.getShopingCart().delete(index);
	}
	
	public void updateAddress(String street, int streetNumber, String city, String postalCode) {
		this.getAddress().setStreet(street);
		this.getAddress().setStreetNumber(streetNumber);
		this.getAddress().setCity(city);
		this.getAddress().setPostalCode(postalCode);
	}
	
	public void emptyCart() {
		this.getShopingCart().empty();
	}
	
	
	
	
	
	
}
