import java.util.*;
public class StringReverse
{
	static String name = "Faadil Batcha";
	static char[] strArray = name.toCharArray();
	public static void rev(int l,int r)
	{
		while(l<=r)
		{
			char temp = strArray[l];
			strArray[l] = strArray[r];
			strArray[r] = temp;
			l++;
			r--;
		}
	}
	public static void main(String[] args)
	{
		int len = strArray.length;
		int left = 0,right= len-1;
		for(int i=0;i<len;i++)
		{
			if(strArray[i]==' ' || i==len-1)
			{
				if(i==len-1) right =i;
				else right = i-1;
				rev(left,right);
				left = i+1;
			}
		}
		System.out.print(Arrays.toString(strArray));
	}
}