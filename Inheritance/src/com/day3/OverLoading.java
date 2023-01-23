package com.day3;

public class OverLoading {
	public void add() {
		System.out.println("first");
	}
	public void add(int a) {
		System.out.println("first-second");
	}
	public void add(String a) {
		System.out.println("first-second-third");
	}
	public void add(int a,int b) {
		System.out.println("first-seco-thr-fo");
	}
	public static void main(String[] args) {
		OverLoading oopsExamples=new OverLoading();
		oopsExamples.add(1,3);
		
	}

}
