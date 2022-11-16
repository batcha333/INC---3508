import java.util.*;
public class NextGreater
{
	void callNext(int[] arr)
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			int current = arr[i];
			int max = Integer.MAX_VALUE;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[j]>current && arr[j]<max)
					max = arr[j];
			}
			if(max==Integer.MAX_VALUE)System.out.print("_ ");
			else{System.out.print(max + " ");}
		}
	}
	public static void main(String[] args)
	{
		NextGreater ng = new NextGreater();
		//int arr[]={6, 3, 9, 10, 8, 2, 1, 15, 7};
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an array : ");
		String[] s = in.nextLine().split(" ");
		int[] arr = new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			arr[i] = Integer.parseInt(s[i]);
		}
		System.out.print(Arrays.toString(arr));
		ng.callNext(arr);
	}
}