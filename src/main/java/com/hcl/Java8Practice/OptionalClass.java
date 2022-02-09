package com.hcl.Java8Practice;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String name = "Tin";
		Optional<String> opt = Optional.ofNullable(name);
		if (opt.isPresent()) {
			@SuppressWarnings("null")
			String lowercaseString = name.toLowerCase();
			System.out.println(lowercaseString);
		} else
			System.out.println("String Value is Null or not present");

	}

}
