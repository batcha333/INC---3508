public class TargetSum
{
	int count = 0;
	public void find(int[] arr,int idx,int sum,int target)
	{
		if(idx==arr.length)
		{
			if(sum==target)
				count++;
			return;
		}
		find(arr,idx+1,sum+arr[idx],target);
		find(arr,idx+1,sum-arr[idx],target);
	}
	public static void main(String[] args)
	{
		int[] arr = {1,1,1,1,1};
		TargetSum ts = new TargetSum();
		int target = 3;
		ts.find(arr,0,0,target);
		System.out.println("Ways : "+ts.count);
	}
}