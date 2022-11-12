import java.util.*;
public class EggsTask
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
		System.out.println("Number of eggs : "+count);
		System.out.println("Number of dozens : "+count/12);	
		System.out.println("Number of leftovers : "+count%12);
	}
	public static void main(String[] args)
	{
		EggsTask egg = new EggsTask();
		int count = egg.getEggCount();
		egg.show(count);
	}
}