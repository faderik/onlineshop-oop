package com.onlineshop.erikiwan;

import java.util.ArrayList;
import java.util.Date;

public class OnlineShop {

	public static void main(String[] args) {
		// Customer mendaftar di toko online sekaligus menggenerate account
		Customer adi = new Customer("Adi", "Hidayat", "adi@gmail.com", "pwAdi");
		
		// Customer mengedit alamat
		Address addresAdi = new Address("Jl.Malioboro", 23, "Yogyakarta", "66666");
		adi.setAddress(addresAdi);
		
		// Toko menyediakan barang
		Product product1 = new Product("Laptop", "Computer", 12000.0);
		Product product2 = new Product("Mouse", "Accesories", 200.0);
		Product product3 = new Product("Keyboard", "Accesories", 340.0);
		
		// Customer memilih barang dan jumlahnya
		Item item1 = new Item(1, product1);
		Item item2 = new Item(3, product2);
		Item item3 = new Item(20, product2);
		Item item4 = new Item(20, product3);
		
		// Customer membuat list barang yang dipilih
		ArrayList<Item> items1 = new ArrayList<>();
		items1.add(item1);
		items1.add(item2);
		
		ArrayList<Item> items2 = new ArrayList<>();
		items2.add(item3);
		items2.add(item4);
		
		// Customer membuat order
		Order order1 = new Order("#001", new Date(), "Belum Lunas", items1);
		ArrayList<Order> orders = new ArrayList<>();
		orders.add(order1);
		adi.setOrders(orders);
		
		// Customer membuat Shoping Cart
		ShopingCart shopingCart1 = new ShopingCart(items2);
		adi.setShopingCart(shopingCart1);
		
		// Customer membayar order yang sudah ada (index 0)
		adi.purchase(0, "wallet", "#GoPay", "085723456311");
		
	}

}
