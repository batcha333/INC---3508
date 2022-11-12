import java.util.*;
public class Threshold
{
	static int tCount;
	static void countTime(int ele,int t)
	{
		int count = 1;
		if(ele%t == 0){count = 0;}
		while(ele>=t)	
		{
			ele -= t;
			count++;
		}
		tCount += count;
		count = 1;
		//System.out.println("Count : "+tCount);
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an array : ");
		String[] str = in.nextLine().split(" ");
		int[] array = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter threshold : ");
		int t = in.nextInt();
		for(int i=0;i<array.length;i++)
		{
			countTime(array[i],t);
		}
		System.out.println("Main Count : "+tCount);
	}
}