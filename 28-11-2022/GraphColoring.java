import java.util.*;
public class GraphColoring
{
	public void color(int k,int m,int n,int[] colors,int[][] graph)
	{
		for(int c = 1;c<=m;c++)
		{
			if(isSafe(k,c,n,colors,graph))
			{
				colors[k] = c;
				if(k+1<n)
				{
					color(k+1, m, n, colors, graph);
				}
			}
		}
	}

	public boolean isSafe(int k,int c,int n,int[] colors,int[][] graph)
	{
		for(int i=0;i<n;i++)
		{
			if(graph[k][i]==1 && c == colors[i]){return false;}
		}
		return true;
	}

	public static void main(String[] args)
	{
		GraphColoring g = new GraphColoring();
        	int n = 4, m = 2;
        	int[] colors = new int[n];
        	int graph[][] = { { 1, 1, 0, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 } };
        	g.color(0, m, n, colors, graph);
        	System.out.println(Arrays.toString(colors));
	}
}