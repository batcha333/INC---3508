import java.util.Scanner;
public class TwoDimensionArray
{
	static Scanner in = new Scanner(System.in);
	public static void getMatrixElements(int matrix[][],int range)
	{
		for (int row=0;row<range;row++)
		{
			for( int col=0;col<range;col++)
			{
				matrix[row][col]=in.nextInt();
			}
		}
	}
	public static void addMatrixElements(int m1[][],int m2[][],int n)
	{
		int result[][] = new int[n][n];
		for (int row=0;row<n;row++)
		{
			for( int col=0;col<n;col++)
			{
				result[row][col]=m1[row][col]+m2[row][col];
			}
		}
		printMatrix(result);	
	}
	public static void printMatrix(int matrix[][])
	{
		for (int k[]: matrix)
		{
			for (int i: k)
			{
				System.out.print(i);
			}System.out.println();
		} 
	}
	public static void main(String args[])
	{
		System.out.print("Enter Matrix Dimension : ");
		int dimension = TwoDimensionArray.in.nextInt();
		System.out.print("Enter Matrix1 Elements: ");
		int matrix1[][] = new int[10][10];
		getMatrixElements(matrix1,dimension);
		System.out.print("Enter Matrix2 Elements: ");
		int matrix2[][] = new int[10][10];
		getMatrixElements(matrix2,dimension);
		addMatrixElements(matrix1,matrix2,dimension);
	}
}