package com.example.backtracking;

public class NQuen {

	public static void main(String[] args) {
		// given board 4*4
		int n = 4;
		char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'X' },
				{ 'X', 'X', 'X', 'X' } };
		solveQ(board, 0);

	}

	private static void solveQ(char[][] board, int row) {
		int n = board.length;
		if (row == n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		for (int col = 0; col < n; col++) {
			if (saveplace(board, row, col)) {
				board[row][col] = 'Q';
				solveQ(board, row + 1);
				board[row][col] = 'X';

			}
		}

	}

	private static boolean saveplace(char[][] board, int row, int col) {

		// col check
		for (int j = 0; j < board.length; j++) {
			if (board[row][j] == 'Q') {
				return false;
			}
		}
		// row check
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		// upper lef dir
		int r = row;
		for (int c = col; c >= 0 && r >= 0; r--, c--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// upper rig dir
		 r=row;
		for (int c = col; c < board.length && r >= 0; r--, c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// lower left dir
		 r=row;
		for (int c = col; c >= 0 && r < board.length; r++, c--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		// lower right dir
		 r=row;
		for (int c = col; c < board.length && r < board.length; r++, c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}

		return true;
	}

}
