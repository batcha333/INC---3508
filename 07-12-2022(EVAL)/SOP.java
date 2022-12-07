import java.util.*;
public class SOP
{
	public boolean isValid(int[] b,int e)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==e)
			{
				return false;
			}
		}
		return true;
	}

	public void printPairs(int[] b,int t)
	{	
		int flag = 0;
		for(int i=0;i+1<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(Math.abs(b[i]+b[j])==t)
				{
					System.out.println("("+b[i]+","+b[j]+") ");
					flag = 1;
				}
			}
		}
		if(flag == 0){System.out.println("No available pairs");}
		
	}
	public static void main(String[] args)
	{
		SOP p = new SOP();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a array : ");
		String[] s = in.nextLine().split(",");	
		System.out.print("Enter a target : ");
		int t = in.nextInt();
		int n = s.length;
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(s[i]);
		} 
		int[] b = new int[n];
		b[0] = a[0];	
		int j = 1;
		for(int i=1;i<n;i++)
		{
			if(p.isValid(b,a[i]))
			{
				b[j++] = a[i];
			}
			else{b[j++] = Integer.MAX_VALUE;}	
		}
		System.out.println(Arrays.toString(b));
		p.printPairs(b,t);
	}
}