import java.util.Scanner;
public class Slide
{
	static void max(int[] arr,int l,int r)
	{
		int max = Integer.MIN_VALUE;
		System.out.println("ans");
		for(int i=l;i<=r;i++)
		{
			if(max<arr[i]){max=arr[i];}
		}
		System.out.print(max+" ");
	}
	public static void main(String arsg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an array : ");
		String[] str = in.nextLine().split(" ");
		int[] array = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			array[i] = Integer.parseInt(str[i]);
		}
		System.out.println("Enter a target : ");
		int k = in.nextInt();	
		int l = 0,r = k-1;
		int len = array.length;
		while(l<=(len-k) && r<len)
		{
			max(array,l,r);
			l++;
			r++;
		}
	}
}