import java.util.*;
public class PetrolBunks
{
	int level(int c,int[] exp,int[] ref)
	{
		for(int i=0;i<exp.length;i++)
		{
			c = c + ref[i] - exp[i];
		}
		return c;
	}
	public static void main(String[] args)
	{
		PetrolBunks petrol = new PetrolBunks();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter current tank level : ");
		int current = in.nextInt();
		System.out.print("Enter number of bunks : ");
		int n = in.nextInt();
		int[] expense = new int[n];
		int[] refill = new int[n];
		System.out.print("Enter expense levels : ");	
		for(int i=0;i<n;i++)
		{
			expense[i] = in.nextInt();
		}
		System.out.print("Enter refill levels : ");
		for(int i=0;i<n;i++)
		{
			refill[i] = in.nextInt();
		}
		System.out.println("Tank level at the end: "+petrol.level(current,expense,refill));
		in.close();
	}
}