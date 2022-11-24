import java.util.*;
public class DistinctWords
{
	public static boolean isPresent(String s,String a[]){
		for(int i=0;a[i]!=null;i++)
			if(s.equals(a[i]))
				return true;
		return false;
	}
	void checkDistinct(String[] s1)
	{
		String b[] = new String[s1.length];
		int ind =0;

		for(String i:s1){
			if(!isPresent(i,b)){
				b[ind++] = i;
			}
		}
		for(int i=0;b[i]!=null;i++)
			System.out.print(b[i] +" ");
	}
	public static void main(String[] args)
	{
		DistinctWords d = new DistinctWords();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a line : ");
		String[] s1 = in.nextLine().split(" ");
		d.checkDistinct(s1);
	}
}