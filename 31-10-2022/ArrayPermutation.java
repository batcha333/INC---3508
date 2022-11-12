import java.util.ArrayList;
public class ArrayPermutation
{
	static ArrayList<String> list = new ArrayList<>();
	static ArrayList<String> ans = new ArrayList<>();
	static ArrayList<String> concat(int n)
	{
		for(int i=0;i+n<=list.size();i+=n)
		{
			String newStr = "";
			for(int j=0;j<n;j++)
			{
				newStr += list.get(i+j);
				
			}
			ans.add(newStr);
			System.out.println("Answer : "+newStr);
		}
		return ans;	
	}
	static void printArray(String[] arr)
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			list.add(arr[i]);
		}
	}
	static void swap(String[] arr,int a,int b)
	{
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
 	}
	static void printPermutation(String[] arr,int idx)
	{
		if(idx == arr.length-1)
		{
			printArray(arr);
			return;
		}
		for(int i=0;i<arr.length;i++)
		{
			swap(arr,i,idx);
			printPermutation(arr,idx+1);
			swap(arr,i,idx);
		}
	}
	public static void main(String[] args)
	{
		String str = "barfoothefoobarman";
		String[] array = {"foo","bar","the"};
		printPermutation(array,0);
		System.out.println(ans);
		System.out.print(concat(array.length));
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(str.indexOf(ans.get(i)));
		}
	}
}