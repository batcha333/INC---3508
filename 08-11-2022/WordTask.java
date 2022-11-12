public class WordTask
{
	public static void main(String[] args)
	{
		String str = "Hello World";
		int l=0,r=str.length()-1;
		while(l<r)
		{
			System.out.print(str.charAt(l)+" "+str.charAt(r)+" ");
			l++;
			r--;
		}
	}
}