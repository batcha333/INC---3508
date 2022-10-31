public class NumberFormat
{
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt("10b");
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();	
		}
	}
}