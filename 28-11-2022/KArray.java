import java.util.Scanner;
public class KArray
{
	void KArray(char[] arr,String prefix,int k)
	{
		if(k==0)
		{
			System.out.println(prefix);
			//if(isSafe(prefix))
			//	System.out.println(prefix);
			return;		
		}
		
		for(int i=0;i<arr.length;i++)
		{
			String newStr = prefix+arr[i];
			KArray(arr,newStr,k-1); 
		}
	}
	public static void main(String[] args)
	{
		KArray c = new KArray();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = in.next();
		char[] arr = str.toCharArray();
		System.out.println("Enter a range : ");
		int k = in.nextInt();
		for(int i=0;i<=k;i++)
		{
			c.KArray(arr,"",i);
		}
	}
	
	public static boolean isSafe(String s){
		System.out.println(s);
		char str[] =s.toCharArray();
		char t = str[0];
		for(int i=1;i<str.length;i++){
			if(t!=str[i])
				return true;
		}
		return false;
	}
}