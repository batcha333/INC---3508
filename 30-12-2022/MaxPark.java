import java.util.*;
public class MaxPark
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter row & col: ");
		int r = in.nextInt();
		int c = in.nextInt();
		int[][] mat = new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j] = in.nextInt();
			}
		}
		int max = Integer.MIN_VALUE;
		int ans = 0;
		for(int i=0;i<r;i++)
		{
			int count = 0;
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==1)
					count++;	
			}
			if(count>max)
			{
				max = count;
				ans = i+1;
			}
		}
		System.out.println("Row : "+ans);
	}
}