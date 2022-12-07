// 1,2,3,4,5,6,7,8,9 --> 1,9,2,8,3,7,4,6,5
import java.util.*;
public class Dual
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a array : ");
		String[] s = in.nextLine().split(",");	
		int n = s.length;
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(s[i]);
		} 
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int l = 0, r = a.length-1;
		while(l<r)
		{
			System.out.print(a[l]+","+a[r]+",");
			l++;r--;
		}
		System.out.print(a[n/2]);
	}
}
