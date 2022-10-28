public class MaxSubstringWithoutRepeatingInt
{
	public static void main(String[] args)
	{
		int[] array = {2,5,0,2,1,4,3,6,1,0};
		
		int n = array.length;
		int max=0,start=0,end=0;
		for(int i=0;i<n;i++)
		{	
			boolean[] check = new boolean[10];
			check[array[i]]=true;
			int j;
			for(j=i+1;j<n;j++)
			{
				if(!check[array[j]])
				{
					check[array[j]]=true;
					 
				}
				else
				{
					break;
				}
				 
			}
			if(max < j-i)
			{
				max = j-i;
				end = j-1;
				start = i;
			}
		}
		System.out.print("Range : "+start+" "+end);
	}
}