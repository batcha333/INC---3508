import java.util.*;
public class MatrixRotation
{
	void rotation(int[][] matrix)
	{	
		int n = matrix.length;
		for(int i=0;i<n;i++)					//Taking Transpose
		{
			for(int j=i;j<n;j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		int start=0,end=n-1;					//Rotation using 2 Pointer Approach
		while(start<end)
		{
			for(int i=start;i<n;i++)
			{
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
			}
			start++;
			end--;
		}
		System.out.println("Matrix Rotation : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}System.out.println();
		}
	}
	public static void main(String[] args)
	{	
		MatrixRotation mat = new MatrixRotation();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter matrix range : ");
		int n = in.nextInt();
		int[][] matrix = new int[n][n];	
		System.out.println("Enter matrix elements : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j] = in.nextInt();
			}
		}
		mat.rotation(matrix);
	}
}