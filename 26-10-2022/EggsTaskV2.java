import java.util.*;
public class EggsTaskV2
{
	int getEggCount()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of eggs : ");
		int count = in.nextInt();	
		return count;
	}
	void show(int count)
	{
		int gross = count/144;
		count %= 144;
		int dozen = count/12;
		count %= 12;
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, "+"and "+count+" eggs");	
	}
	public static void main(String[] args)
	{
		EggsTaskV2 egg = new EggsTaskV2();
		int count = egg.getEggCount();
		egg.show(count);
	}
}