public class ExceptionMultipleCatchDemo
{
	public static void main(String[] args)
	{
		try	
		{
			int a = 10;
			int b = 0;
			int[] arr = new int[5];
			arr[5] = a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}