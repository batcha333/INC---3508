import java.util.Scanner;
public class Pattern8
{
	int minimum(int l,int r,int t,int b)
	{
		int min = l;
		if(min>r) min = r;
		if(min>t) min = t;
		if(min>b) min = b;
		return min;
	}
	void pattern(int n)
	{
		int left=0,top=0,right=2*n-1,bottom=2*n-1;	
		for(int i=0;i<2*n-1;i++)
		{
			for(int j=0;j<2*n-1;j++)
			{
				int min = minimum(left+j,top+i,right-j-1,bottom-i-1);
				System.out.print((n-min)+" ");
			}System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Pattern8 p = new Pattern8();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		p.pattern(n);
	}
}