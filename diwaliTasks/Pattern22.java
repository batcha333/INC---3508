import java.lang.*;
import java.util.*;
public class Pattern22
{
	static void pattern(int n)
	{
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				int top = col,bottom  = n-row-1,left = row,right = n-col-1;
				//System.out.print("Right : "+right);
				int minimum = Math.min(Math.min(top,bottom),Math.min(right,left));
				System.out.print((n-minimum)+"\t");
			}System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range : ");
		int range = in.nextInt();
		pattern(range);
	}
}