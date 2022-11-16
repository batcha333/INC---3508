import java.util.*;
public class WaveArray
{
	static Scanner in = new Scanner(System.in);
	int[] getInput(int size)
	{
		System.out.print("Enter Array elements : ");
		int[] array = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = in.nextInt();
		}
		return array;
	}
	static void swap(int number1, int number2)
	{
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
	void convertToWave(int[] array,int size)
	{
		size = (size%2==0)?size:size-1;
		for(int i=0;i<size;i+=2)
		{
			int temp = array[i];
			array[i] = array[i+1];
			array[i+1] = temp;
			//swap(rray[i],array[i+1]);
		}
		System.out.print(Arrays.toString(array));
	}
	public static void main(String args[])
	{
		WaveArray wave = new WaveArray();
		System.out.print("Enter array size : ");
		int size = in.nextInt();
		int[] array= wave.getInput(size);
		wave.convertToWave(array,size);
	}
}