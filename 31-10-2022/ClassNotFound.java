public class ClassNotFound
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("noclass");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}