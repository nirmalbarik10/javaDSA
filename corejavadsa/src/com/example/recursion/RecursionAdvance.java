package com.example.recursion;

import java.util.Set;

public class RecursionAdvance {

	static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
			"tu", "vwx", "yz"};



	public static void main(String[] args) {
		//Tower of Hanoi - Transfer n disks from source to destination over 3 towers
		//towerOfHanoi(3,"S","D","H");
		
		//Print a string in reverse
		//printStringReverse("ABC","");
		
		//print 1st and last occ string
		//printFirstLastOccur("this is a string",-1,-1,0,'i');
		
		//Check if an array is sorted (strictly increasing). - O(n)
		//int[] arr = {1,2,3,4};
		//System.out.println(checkSorted(arr,0));
		
		//Move all ‘x’ to the end of the string.
		//moveXtoEnd("axbxcxd","",0);
		
		//remove duplicate char from string
		//String str = "abcadbcefghabi";
		//boolean present[] = new boolean[str.length()];
		//System.out.println(removeDuplicates(str, 0, present));
		
		//print all subsequence string
		//printSubseq("abc", 0, "");
		
		//print all subsequence string without dup
		//Set<String> hs=new java.util.HashSet<>();
		//printSubseqdupEle("aaa", 0, "",hs);
		//hs.remove("");
		//System.out.println(hs);
		
		//print keypad comb
		
		String number = "23";
		printKeypadCombination(number, 0, "");
	}
	
	
	private static void printKeypadCombination(String number, int idx, String res) {
		
		if(idx==number.length()) {
			System.out.print(res+" ");
			return ;
		}
		for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
			char curr = keypad[number.charAt(idx)-'0'].charAt(i);
			printKeypadCombination(number, idx+1, res+curr);
			}
	}


	private static Set<String> printSubseqdupEle(String str, int idx, String res, Set<String> hs) {
		if(idx==str.length()) {
			//System.out.println(res);
			hs.add(res);
			return hs;
		}
		char ch =str.charAt(idx);
		//if char come
		 printSubseqdupEle( str,  idx+1,  res+ch,hs);
		 printSubseqdupEle( str,  idx+1,  res,hs);
		 return hs;
		
	}


	private static void printSubseq(String str, int idx, String res) {
		if(idx==str.length()) {
			System.out.println(res);
			return;
		}
		char ch =str.charAt(idx);
		//if char come
		printSubseq( str,  idx+1,  res+ch);
		printSubseq( str,  idx+1,  res);
		
	}


	public static String removeDuplicates(String str, int idx, boolean present[]) {
		if(idx == str.length()) {
		return "";
		}
		char curr = str.charAt(idx);
		if(present[curr-'a']) {
		return removeDuplicates(str, idx+1, present);
		} else {
		present[curr-'a'] = true;
		return curr + removeDuplicates(str, idx+1, present);
		}
		}






	private static void moveXtoEnd(String str, String modString,int cnt) {
		if(str.isEmpty()) {
			for(int i=0;i<cnt;i++)
				modString=modString+"x";
			System.out.println(modString);
			return;
		}
		int length=str.length();
		char ch=str.charAt(0);
		
		if(ch=='x') {
		cnt++;	
		
		moveXtoEnd(str.substring(1,length),modString,cnt);
		}
		else
		moveXtoEnd(str.substring(1,length),modString+ch,cnt);	
		
	}






	private static boolean checkSorted(int[] arr, int idx) {
		if(idx==arr.length-1) {
			return true;
		}
		if(arr[idx]>=arr[idx+1]) {
			return false;
		}
		return checkSorted(arr, idx+1);
		
		
	}






	private static void printFirstLastOccur(String str,int first,int last, int idx,char c) {
		if(idx==str.length()) {
			System.out.println("First"+first+" last: "+last);
			return;
		}
		if(first==-1 && c==str.charAt(idx)) {
			first=idx;
		} if( c==str.charAt(idx)){
			last=idx;
		}
		
		printFirstLastOccur( str, first, last,  idx+1, c);
	}



	private static void printStringReverse(String str,String dest) {
		if(str.isEmpty()) {
			System.out.println(dest);
			return;
		}
		int len=str.length()-1;
		dest=dest+str.charAt(str.length()-1);
		printStringReverse( str.substring(0,len), dest);
		
	}



	private static void towerOfHanoi(int n, String src, String dest, String helper) {
		if(n==1) {
			System.out.println(1+" Disc transper form "+src+" to destination "+dest);
			return;
		}
		towerOfHanoi(n-1,  src,  helper,  dest);
		System.out.println(n+" Disc transper form "+src+" to destination "+dest);
		towerOfHanoi(n-1,  helper,  dest,  src);
		
	}

}
