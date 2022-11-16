public class LongSeq
{
	int isPresent(char[] arr,char c,int index)
	{
		int j=0;
		for(j=arr.length-1;j>index;j--)
		{
			if(arr[j]==c)
			{
				return j-1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		String str = "aaaaaaa";
		LongSeq l = new LongSeq();	
		char[] arr = str.toCharArray(); 
		for(int i=0;i<arr.length;i++)
		{
			int end = l.isPresent(arr,arr[i],i);
			if(end!=0)
			{
				System.out.println(end-i);
				break;
			}
		}
	}
}