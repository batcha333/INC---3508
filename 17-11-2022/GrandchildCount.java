import java.util.Scanner;
public class GrandchildCount
{
	int countGrandChild(String[][] str,String g)
	{
		int count = 0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i][1].equals(g))
			{
				for(int j=0;j<str.length;j++)
				{
					if(str[j][1].equals(str[i][0])){count++;}
				}
				//father ="";
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		GrandchildCount gc = new GrandchildCount();
		Scanner in = new Scanner(System.in);
		/*System.out.print("Enter no of sets : ");
		int n = in.nextInt();
		System.out.print("Enter sets : ");
		String[][] str =  new String[n][2];*/
		String[][] str = {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		/*for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				str[i][j] = in.next();
			}
		}*/
		System.out.print("Enter name : ");
		String grandpa = in.next();
		System.out.println("No of GrandChildren : "+gc.countGrandChild(str,grandpa));
		in.close();
	}
}