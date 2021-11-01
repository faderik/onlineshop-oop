package com.onlineshop.erikiwan;

public class TransferBank implements Payment{
	private String bankId;
	private String number;
	
	public TransferBank(String bankId, String number) {
		super();
		this.bankId = bankId;
		this.number = number;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void processPayment(Order order) {
		System.out.println("Order dengan ID " + 
							order.getId() + 
							" berhasil dibayar dengan Transfer Bank " + this.getBankId() + 
							" dengan NoRek : " + this.getNumber()
		);
		order.updateStatus("lunas");
		
	}
	
	
}
