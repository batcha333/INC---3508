import java.util.Arrays;
public class ArraysDemo
{
	public static void main(String args[])
	{
		int[] arr1= new int[]{1,2,3,4,5,6,7,8,9,10};
		int len = arr1.length;
		int[] arr2 = Arrays.copyOf(arr1,len);
		System.out.println("Array Length : "+len);
		System.out.print(Arrays.toString(arr2)+" ");
	}
}