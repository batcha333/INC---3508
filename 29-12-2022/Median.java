import java.util.*;
public class Median
{
	public void merge(int[] a,int[] b)
	{
		int n = a.length,m=b.length,i=0,j=0;
		int[] arr = new int[n+m];
		int index = 0;
		while(i<n || j<m)
		{
			while(i<n && j<m)
				if(a[i]>b[j])
				{
					arr[index++] = b[j];
					j++;
				}	
				else
				{
					arr[index++] = a[i];
					i++;
				}		
			while(i<n)
			{
				arr[index++] = a[i];
				i++;
			}
			while(j<m)
			{
				arr[index++] = b[j];
				j++;
			}			
		}
		int mid = arr.length/2;
		System.out.println("Array : "+Arrays.toString(arr));
		if(arr.length%2==0)
			System.out.println((arr[mid]+arr[mid-1])/2);
		else
			System.out.println(arr[mid]);
	}
	public static void main(String[] args)
	{
		Median med = new Median();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array 1 size : ");
		int n = in.nextInt();
		System.out.print("Enter array 2 size : ");
		int m = in.nextInt();
		System.out.print("Enter array 1 : ");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		System.out.print("Enter array 2 : ");
		int[] b = new int[m];
		for(int i=0;i<m;i++)
			b[i] = in.nextInt();
		med.merge(a,b);
	}
}