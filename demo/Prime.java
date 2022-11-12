import java.util.*;
public class Prime
{
	static Boolean check(int num){
		int m=num/2,i;
		if(num==0 || num==1)
		{
			return false;
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					return false;	
				}
			}
			return true;	
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num :");
		int n = in.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(check(i))
			{
				System.out.println(i+" is Prime number");
			}
		}	 
	}
}