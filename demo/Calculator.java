import java.util.Scanner;

class Calc
{
	int num1,num2,result;
	void sum()
	{
		result=num1+num2;
	}
}

public class Calculator
{
	public static void main(String[] args)
	{
		Calc obj = new Calc();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int num1= in.nextInt();
		System.out.println("Enter number 2 : ");
		int num2= in.nextInt();
		obj.num1=num1;
		obj.num2=num2;
		obj.sum();		
		System.out.println("Sum is "+obj.result);
	}
}

