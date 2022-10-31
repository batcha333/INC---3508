class Exception
{
	void display()
	{
		int div = 10/1;
		System.out.println("Div");
	}
}
public class ExceptionBaseClassPrecedenceDemo extends Exception
{
	void display()
	{
		int div = 10/0;
		System.out.println(div);
	}
	public static void main(String[] args)
	{
		try
		{
			ExceptionBaseClassPrecedenceDemo e = new ExceptionBaseClassPrecedenceDemo();
			e.display();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}	
	}
}