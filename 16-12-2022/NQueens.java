import java.util.*;
public class NQueens
{	
	static List<List<String>> ans = new ArrayList<>();
	public void saveBoard(char[][] board)
	{
		int n = board.length;
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String newStr = "";
			for(int j=0;j<n;j++)
			{
				if(board[i][j]=='Q')
					newStr += 'Q';
				else
					newStr += '.';
			}
			list.add(newStr);
		}
		ans.add(list);
	}
	public boolean isSafe(char[][] board,int r,int c)
	{	
		int n = board.length;
		for(int i=0;i<n;i++)
		{
			if(board[i][c]=='Q')
				return false;
		}
		for(int j=0;j<n;j++)
		{
			if(board[r][j]=='Q')
				return false;	
		}
		for(int i=r,j=c;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j]=='Q')
				return false;
		}		
		for(int i=r,j=c;i<n && j<n;i++,j++)
		{
			if(board[i][j]=='Q')
				return false;
		}
		for(int i=r,j=c;i>=0 && j<n;i--,j++)
		{
			if(board[i][j]=='Q')
				return false;
		}
		for(int i=r,j=c;i<n && j>=0;i++,j--)
		{
			if(board[i][j]=='Q')
				return false;
		}
		return true;
	}
	public void place(char[][] board,int col,int row)
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
				place(board,col+1,row);
				board[i][col] = ' ';
			}
		}
	}
	public static void main(String[] args)
	{
		NQueens q = new NQueens();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int n = in.nextInt();
		char[][] board = new char[n][n];
		q.place(board,0,n);
		for(List i : ans)
		{
			System.out.println(i);
		}
	}
}