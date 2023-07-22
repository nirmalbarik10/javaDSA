package com.example.sort;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {7,8,3,1,2};
		//bubbleSort(arr);
		bubbleSortdesc(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	//push biggest ele last
	private static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
	}
	
private static void bubbleSortdesc(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
	}

}
