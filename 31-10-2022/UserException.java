class UserDefinedException extends Exception
{
	public UserDefinedException(String s)
	{
		super(s);
	}
}
public class UserException 
{
	public static void validate(int number) throws UserDefinedException
	{
		if(number<18)
		{
			throw new UserDefinedException("My Exception");
		}else{
			System.out.println("***********");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			validate(17);
		}
		catch(UserDefinedException e)	
		{
			e.printStackTrace();
		}
	}
}