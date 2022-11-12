public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5,6,7,87,65,4,2,76,32};
		boolean[] check = new boolean[90];
		for(int i=0;i<array.length;i++)
		{
			if(!check[array[i]])
			{
				check[array[i]]=true;
			}
			else
				System.out.print(array[i]+" ");
		}

	}
}
