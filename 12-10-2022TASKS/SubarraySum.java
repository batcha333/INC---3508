public class SubarraySum
{
	public static void main(String args[])
	{
		int a=0,flag=0;
		int[] arr= new int[]{1,2,-2,3,4,5,6};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0){a=arr[i];}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])-a==0)
				{
					flag=1;
				}
			}
		}
		if(flag==1){System.out.print("True");}
		else{System.out.print("False");}
	}
}