import java.util.*;
public class NextGreater
{
	public int next(int e,int[] temp)
	{
		int index = 0;
		for(int i=0;i<temp.length;i++)
			if(temp[i]==e)
				index = i;
		if(index==temp.length-1)
			return -1;	
		else
			return temp[index+1];
	}
	public static void main(String[] args)
	{
		NextGreater nex = new NextGreater();
		Scanner in = new Scanner(System.in);	
		System.out.print("Enter a size : ");	
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		int[] temp = new int[n];	
		for(int i=0;i<n;i++)
			temp[i] = arr[i];
		Arrays.sort(temp);
		for(int i=0;i<n;i++)	
			arr[i] = nex.next(arr[i],temp);
		for(int i : arr)
			System.out.print(i+" ");
	}
}