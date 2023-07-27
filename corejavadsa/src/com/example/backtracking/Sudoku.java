package com.example.backtracking;

public class Sudoku {

	public static void main(String[] args) {
		char[][] board= {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'},
				};
		//solve sudoku
		solveSudoku(board,0,0);
		for(int i=0;i<board.length;i++) {
			
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static boolean solveSudoku(char[][] board, int row, int col) {
		if(row==board.length) {
			 return true;
		 }
		int nrow=0;
		int ncol=0;
		//row traverse
		if(col!=board.length-1) {
			nrow=row;
			ncol=col+1;
		}else {
			nrow=row+1;
			ncol=0;
		}
		if(board[row][col]!='.') {
			if(solveSudoku(board,nrow,ncol)) {
				return true;
			}
		}else {
			for(int i=0;i<=9;i++) {
				if(isSafe(board,row,col,i)) {
					board[row][col]=(char)(i+'0');
					if(solveSudoku(board,nrow,ncol)) {
						return true;
					}else {
						board[row][col]='.' ;
					}
				}
			}
		}
		
		return false;
	}

	private static boolean isSafe(char[][] board, int row, int col, int num) {
		//check col no duplicate
		 for(int i=0; i<board.length; i++) {
	           if(board[i][col] == (char)(num+'0')) {
	               return false;
	           }
	       }
		 //check row no duplicate
		 for(int i=0; i<board.length; i++) {
	           if(board[row][i] == (char)(num+'0')) {
	               return false;
	           }
	       }
		//grid
	       int sr = 3 * (row/3);
	       int sc = 3 * (col/3);
	      
	       for(int i=sr; i<sr+3; i++) {
	           for(int j=sc; j<sc+3; j++) {
	               if(board[i][j] == (char)(num+'0')) {
	                   return false;
	               }
	           }
	       }
		return true;
	}

}
