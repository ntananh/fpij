package com.unhomie.fpij.concept.functional.interfaces.generic;

public class Main {
	public static void main(String[] args) {
		TwoArgsProcessor<Integer> multiplyInts = new TwoArgsProcessor<Integer>() {
			@Override
			public Integer process(Integer arg1, Integer arg2) {
				return arg1 * arg2;
			}
		};

		TwoArgsProcessor<Double> addDoubles = new TwoArgsProcessor<Double>() {
			@Override
			public Double process(Double arg1, Double arg2) {
				return arg1 + arg2;
			}
		};

		TwoArgsProcessor<String> compareStrings = new TwoArgsProcessor<String>() {
			@Override
			public String process(String arg1, String arg2) {
				return arg1.compareTo(arg2) > 0 ? arg1 : arg2;
			}
		};

		System.out.println(multiplyInts.process(2, 4));
		System.out.println(addDoubles.process(2.0, 4.0));
		System.out.println(compareStrings.process("ace", "age"));
	}
}
