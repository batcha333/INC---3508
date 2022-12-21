import java.util.*;
public class Position
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter testcase : ");
		int t = in.nextInt();
		int[][] array = new int[t][];
		for(int i=0;i<t;i++)
		{
			int col = in.nextInt();
			array[i] = new int[col];
			for(int j=0;j<col;j++)
			{
				array[i][j] = in.nextInt();
			}
		}
		System.out.print("Enter positions count : ");
		int p = in.nextInt();
		String str[] = new String[p];
		for(int i=0;i<p;i++)
		{
			int row = in.nextInt();
			int col = in.nextInt();
			if(row-1 >= array.length || row-1<0 || col-1 >= array[i].length || col-1<0)
				str[i] = "ERROR!";
			else
			{
				str[i] = ""+array[row-1][col-1];
			}
		}
		for(String s : str)
			System.out.println(s);
	}
}