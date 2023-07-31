package com.example.sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr = {6,3,9,5,2,8};
		int n=arr.length;
		quickSort(arr,0,n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

	

	private static void quickSort(int[] arr, int low, int high) {
		if(low>=high) {
			return;
		}
		int pidx=partition(arr,low,high);
		quickSort(arr,  low,  pidx-1);
		quickSort(arr,  pidx,  high);
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pidx=-1;
		int pivot=arr[high];
		if(low<high) {
			for(int i=0;i<high;i++) {
				if(arr[i]<pivot) {
					pidx=pidx+1;
					int temp=arr[i];
					arr[i]=arr[pidx];
					arr[pidx]=temp;
				}
			}
			pidx++;
			int temp=arr[high];
			arr[high]=arr[pidx];
			arr[pidx]=temp;
			
		}
		return pidx;
	}

	
}
