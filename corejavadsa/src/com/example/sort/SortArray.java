package com.example.sort;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {7,8,3,1,2};
		bubbleSort(arr);
		bubbleSortdesc(arr);
		selectionSort(arr);
		insertionSort(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	private static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		
	}
	private static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minimum =i;//min ele found in 1st index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minimum]>arr[j]) {
					minimum=j;
				}
			}
			int temp=arr[minimum];
			arr[minimum]=arr[i];
			arr[i]=temp;
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
