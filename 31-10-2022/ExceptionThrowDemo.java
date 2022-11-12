public class ExceptionThrowDemo
{
	void check(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible to vote");
		}
		else
		{
			System.out.println("ELigible to vote");
		}
	}
	public static void main(String[] args)
	{
		ExceptionThrowDemo exep = new ExceptionThrowDemo();
		exep.check(14);
	}
}