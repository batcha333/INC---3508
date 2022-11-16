import java.util.Scanner;
public class Rectangle
{
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter m : ");
		int m = in.nextInt();
		System.out.println("Enter n : ");
		int n = in.nextInt();
		int[][] mat = new int[m][n];
		for(int row=0;row<m;row++)
		{
			for(int col=0;col<n;col++)
			{
				mat[row][col] = in.nextInt();
			}
		}	
		System.out.println("Enter 2 indexes : ");
		int i1 = in.nextInt();
		int j1 = in.nextInt();
		int i2 = in.nextInt();
		int j2 = in.nextInt();
		int sum =0 ;
		for(int i=i1;i<=i2;i++)
		{
			for(int j=j1;j<=j2;j++)
			{
				System.out.print(mat[i][j]+" ");
				sum += mat[i][j];
			}System.out.println();
		}
		System.out.println("Sum : "+sum);
	}
}