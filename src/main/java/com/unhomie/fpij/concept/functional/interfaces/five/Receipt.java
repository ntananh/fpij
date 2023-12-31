package com.unhomie.fpij.concept.functional.interfaces.five;

public class Receipt {
	public String item;
	public double price;
	public double discount;
	public double tax;

	public Receipt() {
	}

	public Receipt(String item, double price, double discount, double tax) {
		this.item = item;
		this.price = price;
		this.discount = discount;
		this.tax = tax;
	}

	public Receipt(Receipt receipt) {
		this.item = receipt.item;
		this.price = receipt.price;
		this.discount = receipt.discount;
		this.tax = receipt.tax;
	}
}