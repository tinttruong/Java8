package com.hcl.Java8Practice;

public class DefaultStatic {
	public static void main(String[] args) {
		student Student = new Person();
		Student.print();

	}

}

interface student {
	default void print() {
		System.out.println("I'm an 8th grader");
	}
	static void notstudent() {
		System.out.println("I dont go here");
		
}

interface teacher {
	static void print() {
		System.out.println("I teach here");
	}
}

class Person implements student, teacher {
	public void print() {
		student.super.print();
		teacher.print();
		student.notstudent();
		System.out.println("I go to a different school");
	}
}
}