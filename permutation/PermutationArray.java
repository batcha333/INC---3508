public class PermutationArray
{
	static int count =0;
	static void printArray(char[] array)
	{
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
	}
	static void swap(char[] array,int a,int b)
	{
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	static void printPermutation(char[] array,int currentIndex)
	{
		if(currentIndex == array.length-1)
		{
			printArray(array);
			count++;
			return;
		}
		for(int i=currentIndex;i<array.length;i++)
		{
			swap(array,i,currentIndex);
			printPermutation(array,currentIndex+1);
			swap(array,i,currentIndex);
		}
	}
	public static void main(String args[])
	{
		String str = "ABCDEF";
		char[] array = str.toCharArray();
		printPermutation(array,0);
		System.out.println("count : "+count);
	}
}