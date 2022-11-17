import java.util.*;
public class BaseAdd
{
	void sum(int a,int b,int base)
	{	
		String result = "";
		int carry = 0,r1=0,r2=0,sum=0;	
		while(a>0 || b>0)
		{
			sum = (a%10+b%10+carry);
			result = (sum%base)+result;
			//System.out.println("Result : "+result);
			carry = sum/base;
			a/=10;
			b/=10;
		}
		if(carry>0){
			result = carry+result;}
	
		System.out.println("Result : "+result);
	}
	public static void main(String[] args)
	{	
		BaseAdd ba = new BaseAdd();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.print("Enter base : ");
		int base = in.nextInt();
		ba.sum(a,b,base);
	}
}