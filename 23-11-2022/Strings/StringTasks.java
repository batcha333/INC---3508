import java.util.*;
public class StringTasks
{
	static String str = "Welco$etoZohoCorporation";
	static String str2 = "WelcometoZohoCorporation";
	void methods()
	{
		/*System.out.println("Code point Before given : "+str.codePointBefore(10));
		System.out.println("Code point count in-between : "+str.codePointCount(2,10));
		System.out.println("String Comparison : "+str.compareTo(str2));*/
	}
	public static void main(String[] args)
	{
		StringTasks s = new StringTasks();
		Scanner in = new Scanner(System.in);
		//System.out.print("Enter a string : ");
		//String str = in.nextLine();
		s.methods();
		in.close();
	}
}