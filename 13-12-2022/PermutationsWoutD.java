import java.util.*;
public class PermutationsWoutD
{
	public void swap(char[] arr,int a,int b)
	{
		char t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public void permute(List<String> list,char[] arr,int c)
	{
		
		if(c==arr.length-1)
		{
			String newStr ="";
			for(int i=0;i<arr.length;i++)
			{
				if(i>0 && arr[i]==arr[i-1])
					return;
				newStr += arr[i];
			}	
			//System.out.println(newStr);
			list.add(newStr);
		}
		for(int i=c;i<arr.length;i++)
		{
			swap(arr,i,c);
			permute(list,arr,c+1);
			swap(arr,i,c);
		}
	}	

	public static void main(String[] args)
	{
		PermutationsWoutD p = new PermutationsWoutD();
		List<String> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter red : ");
		int r = in.nextInt();	
		System.out.print("Enter blue : ");
		int b = in.nextInt();
		System.out.print("Enter green : ");
		int g = in.nextInt();
		int n = r+b+g;
		int count = 1;
		String s = "";
		if(r>1){count += r-1;}
		else if(b>1){count += b-1;}
		else if(g>1){count += g-1;}
		while(b>0)
		{
			s += 'b';
			b--; 
		}
		while(g>0)
		{
			s += 'g'; 
			g--;		
		}
		while(r>0)
		{
			s += 'r'; 
			r--;
		}

		System.out.println(s);
		char[] arr = s.toCharArray();
		p.permute(list,arr,0);
		//System.out.println(list);
		//System.out.println("Size : "+list.size());
		Set<String> set = new HashSet<>(list);
		System.out.println("Size : "+set.size());
	}
}