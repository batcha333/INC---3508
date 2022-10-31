public class ExceptionTryCatchFinallyDemo
{
	public static void main(String[] args)
	{
		try
		{
			int a=10,b=0;
			int div = a/b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Arithmetic exception");
		}
		finally
		{
			System.out.println("Finally always block");
		}
	}
}