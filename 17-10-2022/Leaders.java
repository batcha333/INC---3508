import java.util.*;
public class Leaders
{		
	public static void getLeader(int[] a, int n)
	{
		
		for(int i=0;i<n;i++)
		{
			boolean flag = true;
			for(int j=i+1;j<n;j++)
			{
				if(!(a[i]>a[j])){
					flag = false;
					break;
				}	
			}
			if(flag)
				System.out.println(a[i]+" is a Leader");
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Array Elements : ");
		String strArray[] = in.nextLine().split(" ");
		
		int len = strArray.length;
		int[] array = new int[len];
		for(int i=0;i<len;i++){
			array[i] = Integer.parseInt(strArray[i]);
		}
		//System.out.print(Arrays.toString(array));
		getLeader(array,len);	
	}
}