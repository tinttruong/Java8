package com.hcl.Java8Practice;

import java.util.*;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			aList.add(i);
		}
		aList.forEach(n -> System.out.println(n));

	}
}