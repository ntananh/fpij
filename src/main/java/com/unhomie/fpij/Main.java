package com.unhomie.fpij;

import com.unhomie.fpij.interfaces.BinaryOperator;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> addWithAnonymous = new Function<Integer, Function<Integer, Integer>>() {
            @Override
            public Function<Integer, Integer> apply(Integer x) {
                return new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer y) {
                        return x + y;
                    }
                };
            }
        };

        Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

        BinaryOperator addBinary = x -> y -> x + y;

        BinaryOperator mult = x -> y -> x * y;

        System.out.println((add.apply(2).apply(3)));
    }
}
