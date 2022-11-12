import java.util.Scanner;
import java.util.Arrays;
public class DualSort
{
	public static void main(String args[])
	{	
		Scanner in =new Scanner(System.in);
		System.out.print("ENter the numbers : ");
		int[] arr = new int[10];
		int[] odd = new int[5];
		int[] even = new int[5];
		int k=0,l=0;
		for(int i=0;i<9;i++)
		{
			arr[i]=in.nextInt();
		}
		in.close();
		for( int i=0;i<9;i++)
		{
			if(arr[i]%2==0){even[k]=arr[i];k++;}
			else 
			{	
				odd[l]=arr[i];
				l++;
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		for(int i=0;i<5;i++){
			System.out.print(even[i]+" "+odd[4-i]+" ");
		}
	}
}