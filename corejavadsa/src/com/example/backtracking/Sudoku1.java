package com.example.backtracking;

public class Sudoku1 {

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
		solveBoard(board,0,0);
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static boolean solveBoard(char[][] board, int row, int col) {
		int n=board.length;
		if(row==n-1 && col==n) {
			return true;
		}
		if(col==n) {
			row=row+1;
			col=0;			
		}
		if(board[row][col]!='.') {
			return solveBoard( board, row,  col+1);
		}
		for(int num=1;num<=9;num++) {
			if(isSafe(board,row,col,num)) {
				board[row][col]=(char) (num+'0');
				if(solveBoard( board, row,  col+1)) {
					return true;
				}
				board[row][col]='.';
			}
		}
		return false;
		
	}

	private static boolean isSafe(char[][] board, int row, int col, int num) {
		//check  col
		for(int i=0;i<board.length;i++) {
			if(board[i][col]== (char) (num+'0')) {
				return false;
			}
		}
		//row
		for(int j=0;j<board.length;j++) {
			if(board[row][j]== (char) (num+'0')) {
				return false;
			}
		}
		//3*3 grid
		int sr=row-row%3;
		int sc=col-col%3;
		for(int i=0;i<3;i++) {
		  for(int j=0;j<3;j++) {
			  if(board[sr+i][sc+j]== (char) (num+'0')) {
					return false;
				}
		  }
			
		}
		
		return true;
	}

}
