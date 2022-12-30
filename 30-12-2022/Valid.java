import java.util.Scanner;
public class Valid
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = in.next();
		int star=0,hash=0;
		char[] a = s.toCharArray();
		for(char c : s.toCharArray()){
			if(c=='*')
				star++;
			else
				hash++;
		}
		if(star==hash)
			System.out.print("0");
		else if(star>hash)
			System.out.print(star-hash);
		else
			System.out.print(star-hash);
	}
}