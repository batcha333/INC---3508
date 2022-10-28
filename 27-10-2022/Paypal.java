import java.util.*;
public class Paypal
{
	public static void main(String[] args)
	{
		String s = "PAYPALISHIRING";
		char[] str = s.toCharArray();
		int n = 3,r=0;
		char array[][] = new char[n][str.length];
		int c =0;
		while(r<str.length)
		{
			int i=0;
			while(r<str.length && i<n)
			{
				array[i++][c] = str[r++];	
			}
			c++;
			int j = n-2;
			while(r<str.length && j>=1)
			{
				array[j--][c++] = str[r++];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str.length/2;j++)
			{
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
		//System.out.println(Arrays.toString(array));
	}
}