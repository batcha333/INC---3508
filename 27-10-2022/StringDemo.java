import java.util.*;
public class StringDemo
{
	public static void main(String[] args)
	{
		String str = "barfoothefoobarman";
		StringBuilder s = new StringBuilder();
		String[] subStr = {"foo","bar"};
		for(int i=0;i<subStr.length;i++)
		{
			s.append(subStr[i]);
		}
		int index = str.indexOf(s);
		System.out.print("Index : "+index);
	}
}