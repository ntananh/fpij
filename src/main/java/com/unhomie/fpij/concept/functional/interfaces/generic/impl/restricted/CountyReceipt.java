package com.unhomie.fpij.concept.functional.interfaces.generic.impl.restricted;

import com.unhomie.fpij.concept.functional.interfaces.five.Receipt;

public class CountyReceipt extends Receipt {
	public double countyTax;

	public CountyReceipt(Receipt r, double c) {
		super(r);
		countyTax = c;
	}
}
