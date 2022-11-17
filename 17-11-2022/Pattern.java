import java.util.Scanner;
public class Pattern
{	
	static int minimum(int a,int b,int c,int d)
	{
		int min = a;
		if(min>b)min=b;
		if(min>c)min=c;
		if(min>d)min=d;
		return min;
	} 
	void pattern(int m,int n)
	{
		int target = 0;
		int top =0,bottom  = m-1,left = 0,right = n-1;
		for(int row=0;row<m;row++)
		{
			for(int col=0;col<n;col++)
			{
				int ld = col-left;
				int rd = right-col;
				int td = row-top;
				int bd = bottom-row;
				int min = minimum(ld,rd,td,bd);
				System.out.print(min+" ");
				//if(min%2==0){System.out.print("X  ");}
				//else{System.out.print("O  ");}
			}System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Pattern p = new Pattern();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 dimensions : ");		
		int m = in.nextInt(),n = in.nextInt();
		p.pattern(m,n);
	}
}