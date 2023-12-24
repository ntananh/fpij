package com.unhomie.fpij.concept.functional.interfaces.generic.impl;

import com.unhomie.fpij.concept.functional.interfaces.generic.TwoIntsProcessor;
import com.unhomie.fpij.concept.functional.interfaces.generic.TwoIntsProcessorAbstract;

public class TestTwoIntsProcessor {

	public static void main(String[] args) {

		TwoIntsProcessor multiplyInts = new TwoIntsProcessor() {
			@Override
			public Integer process(Integer arg1, Integer arg2) {
				return arg1 * arg2;
			}
		};

		TwoIntsProcessor subtractInts = new TwoIntsProcessor() {
			@Override
			public Integer process(Integer arg1, Integer arg2) {
				return arg1 - arg2;
			}
		};

		TwoIntsProcessorAbstract divideInts = new TwoIntsProcessorAbstract() {
			@Override
			public Integer process(Integer arg1, Integer arg2) {
				return arg1 / arg2;
			}
		};

		System.out.println(multiplyInts.process(2, 3));
		System.out.println(subtractInts.process(5, 2));
		System.out.println(divideInts.process(10, 2));
	}
}
