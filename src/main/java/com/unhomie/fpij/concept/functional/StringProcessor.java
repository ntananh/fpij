package com.unhomie.fpij.concept.functional;


@FunctionalInterface
public interface StringProcessor {
	String process(String x);

	static boolean isLowerCase(String x) {
		boolean result = true;
		for (int i = 0; i < x.length() && result; ++i)
			result = Character.isLowerCase(x.charAt(i));
		return result;
	}

	static boolean isUpperCase(String x) {
		boolean result = true;
		for (int i = 0; i < x.length() && result; ++i)
			result = Character.isUpperCase(x.charAt(i));
		return result;
	}
}
