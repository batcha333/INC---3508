import java.util.*;
public class Long
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String  s = in.next();
		int max = 0;
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			boolean check[] = new boolean[26];
			check[s.charAt(i)-97] = true;
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(check[s.charAt(j)-97])
				{
					break;
				}
				else
				{	
					check[s.charAt(j)-97] = true;
					count++;
				}
				
			}
			max = Math.max(max,count);
			
		}
		System.out.println("Max : "+max);
	}
}