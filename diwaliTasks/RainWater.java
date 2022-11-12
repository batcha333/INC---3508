import java.util.*;
public class RainWater
{
	static Scanner in = new Scanner(System.in);
	int[] getInput(int size)
	{
		
		int[] array = new int[size];
		System.out.print("Enter Array elements : ");
		for(int i=0;i<size;i++)
		{
			array[i]=in.nextInt();
		} 
		return array;
	}
	void computeVolume(int[] array, int size)
	{
		int sum=0;
		int left = 0, right = size -1;
		int minimum = array[left]<array[right]?array[left]:array[right];
		for(int i =1;i<=size-2;i++)
		{
			sum += array[i];
		}
		//System.out.print("min : "+minimum);
		int waterLevel = minimum * (size-2) - sum;
		if(waterLevel < 0){waterLevel = 0;}
		System.out.print("Water Volume : "+waterLevel);
	}
	public static void main(String args[])
	{
		System.out.print("Enter array size : ");
		int size = in.nextInt();
		RainWater rain = new RainWater();
		int[] array= rain.getInput(size);
		rain.computeVolume(array,size);	
	}
}