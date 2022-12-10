public class Permutation
{
	static void printPermute(char[] str)
	{	
		System.out.println();
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
	} 
	static void swap(char[] str,int a,int b)
	{
		char temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}
	static void permute(char[] str,int k)
	{
		if(k==str.length-1)
		{
			printPermute(str);
			return;
		}
		for(int i=k;i<str.length;i++)
		{
			swap(str,i,k);
			permute(str,k+1);
			swap(str,i,k);
		}
	}
	public static void main(String[] args)
	{
		String s = "ABC";
		char[] str = s.toCharArray();
		permute(str,0);
	}
}