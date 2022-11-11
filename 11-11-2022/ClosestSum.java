import java.util.*;
public class ClosestSum
{
	static int closestSum(int[] arr,int t)
	{
		int n = arr.length;		
		int sum=0,max=Integer.MIN_VALUE;
		if(n<3){return 0;}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					sum = arr[i]+arr[j]+arr[k];
					if(sum==t || sum==t-1 || sum==t+1){
						if(max<sum){max=sum;}
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);	
		System.out.print("Enter an array : ");
		String[] str = in.nextLine().split(" ");
		int[] array = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			array[i] = Integer.parseInt(str[i]);	
		}
		System.out.print("Enter target : ");
		int t = in.nextInt();
		System.out.println("Sum : "+closestSum(array,t));
	}
}