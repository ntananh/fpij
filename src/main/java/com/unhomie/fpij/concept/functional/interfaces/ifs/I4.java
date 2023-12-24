package com.unhomie.fpij.concept.functional.interfaces.ifs;

public interface I4 {

	/*
	 * In Java 9, interfaces can also have private static methods.
	 * Since the static methods of an interface can be called without creation of
	 * an implementing object, these methods can oly called by public static methods defined
	 * in the interface.
	 */
	private static String getPrefix(String p) {
		return p.equals("male") ? "Mr. " : "Ms. ";
	}

	public static String getName(String p, String n) {
		return getPrefix(p) + n;
	}
}
