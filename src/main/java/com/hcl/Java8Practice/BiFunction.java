package com.hcl.Java8Practice;

import java.util.function.BiFunction;

public class BiFunction {
	public static void main(String[] args) {
		System.out.println("\nThis is using BiFunction to do simple arthmetic\n");
		BiFunction<Integer, Integer, Integer> additions = (a, b) -> a + b;
		System.out.println("Answer for addition = " + additions.apply(2, 3));
		BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
		System.out.println("Answer for Multiplication = " + multiplication.apply(2, 3));
	}

}
