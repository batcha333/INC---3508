import java.util.*;
public class Trap
{
	public int sumOfDigits(int n)
	{
		int sum = 0;
		while(n>0)
		{
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	public boolean isTrap(int i,int t)
	{
		if(t%i==0 || i%t==0)
			return true;
		while(true)
		{
			i = sumOfDigits(i);
			if(t%i==0 || i%t==0)
				return true;
			if(i<=9)
				return false;
		}
	}
	public void printTrap(int s,int e,int t)
	{
		for(int i=s;i<=e;i++)
		{
			t = t<3 ? 3 : t;
			if(isTrap(i,t))
			{	
				System.out.println(i);
				t += 2;
			}
			else
				t -= 1;
		}
	}
	public static void main(String[] args)
	{
		Trap trap = new Trap();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter range : ");
		int s = in.nextInt();
		int e = in.nextInt();
		System.out.print("Enter Trap : ");
		int t = in.nextInt();
		trap.printTrap(s,e,t);
	}
}