public class LinearSearch
{
	static int search(int[] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k){return 1;}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int[] arr= {1,54,32,67,3,2,45};
		int k=67;
		if(search(arr,k)==1){System.out.println(k+" is present");}
		else System.out.println("Not present");
	}
}