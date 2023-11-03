package com.unhomie.fpij.concept.functional.interfaces.five;

@FunctionalInterface
interface ReceiptPrinter {
	void print(Receipt receipt);

	private double getDiscountedPrice(Receipt receipt) {
		return receipt.price - (receipt.price * receipt.discount);
	}

	default double computeTotal(Receipt receipt) {
		double discountedPrice = getDiscountedPrice(receipt);
		return discountedPrice + (discountedPrice * receipt.tax);
	}
}
