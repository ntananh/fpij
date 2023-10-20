package com.unhomie.fpij.concept.functional.interfaces;

import java.util.Random;

public interface I3 {

	/*
	 * In Java 9, interfaces are allowed to have private method,
	 * private methods are useful to call from default methods.
	 */
	private int getNumber() {
		return (new Random().nextInt(100));
	}

	default String M1(String s) {
		return s + getNumber();
	}

	;
}
