package com.example.recursion;

public class Recursion {

	public static void main(String[] args) {
		//Print numbers from 5 to 1
		//printNumber(5);
		
		//Print numbers from 1 to 5.
		//printNumberasc(1);
		
		//Print the sum of first n natural numbers.
		//int sum=printSum(5,0);
		//System.out.println(sum);
		
		//Print factorial of a number n.
		//int fact=printFact(5);
		//System.out.println(fact);
		
		//Print the fibonacci sequence till nth term.
		//printFibonacci(0,1,5);
		
		//Print x^n
		int power=printPower(2,4);
		System.out.println(power);
	}

	private static int printPower(int num, int n) {
		if(n==0) {
			return 1;
		}
		
		return num*printPower( num,  n-1);
	}

	private static void printFibonacci(int a, int b, int n) {
	if(n==0) {
		return;
	}
		System.out.println(b);
	printFibonacci( b, a+b,  n-1);
		
	}

	private static int printFact(int num) {
		if(num==1) {
			return 1;
		}		
		return num*printFact(num-1);
	}

	private static int printSum(int num, int sum) {
		if(num==0) {
			return sum;
		}
		sum=sum+num;
		return printSum( num-1,  sum);
		
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
