import java.util.Scanner;
class Tree
{
	int val;
	Tree left;
	Tree right;
	Tree(int data)
	{
		this.val = data;
	}
	Tree(int val,Tree left,Tree right)
	{
		this.val = val;
		this.right = right;
		this.left = left;
	}
	public static Tree insert(int[] a,int index)
	{
		if(index>=a.length) return null;
		Tree root = new Tree(a[index],insert(a,2*index+1),insert(a,2*index+2));
		return root;
	}

	public static void traverse(Tree root)
	{
		if(root == null)return;
		System.out.print(root.val+" ");
		traverse(root.left);
		traverse(root.right);
	}
}
public class LeafSum
{
	int sum = 0;

	public void calculateSum(Tree root,String s)
	{
		if(root.left==null && root.right==null)
		{
			sum += Integer.parseInt(s+root.val);
			return;
		}
		calculateSum(root.left,s+root.val);
		calculateSum(root.right,s+root.val);	
	}

	public void createTree(int[] arr)
	{
		Tree root = Tree.insert(arr,0);
		Tree.traverse(root);
		calculateSum(root,"");
		System.out.println("Sum : "+sum);
	}

	public static void main(String[] args)
	{
		LeafSum l = new LeafSum();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = in.nextInt();
		System.out.print("Enter a array : ");	
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		l.createTree(arr);
	}
}