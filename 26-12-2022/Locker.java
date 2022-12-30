import java.util.Scanner;
public class Locker
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter a Lock : ");
		String s = in.next();
		int j = 0;
		for(int i=s.length()-1;i>=0;i--)
		{
			num = num + (int)(s.charAt(i)-64)*(int)Math.pow(26,j++);
		}
		System.out.println("Number : "+num);
	}
}