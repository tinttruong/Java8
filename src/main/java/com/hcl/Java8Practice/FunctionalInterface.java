package com.hcl.Java8Practice;

public class FunctionalInterface {
	public static void main(String[] args) {
		Interface MyInterface = (a,b) -> (a*b);
		int result = MyInterface.multiplyTwoNumbers(3,9);
		System.out.println(result);
	}

}


interface Interface {
	public int multiplyTwoNumbers(int a, int b);
	
}