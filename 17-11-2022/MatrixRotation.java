import java.util.*;
public class MatrixRotation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		/*int[][] mat = {1,2,3,4,5,6,7,8,9};
		int n = 3;*/
		System.out.print("Enter matrix range : ");
		int n = in.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("Enter matri elements : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)	
			{
				mat[i][j] = in.nextInt();
			}
		}
		int top=0,left=0,right=n-1,bottom=n-1,prev=0,curr=0;
		while(top<bottom && left<right)
		{
			prev = mat[top+1][left];
			for(int i=left;i<=right;i++)
			{
				curr = mat[top][i];
				mat[top][i] = prev;
				prev = curr;
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				curr = mat[i][right];
				mat[i][right] = prev;
				prev = curr;
			}
			right--;
			for(int i=right;i>=left;i--)
			{
				curr = mat[bottom][i];
				mat[bottom][i] = prev;
				prev = curr;
			}
			bottom--;
			for(int i=bottom;i>=top;i--)
			{
				curr = mat[i][left];
				mat[i][left] = prev;
				prev = curr;
			}
			left++;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)	
			{
				System.out.print(mat[i][j]+"\t");
			}System.out.println();
		}
	}
}