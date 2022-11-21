import java.util.*;
public class Move
{
	void print(int[] arr)
	{	
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				System.out.print(arr[i]+" ");
				count++;	
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.print(0+" ");
		}
	}
	public static void main(String[] args)
	{
		Move m = new Move();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size : ");
		int size = in.nextInt();	
		int[] arr = new int[size];
		System.out.print("Enter an array : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = in.nextInt();	
		}
		m.print(arr);
	}
}
