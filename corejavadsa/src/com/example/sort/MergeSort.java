package com.example.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 7, 8, 3, 1, 2 };
		
		
		divide(arr, 0, arr.length - 1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	private static void divide(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		merge(arr,si,mid,ei);
		
	}

	private static void merge(int[] arr, int si, int mid, int ei) {
		int[] marr = new int[ei-si+1] ;
		int idx1=si;
		int idx2=mid+1;int x=0;
		while(idx1<=mid && idx2<=ei) {
			if(arr[idx1]<arr[idx2]) {
				marr[x++]=arr[idx1++];
			}else {
				marr[x++]=arr[idx2++];
			}
			
		}
		while(idx1<=mid ) {
			marr[x++]=arr[idx1++];
		}
		while( idx2<=ei) {
			marr[x++]=arr[idx2++];
		}
		
		for(int i=0,j=si;i<marr.length;i++,j++) {
			arr[j]=marr[i];
		}
		
	}



}