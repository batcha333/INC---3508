// 	  2
//      2 2 2
//    2 0 2 0 2
// 2 0 0 2 0 0 2
public class Pattern
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				if(j==0 || j==2*i || j==(2*i+1)/2)
					System.out.print(2);
				else
					System.out.print(0);
			}System.out.println();
		}
	}
}