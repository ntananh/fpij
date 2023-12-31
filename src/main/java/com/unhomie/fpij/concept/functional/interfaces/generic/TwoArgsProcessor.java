package com.unhomie.fpij.concept.functional.interfaces.generic;

@FunctionalInterface
public interface TwoArgsProcessor<X> {
	X process(X arg1, X arg2);
}
