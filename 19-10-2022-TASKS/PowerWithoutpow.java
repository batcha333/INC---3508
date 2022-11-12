import java.util.*;
public class PowerWithoutpow
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int power = 1;
		for(int i=1;i<=n2;i++)
		{
			power *= n1 * 1;
		}
		System.out.print("Power : "+power);	
	}
}