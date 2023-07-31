package com.example.sort;

public class Test {

	public static void main(String[] args) {
		int[] arr = {6,3,13,11,9,2,8};
		//we need 3 pointer low,high,pos index loop and pivot
		int low =0, high=arr.length-1;
		int pivot =arr[high]; int idx=-1;
		for(int i=low;i<=high;i++) {
			if(arr[i]<pivot) {
				idx=idx+1;
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
			}
		}
		
		int temp=arr[high];
		arr[high]=arr[idx+1];
		arr[idx+1]=temp;
		for(int i:arr)
		System.out.print(i+" ");
		
	}

}
