import java.util.*;
public class NextPali
{	
	boolean check(int[] str)
	{
		int[] s = new int[str.length];
		for(int i=str.length-1,j=0;i>=0 && j<str.length;i--,j++)
		{
			s[j] = str[i];
		} 	
		//System.out.println("s :"+Arrays.toString(s));
		for(int i=0;i<str.length;i++)
		{
			if(s[i]!=str[i])
				return false;
		}
		//System.out.println("s :"+Arrays.toString(s));
		return true;
	}
	public static void main(String[] args)
	{	
		NextPali p = new NextPali();
		Scanner in = new Scanner(System.in);
		System.out.println("enter array : ");
		String[] str = in.nextLine().split(" ");
		//String[] str = {"1","3","4","5"};
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		//System.out.println(p.check(arr));
		//System.out.println(Arrays.toString(arr));
		int mid = arr.length/2;		
		int l = 0,r = arr.length-1,n=(1+arr[mid]);
		//System.out.println("n : "+(1+arr[mid]));
		for(int i=n;i<10;i++)
		{
			if(str.length%2!=0)
			{
				while(l<r){
					arr[r] = arr[l];
					r--;l++;
				}
				arr[mid] = i;
				if(p.check(arr)){System.out.println(Arrays.toString(arr));break;}
			}
		}
	}
}
/**/