import java.util.*;
public class Unique
{
	public boolean find(int[] r,int n)
	{
		int i = 0;
		while(i<r.length)
		{
			if(r[i]==n)
			{
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Unique u = new Unique();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a array : ");
		String[] s = in.nextLine().split(",");
		int[] a = new int[s.length];
		int n = a.length;
		for(int i=0;i<s.length;i++)
		{
			a[i] = Integer.parseInt(s[i]);	
		}
		int j = 1;
		int[] r = new int[n];	
		r[0] = a[0];
		for(int i=1;i<n;i++)
		{
			if(u.find(r,a[i]))
			{
				r[j++] = a[i];
			}
		}
		for(int k = j;k<n;k++){
			r[k] = -1;
		}
		System.out.println(Arrays.toString(r));
	}
}