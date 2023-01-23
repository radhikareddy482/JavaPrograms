package com.day3;
import com.day2.ClassA;


public class OverRiding extends ClassA {
	//classA is the parent class
	//override method is used to over ride a same method name in different package 
	public void add(int a, int b) {
		System.out.println("addition of two numbers is"+(a+b));
	}
	public static void main(String[] args) {
		OverRiding overriding = new OverRiding();
		overriding.add(1,2);
	}
	

}
