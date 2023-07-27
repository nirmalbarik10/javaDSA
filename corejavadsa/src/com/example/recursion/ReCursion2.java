package com.example.recursion;

public class ReCursion2 {

	public static void main(String[] args) {
	//	Print all the permutations of a string.
		//printPermutation("abc",0,"");
		//Tiling problem n=4 m=2
		//int arrgement=tilingProblem(4,4);
		//System.out.println(arrgement);
		//int pair=pairFriends(3);
		//System.out.println(pair);
		
		//subset of n natural number
		printsubset(3,"");
	}
	
	
	private static void printsubset(int num, String str) {
		if(num==0) {
			System.out.println(str+" ");
			return;
		}
		//choices n  come
		printsubset( num-1, str+num);
		//choices n not come
		printsubset( num-1, str);
		
	}


	public static int pairFriends(int n) {
	      if(n <= 1) {
	          return 1;
	      }
	       return pairFriends(n-1) + (n-1) * pairFriends(n-2);
	   }


	  


	private static int tilingProblem(int n, int m) {
		if(n<m) {
			return 1;
		}
		if(n==m) {
			return 2;
		}
		
		 return tilingProblem(n-1, m) + tilingProblem(n-m, m);
		
	}

	private static void printPermutation(String str, int idx,String perm) {
		if(str.length()==0) {
			System.out.println(perm+" ");
			return;
		}
	    for(int i=0; i<str.length(); i++) {
	           char currChar = str.charAt(i);
	           String newStr = str.substring(0, i) + str.substring(i+1);
	           printPermutation(newStr, idx+1, perm+currChar);
	       }

			
	}

}
