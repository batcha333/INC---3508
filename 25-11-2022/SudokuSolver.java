public class SudokuSolver
{
	void printSudoku(char[][] board)
	{
		for(int row=0;row<board.length;row++)
		{
			for(int col=0;col<board[row].length;col++)
			{
				System.out.print(board[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	boolean isSafe(int row,int col,char c,char[][] board)
	{
		for(int i=0;i<9;i++)
		{
			if(board[i][col]==c)
				return false;
			if(board[row][i]==c)
				return false;
			if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c)
				return false;
		}
		return true;
	}	

	boolean helper(char[][] board)
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(board[i][j]=='.')
				{
					for(char c='1';c<='9';c++)
					{
						if(isSafe(i,j,c,board))
						{
							board[i][j] = c;
							if(helper(board))
								return true;
							else
								board[i][j] = '.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		SudokuSolver s = new SudokuSolver();
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		System.out.println("\nBefore Solving-> \n");
		s.printSudoku(board);
		if(s.helper(board))
		{
			System.out.println("\n\nAfter Solving-> \n");
			s.printSudoku(board);
		}
		else
			System.out.println("\n\nBoard can't be solved \n");
	}
	
}
