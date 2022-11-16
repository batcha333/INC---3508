import java.util.*;
public class Alternate
{	
	static int[] sort(int[] arr)
	{
		//int n = arr.length;
		for(int i=0;i+1<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an array : ");
		String[] str = in.nextLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int[] sorted = sort(arr);
		System.out.println(Arrays.toString(sorted));
		int l = 0,r = arr.length-1;
		while(l<r){
			System.out.print(arr[r]+" "+arr[l]+" ");
			l++;r--;
		}
		System.out.print(arr[l]+" ");
	}
}