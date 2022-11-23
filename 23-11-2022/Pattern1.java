import java.util.*;
public class Pattern1
{
	void printMatrix(int[][] matrix)
	{
		int n = matrix.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j]!=0)
					System.out.print(matrix[i][j]+"\t");
				else
					System.out.print("\t");
			}System.out.println();
		}	
	}
	void pattern1(int n)
	{
		int[][] matrix = new int[n][n];
		int l=0,r=n-1,t=0,b=n-1,i,j;
		int a = 1;
		
		while(l<=r && t<=b)
		{
			i = t;
			j = l;
			while(i<=b && j<=r)			//Diagonal
			{
				matrix[i++][j++] = a++;	
			}
			l++;
			b--;
			for(i=b;i>=t;i--)			//LastColumn Reverse
			{
				matrix[i][r] = a++; 
			}
			b--;
			r--;
			for(i=r;i>=l;i--)			//Firstrow Reverse
			{
				matrix[t][i] = a++; 
			}
			t++;
			l++;
		}
		printMatrix(matrix);
	}
	
	public static void main(String[] args)
	{
		Pattern1 p = new Pattern1();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");	
		int n = in.nextInt();
		p.pattern1(n);
	}
}
/*
void pattern1(int n)
	{
		int[][] matrix = new int[n][n];
		int l=0,r=n-1,t=0,b=n-1;
		int a = 1;
		
		while(l<=r && t<b)
		{
			
			for(int i=l;i<r;i++)			//Diagonal
			{
				matrix[i][i] = a++;	
			}
			l++;
			//b--;
			for(int i=b;i>=t;i--)			//LastColumn Reverse
			{
				matrix[i][r] = a++; 
			}
			b--;
			r--;
			for(int i=r;i>=l;i--)			//Firstrow Reverse
			{
				matrix[t][i] = a++; 
			}
			t++;
			l++;
			b--;
		}
		printMatrix(matrix);
	}
*/