import java.util.*;
public class CombinationsWithoutClone
{
	static List<List<Integer>> list = new ArrayList<>();
	public static void combination(int[] arr,int[] temp,int s,int e,int c,int r)
	{
		if(c==r)
		{
			List<Integer> l = new ArrayList<>();
			for(int i:temp)
			{
				l.add(i);
			}
			list.add(l);
			//list.add(temp.clone());
			return;
		}
		if(s<e)
		{
			temp[c] = arr[s];
			combination(arr,temp,s+1,e,c+1,r);
			combination(arr,temp,s+1,e,c,r);
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a array : ");
		String[] s = in.nextLine().split(" ");
		int[] arr = new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			arr[i] = Integer.parseInt(s[i]);
		}
		//arr = new int[]{1,2,2};
		for(int i=0;i<=arr.length;i++)
		{
			int[] temp = new int[i];
			combination(arr,temp,0,s.length,0,i);
		}
		Set<List<Integer>> set = new HashSet<>(list);
		for(List i:set)
		{
			System.out.println(i);
		}
	}
}