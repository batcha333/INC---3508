import java.util.Arrays;
public class SucceedingInt
{
	public static void main(String[] args)
	{
		int[] arr= new int[]{1,2,3};
		int len =arr.length;
		int i=0;
		for (int k : arr)
		{
			i = i*10+k;
		}
		i+=1;
		String str = Integer.toString(i);
		char ans[] = str.toCharArray();
		System.out.print(Arrays.toString(ans));
	}
}