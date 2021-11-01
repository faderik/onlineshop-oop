package com.onlineshop.erikiwan;

public class DigitalWallet implements Payment {
	private String walletId;
	private String number;
	
	public DigitalWallet(String walletId, String number) {
		super();
		this.walletId = walletId;
		this.number = number;
	}

	public String getWalletId() {
		return walletId;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void processPayment(Order order) {
		System.out.println("Order dengan ID : " + order.getId() + "\n" +
				" dengan total : " + order.getTotalPrice() + "\n" +
				" berhasil dibayar dengan Dompet Digital : " + this.getWalletId() +  "\n" +
				" dengan Nomor : " + this.getNumber() + "\n"
		);
		order.updateStatus("lunas");
		
	}
	
	
	
}
