package com.hcl.Java8Practice;

public class LamdaPractice {

	static LamdaPractice tester = new LamdaPractice();

	public static void main(String[] args) {

		MathOp addition = (int a, int b) -> a + b;
		MathOp subtraction = (a, b) -> a - b;
		MathOp division = (int a, int b) -> a / b;
		MathOp multiplication = (int a, int b) -> a * b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 + 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 + 5 = " + tester.operate(10, 5, division));
		System.out.println("10 + 5 = " + tester.operate(10, 5, multiplication));

	}

	private int operate(int a, int b, MathOp MathOp) {
		return MathOp.operation(a, b);
	}

	interface MathOp {
		int operation(int a, int b);
	}
}