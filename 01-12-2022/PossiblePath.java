import java.util.*;
public class PossiblePath
{
	static List<List<Integer>> list = new ArrayList<>();
	public static void findPath(int[][] game,int x,int y,int i,int j)
	{
		if(i>x || j>y)
		{
			return;
		}
		if(i==x && j==y)
		{
			System.out.println()
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		/*System.out.print("Enter a range : ");
		int n= in.nextInt();
		System.out.print("Enter a matrix : ");
		int[][] game = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				game[i][j] = in.nextInt();
			}
		}*/
		int[][] game = {{1,2,3},{4,5,6}};
		findPath(game,0,0,n-1,n-1);
	}	
}