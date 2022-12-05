import java.util.*;
public class Hamiltonian
{
	public void print(int[] path)
	{
		System.out.print(Arrays.toString(path));
	}
	public boolean isSafe(int t,int[][] graph,int[] path,int pos)
	{
		if(graph[path[pos-1]][t]==0)
			return false;
		for(int i=0;i<pos;i++)
		{
			if(path[i]==t)
				return false;	
		}
		return true;
	}
	public boolean hamCycleUntil(int[][] graph,int[] path,int pos)
	{
		if(pos == 5)
		{
			if(graph[path[pos-1]][path[0]]==1)
				return true;
			else
				return false;
		}
	
		for(int t=1;t<path.length;t++)
		{
			if(isSafe(t,graph,path,pos))
			{
				path[pos] = t;
				if(hamCycleUntil(graph,path,pos+1))
					return true;
				path[pos] = -1;
			}
		}
		return false;
	}
	public void hamCycle(int[][] graph)
	{
		int[] path = new int[graph.length];
		for (int i = 0; i < path.length; i++)
			path[i] = -1;
		path[0] = 0;
		int pos = 0;
		if(hamCycleUntil(graph,path,1)==false)
		{
			System.out.println("\nSolution does not exist");
			return;
		}

		print(path);
		return;
	}
	public static void main(String[] args)
	{
		int[][] graph = {{0, 1, 0, 1, 0},
			{1, 0, 1, 1, 1},
			{0, 1, 0, 0, 1},
			{1, 1, 0, 0, 1},
			{0, 1, 1, 1, 0},
		};
		Hamiltonian ham = new Hamiltonian();
		ham.hamCycle(graph);	
	}
}