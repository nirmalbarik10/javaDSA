package com.example.pattern;

public class Pattern {
	//crea
	public static void main(String[] args) {
		//create pattern with solid rectangle 4*5 with star
		//printSolidRectangle(4,5);
		
		//create pattern with hollow rectangle 4*5 with star
		printHollowRectangle(4,5);
	}

	private static void printHollowRectangle(int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0 || j==0|| j==col-1 || i==row-1)
				System.out.print("* ");
				else
					System.out.print("  ");	
			}
			System.out.println();
		}
		
	}

	private static void printSolidRectangle(int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
