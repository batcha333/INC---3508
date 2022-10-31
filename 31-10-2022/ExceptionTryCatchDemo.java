public class ExceptionTryCatchDemo
{
	public static void main(String[] args)
	{
		try
		{
			int[] array = new int[-5];
		}
		catch(NegativeArraySizeException neg)
		{
			neg.printStackTrace();
		}
	}
}