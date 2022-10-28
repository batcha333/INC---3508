import java.util.*;
class Arithmetic
{
	private int number1;
	private int number2;
	void setOperands(int number1,int number2)
	{
		this.number1 = number1;
		this.number2 = number2;	
	}
	void showOperations()	
	{
		System.out.println("Sum of 2 numbers : "+(number1+number2));
		System.out.println("Difference of 2 numbers : "+(number1-number2));
		System.out.println("Product of 2 numbers : "+(number1*number2));
		System.out.println("Division of 2 numbers : "+(number1/number2));
	}
}
public class ArithmeticOperation
{
	public static void main(String[] args)
	{
		Arithmetic ao = new Arithmetic();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 operands: ");
		int number1 = in.nextInt();
		int number2 = in.nextInt();		
		ao.setOperands(number1,number2);
		ao.showOperations();
	}
}
