package com.unhomie.fpij.concept.functional.interfaces.five;

import com.unhomie.fpij.concept.functional.interfaces.generic.impl.restricted.CountyReceipt;

public class Main {
	public static void main(String[] args) {
		ReceiptPrinter simpleReceiptPrinter = new ReceiptPrinter() {
			@Override
			public void print(Receipt receipt) {
				System.out.println("\nItem: \t" + receipt.item);
				System.out.println("Price: \t" + receipt.price);
				System.out.println("Disc: \t" + receipt.discount);
				System.out.println("Tax: \t" + receipt.tax);
				System.out.println("Total: \t" + computeTotal(receipt));
			}
		};

		ReceiptPrinter exemptReceiptPrinter = new ReceiptPrinter() {
			@Override
			public void print(Receipt receipt) {
				System.out.println("\nItem: \t" + receipt.item);
				System.out.println("Price: \t" + receipt.price);
				System.out.println("Disc: \t" + receipt.discount);
				System.out.println("Total: \t" + computeTotal(receipt));
			}

			@Override
			public double computeTotal(Receipt receipt) {
				return receipt.price - (receipt.price * receipt.discount);
			}
		};

		ReceiptPrinterV2<CountyReceipt> countyReceiptPrinter = new ReceiptPrinterV2<>() {

			@Override
			public void print(CountyReceipt receipt) {
				System.out.println("\nItem: \t" + receipt.item);
				System.out.println("Price: \t" + receipt.price);
				System.out.println("Disc: \t" + receipt.discount);
				System.out.println("Tax: \t" + receipt.tax);
				System.out.println("CnTax: \t" + receipt.countyTax);
				System.out.println("Total: \t" + computeTotal(receipt));
			}

			public double computeTotal(CountyReceipt receipt) {
				double discountedPrice = receipt.price - (receipt.price * receipt.discount);

				return discountedPrice
						+ (discountedPrice * receipt.tax)
						+ (discountedPrice * receipt.countyTax);
			}

		};
		Receipt receipt = new Receipt("shirt", 20.00, 0.05, 0.07);
		simpleReceiptPrinter.print(receipt);
		exemptReceiptPrinter.print(receipt);

		CountyReceipt countyReceipt = new CountyReceipt(receipt, 0.04);
		countyReceiptPrinter.print(countyReceipt);
	}
}
