public class PermutationString
{
	static void permutation(String str,String perm,int index)
	{
		if(str.length()==0)
		{
			System.out.print(perm+" ");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char presentChar = str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);
			permutation(newStr,perm+presentChar,index+1);
		}		
	}
	public static void main(String[] args)
	{
		String str = "ABCDEF";
		permutation(str,"",0);
	}
}