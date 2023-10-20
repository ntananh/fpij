package com.unhomie.fpij.concept.functional.interfaces;

public interface I2 {

	String s = "I2";

	/*
	 * _static_ method belong to the interface
	 */
	static void method1() {
		System.out.println(s);
	}

	/*
	 * _default_ method is an implementation provided by the interface
	 * that does not have to be overridden by an implementing class
	 * _default_ methods help in the compilation of legacy code.
	 */
	default String method2(String x) {
		return s + x;
	}
}