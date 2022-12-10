import java.util.*;
public class CombinationV2
{
	//static List<List<Integer>> ans = new ArrayList<>();
	//static int[] array = new int[8];
	public static void main(String[] args)
	{
		int[] a = {1,2,3};
		List<Integer> list = new ArrayList<>();
		for(int range=0;range<=a.length;range++)
		{
			combination(a,0,a.length,range);
		}
		System.out.println(ans);	
	}
	public static void combination(int[] a,int curr,int len,int range)
	{
		if(curr==range)
		{
			//List<Integer> temp = new ArrayList<>();
			//for(Integer i : list){
			//	temp.add(i);
			//}
			//ans.add(temp);
			return;
		}
		for(int i=curr;i<len;i++)
		{
			if(i>curr && a[i]==a[i-1])
				continue;
			list.add(a[i]);
			combination(list,a,i+1,len,range);
			list.remove(list.size()-1);
		}
	}
}