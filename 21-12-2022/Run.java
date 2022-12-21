import java.util.*;
public class Run
{
	public int[] remove(int[] a,int i)
	{
		int index = 0;
		int n = a.length;
		int[] b = new int[n/2];
		if(i%2==0)
		{
			for(int j=1;j<n;j+=2)
			{
				b[index++] = a[j];
			}
		}
		else
		{
			if(n%2==0)
			{
				for(int j=0;j<n;j+=2)
				{
					b[index++] = a[j];
				}
			}
			else
			{
				for(int j=1;j<n;j+=2)
				{
					b[index++] = a[j];
				}
			}
		}
		return b;
	}
	public void run(int[] a)
	{
		int i = 0;
		while(true)
		{	
			if(a.length==1)
			{
				System.out.println(a[0]+" ");
				return;
			}
			a = remove(a,i);
			i++;
		}
	}
	public static void main(String[] args)
	{
		Run r = new Run();
		//int[] arr = {1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = i+1;
		}
		r.run(arr);
	}
}