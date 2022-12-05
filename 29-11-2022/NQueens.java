import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NQueens
{
	List<List<String>> list = new ArrayList<>();

	public void printBoard()
	{
		for(List l : list)
		{
			System.out.println(l);
		}
	}	

	public void saveBoard(char[][] board)
	{
		List<String> temp = new ArrayList<>();
		for(int i=0;i<board.length;i++)
		{
			String newStr ="";
			for(int j=0;j<board.length;j++)
			{
				if(board[i][j]=='Q')
				{
					newStr += "Q ";
				}
				else
				{
					newStr += ". ";
				}
			}
			temp.add(newStr);
		}
		list.add(temp);
	}
	
	public boolean isSafe(char[][] board,int row,int col)
	{
		//Vertical
		for(int i=0;i<board.length;i++)
		{
			if(board[row][i]=='Q')
				return false;
		}

		//Horizontal
		for(int i=0;i<board.length;i++)
		{
			if(board[i][col]=='Q')
				return false;
		}

		//Top-Left
		for(int i=row,j=col;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j]=='Q')
				return false;
		}

		//Top-Right
		for(int i=row,j=col;i>=0 && j<board.length;i--,j++)
		{
			if(board[i][j]=='Q')
				return false;
		}

		//Bottom-Left
		for(int i=row,j=col;i<board.length && j>=0;i++,j--)
		{
			if(board[i][j]=='Q')
				return false;
		}

		//Bottom-Right
		for(int i=row,j=col;i<board.length && j<board.length;i++,j++)
		{
			if(board[i][j]=='Q')
				return false;
		}
		
		return true;
	}

	public void placeQueen(char[][] board,int col,int row)
	{
		for(int i=0;i<row;i++)
		{
			if(col==row)	
			{
				saveBoard(board);
				return;
			}
			if(isSafe(board,i,col))
			{
				board[i][col] = 'Q';
				placeQueen(board,col+1,row);	
				board[i][col] = ' ';
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a range  : ");
		int n = in.nextInt();
		char[][] board = new char[n][n];
		NQueens nq =  new NQueens();
		nq.placeQueen(board,0,n);
		nq.printBoard();
	}
}