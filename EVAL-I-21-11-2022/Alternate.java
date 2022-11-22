import java.util.Scanner;
public class Alternate
{	
	void print(int[] a1,int[] a2)
	{
		for(int i=0,j=0;i<a1.length || j<a2.length;i++,j++)
		{
			System.out.print(a1[i]+","+a2[j]+",");
		}
	}
	public static void main(String[] args)
	{
		Alternate a = new Alternate();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array 1 : ");
		String[] s1 = in.nextLine().split(" ");	
		System.out.print("Enter array 2 : ");
		String[] s2 = in.nextLine().split(" ");
		int[] arr1 = new int[s1.length];		
		int[] arr2 = new int[s2.length];
		for(int i=0;i<s1.length;i++)
		{
			arr1[i] = Integer.parseInt(s1[i]);
		}
		for(int i=0;i<s2.length;i++)
		{
			arr2[i] = Integer.parseInt(s2[i]);
		}	
		a.print(arr1,arr2);
	}
}