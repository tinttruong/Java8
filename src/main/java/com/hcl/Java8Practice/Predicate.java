package com.hcl.Java8Practice;
import java.util.function.Predicate;

public class Predicate {
	public static void main(String[] args) {
		Predicate<Integer> greaterThanTen = (i) -> (i > 10);
		System.out.println(greaterThanTen.test(50));
		System.out.println(greaterThanTen.test(48));
		System.out.println(greaterThanTen.test(60));

		
	}

}
