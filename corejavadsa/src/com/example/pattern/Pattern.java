package com.example.pattern;

public class Pattern {
	// crea
	public static void main(String[] args) {
		// create pattern with solid rectangle 4*5 with star
		// printSolidRectangle(4,5);

		// create pattern with hollow rectangle 4*5 with star
		// printHollowRectangle(4,5);
		// create pattern with solid trangle 4*4 with star
		//printSolidTrangle(4);
		
		// create pattern with solid trangle 4*5 with star
		//printSolidUltaTrangle(4);
		
		//create right solid triangle		
		//printRightSolidTrangle(5);
		//printNumberPattern(5);
		//printNumberPartenUpperTringle(5);
		//printNumberInorder(4);
		//printnumber10F(4);
		//PrintSolidRhombus(4);
		PrintNumberPyramid(4);
		
	}
	
	private static void PrintNumberPyramid(int row) {
		int num=1;
		for(int i=row; i>=1; i--) {
	           for(int j=1; j<=i; j++) {
	        	  System.out.print(" ");
	        	    
	           }
	           for(int j=1; j<=num; j++) {
		        	  System.out.print(num+" ");		        	    
		           }          
	           num++;
	           System.out.println();
	       }

		
	}

	private static void PrintSolidRhombus(int row) {
		for(int i=row; i>=1; i--) {
	           for(int j=1; j<=i; j++) {
	        	  System.out.print(" ");
	        	    
	           }
	           for(int j=1; j<=row; j++) {
		        	  System.out.print("* ");
		        	    
		           }
	           

	           System.out.println();
	       }
	}

	private static void printnumber10F(int row) {
		for(int i=1; i<=row; i++) {
	           for(int j=1; j<=i; j++) {
	        	   if((i+j)%2==0)
	               System.out.print("1 ");
	        	   else
	        		 System.out.print("0 ");   
	           }
	           

	           System.out.println();
	       }
		
	}

	private static void printNumberInorder(int row) {
		int n = 1;
	      
	       for(int i=1; i<=row; i++) {
	           for(int j=1; j<=i; j++) {
	               System.out.print(++n +" ");
	           }
	           

	           System.out.println();
	       }

		
	}

	private static void printNumberPartenUpperTringle(int row) {
		
	      
	       for(int i=row; i>=1; i--) {
	           for(int j=1; j<=i; j++) {
	               System.out.print(j+" ");
	           }


	           System.out.println();
	       }

		
	}

	private static void printNumberPattern(int row) {
		int n = 4;
	      
	       for(int i=1; i<=n; i++) {
	           for(int j=1; j<=i; j++) {
	               System.out.print(j+" ");
	           }


	           System.out.println();
	       }

		
	}

	private static void printRightSolidTrangle(int row) {
		int n = 4;
	      
	       for(int i=n; i>=1; i--) {
	           for(int j=1; j<i; j++) {
	               System.out.print(" ");
	           }


	           for(int j=0; j<=n-i; j++) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }

		
	}

	private static void printSolidUltaTrangle(int row) {
		for (int i = row; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void printSolidTrangle(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void printHollowRectangle(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0 || j == col - 1 || i == row - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

	private static void printSolidRectangle(int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
