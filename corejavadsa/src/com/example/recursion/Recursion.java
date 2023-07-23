package com.example.recursion;

public class Recursion {

	public static void main(String[] args) {
		//Print numbers from 5 to 1
		//printNumber(5);
		
		//Print numbers from 1 to 5.
		printNumberasc(1);

	}

	private static void printNumber(int num) {
		if(num==0) {
			return;
		}
		System.out.print(num+" ");
		printNumber(num-1);
		
	}
	private static void printNumberasc(int num) {
		if(num==6) {
			return;
		}
		System.out.print(num+" ");
		printNumberasc(num+1);
		
	}

}
