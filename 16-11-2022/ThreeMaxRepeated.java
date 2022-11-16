public class ThreeMaxRepeated
{
	public static void main(String[] args)
	{
		//int[] arr = {1,2,3,1,5,2,3,2};
		int[] arr={3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3, 6, 2, 3};
		int[] LOOKUP = new int[100000];
		for(int i=0;i<arr.length;i++)
		{
			LOOKUP[arr[i]]++;
		}
		int firstMax=Integer.MIN_VALUE,secondMax=Integer.MIN_VALUE,thirdMax=Integer.MIN_VALUE,x=0,y=0,z=0;
		for(int i=0;i<arr.length;i++)
		{
			if(LOOKUP[arr[i]]>firstMax)
			{			
				thirdMax = secondMax;
				z=y;
				secondMax = firstMax;
				y=x;
				firstMax = LOOKUP[arr[i]];
				x=arr[i];
				LOOKUP[arr[i]]=0;
			}
			else if(LOOKUP[arr[i]]>secondMax && firstMax!=secondMax)
			{
				thirdMax = secondMax;
				z=y;
				secondMax = LOOKUP[arr[i]];
				y=arr[i];
				LOOKUP[arr[i]]=0;
			}
			else if(LOOKUP[arr[i]]>thirdMax)
			{
				thirdMax = LOOKUP[arr[i]];
				z=arr[i];
				LOOKUP[arr[i]]=0;
			}
		}
		System.out.println("Three Max Repeaters : "+x+" "+y+" "+z);
	}
}