/*        f
        e   g
      d       h
    c           i
  b               j
a                   k
  b               j
    c           i
      d       h
        e   g
          f		

      e
    c   c
  a       a
r           r
  a       a
    c   c
      e

*/
import java.util.*;
public class Pattern
{
	void pattern(String str)
	{
		int n = str.length();
		int mid = n/2;
		for(int i=0;i<n;i++)	
		{
			for(int j=0;j<n;j++)
			{
				if(i<=mid && j<=mid)
				{
					if(i+j==mid)
					{
						System.out.print(str.charAt(j)+" ");
					}
					else
					{
						System.out.print("  ");	
					}
				}
				else if(i<=mid && j>mid)
				{
					if(j-i==mid)
					{
						System.out.print(str.charAt(j)+" ");
					}
					else
					{
						System.out.print("  ");	
					}
				}	
				else if(i>mid && j<=mid)
				{
					if(i-j==mid)
					{
						System.out.print(str.charAt(j)+" ");
					}
					else
					{
						System.out.print("  ");	
					}
				}
				else if(i>mid && j>=mid)
				{
					if((i+j)/mid==3 && (i+j)%mid==0)
					{
						System.out.print(str.charAt(j)+" ");
					}
					else
					{
						System.out.print("  ");	
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Pattern p = new Pattern();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = in.next();
		//String str = "racecar";
		if(str.length()%2==0){System.out.println("Not possible");}
		else{p.pattern(str);}
		in.close();
	}
}