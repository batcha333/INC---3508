import java.util.*;
public class SnakesTree
{
	int min = Integer.MAX_VALUE;
	public void findMinPath(char[][] game,int i,int j,int count)
	{
		if(i<0 || i>game.length-1 || j<0 || j>game[0].length-1 || game[i][j]=='#' || game[i][j]=='v')
			return;
		if(game[i][j]=='T')
		{
			min = Math.min(min,count);
			return;
		}
		char c = game[i][j];
		game[i][j] = 'v';
		findMinPath(game,i+1,j,count+1);
		findMinPath(game,i-1,j,count+1);
		findMinPath(game,i,j+1,count+1);
		findMinPath(game,i,j-1,count+1);
		game[i][j] = c;
	}
	public void calculate(char[][] game,int z)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Tree position x,y, Fruit st,et, Happy Count  : ");
		int x = in.nextInt();
		int y = in.nextInt();
		int s = in.nextInt();
		int e = in.nextInt();
		int h = in.nextInt();
		game[x-1][y-1] = 'T';
		int ans = 0;
		for(char[] a : game)
		{
			System.out.println(Arrays.toString(a));
		}
		for(int i=0;i<game.length;i++)
		{
			for(int j=0;j<game[i].length;j++)
			{
				if(game[i][j] == 'S')
				{
					findMinPath(game,i,j,0);
					ans = (e-min)*z*h;
				}
			}
		}
		System.out.println("MinPathLength : "+min);
		System.out.println("Answer : "+ans);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		SnakesTree snake = new SnakesTree();
		System.out.print("Enter Matrix row,column,No.of.Trees,TotalTime  : ");
		int n = in.nextInt();
		int m = in.nextInt();
		int z = in.nextInt();
		int t = in.nextInt();
		char[][] game = new char[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				game[i][j] = in.next().charAt(0);
			}
		}
		snake.calculate(game,z);
	}
}