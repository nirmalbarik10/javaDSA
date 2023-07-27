package com.example.backtracking;

public class NQueen {

	public static void main(String[] args) {
		//board 4*4
		int n=4;
		char[][] board= {
				{'X','X','X','X'},
				{'X','X','X','X'},
				{'X','X','X','X'},
				{'X','X','X','X'}
		};
		//pass 
		nqueen(board,0);

	}
	//nqueen board,row
	private static void nqueen(char[][] board, int row) {
		int n=board.length;
		
		 if(row==n) {
			 //print board
				for(int i=0;i<board.length;i++) {
					for(int j=0;j<board.length;j++) {
						System.out.print(board[i][j] +" ");
					}
					System.out.println();
				}
				System.out.println();
				return;
			 }
		
		for(int j=0;j<n;j++) {
			if(isSafe(board,row,j)) {
			 board[row][j]='Q';
			 nqueen( board,  row+1);
			 board[row][j]='X';
			}
		}
		
	}

	private static boolean isSafe(char[][] board, int row, int col) {

		
		 //check col
		 for(int j=0;j<board.length;j++) {
			 if(board[row][j]=='Q') return false;
		 }
		 //check row
		 for(int i=0;i<board.length;i++) {
			 if(board[i][col]=='Q') return false;
		 }
		//upper left
	       int r = row;
	       for(int c=col; c>=0 && r>=0; c--, r--) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       //upper right
	       r = row;
	       for(int c=col; c<board.length && r>=0; r--, c++) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       //lower left
	       r = row;
	       for(int c=col; c>=0 && r<board.length; r++, c--) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       //lower right
	       for(int c=col; c<board.length && r<board.length; c++, r++) {
	           if(board[r][c] == 'Q') {
	               return false;
	           }
	       }
	      
	       return true;
	
	}
	

}
