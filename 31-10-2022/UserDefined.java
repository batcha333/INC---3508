class MyExcepetion extends Exception
{
	public MyException(String str)
	{
		super(str);
	}
}
public class UserDefined 
{
	public static void validate(int number) throws MyException
	{
		if(number<18)
		{
			throw new MyException("My Exception");
		}else{
			System.out.println("***********");
		}
	}
	public static void main(String[] args)
	{
		try{validate(17);}		
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}