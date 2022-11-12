import java.util.Arrays;
public class RevStringRange
{
	public static void reverse(char str[],int l,int r)
	{
		if(l<r)
		{
			char temp = str[l];
			str[l] = str[r];
			str[r] = temp;
		}
	}
	public static void main(String args[])
	{
		String name = "Tharunkumar1";
		char str[] = name.toCharArray();
		int len = str.length;
		for(int i=0;i<len;i+=3)
		{
			reverse(str,i,i+3-1);
		}
		System.out.println(Arrays.toString(str)+" ");
	}
}