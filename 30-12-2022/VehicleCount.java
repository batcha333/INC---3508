import java.util.*;
public class VehicleCount
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter vehicle count : ");
		int n = in.nextInt();
		System.out.print("Enter wheel count : ");
		int w = in.nextInt();
		int x = 0,y=0;
		for(x=0;x<n;x++)
		{
			y = n-x;
			if(w==(4*x)+(2*y) && x+y==n)
				break;
		}
		if(y!=0)
			System.out.println("Four wheelers : "+x+" Two Wheelers : "+y);
		else
			System.out.println("Invalid Input");
	}
}