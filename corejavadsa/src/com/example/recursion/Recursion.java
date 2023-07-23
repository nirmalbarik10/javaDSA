package com.example.recursion;

public class Recursion {

	public static void main(String[] args) {
		//Print numbers from 5 to 1
		printNumber(5);

	}

	private static void printNumber(int num) {
		if(num==0) {
			return;
		}
		System.out.print(num+" ");
		printNumber(num-1);
		
	}

}
