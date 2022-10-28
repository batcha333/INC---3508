import java.util.*;
public class ZerosPosNeg
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 	
		System.out.print("Enter the numbers : ");
		String[] str = in.nextLine().split(" ");
		int len = str.length;
		int[] array = new int[len];
		int zero=0,pos=0,neg=0;
		for(int i =0;i<len;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(array));
		for(int i : array)
		{
			if(i==0){zero++;}
			else if(i<0){neg++;}
			else pos++;
		}
		System.out.println("No. of Zero's: "+zero);
		System.out.println("No. of Positive's: "+pos);
		System.out.println("No. of Negative's: "+neg);
	}
}