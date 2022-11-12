import java.util.*;

public class QueueTasks
{
	static Integer[] arr = {10,2,3,4,5,1,0,6};	
	static PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(arr));

	//11. Write a Java program to convert a Priority Queue elements to a Integer representation. 	
	void convertToString()
	{
		
		System.out.println("Queue String : "+queue.toString());
		System.out.println("Queue : "+queue);
	}

	
	//12. Write a Java program to change priorityQueue to maximum priorityqueue. 
	void convertToMaxPriority()
	{	
		PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
		Iterator<Integer> iter = queue.iterator();
		while(iter.hasNext())	
		{
			queue1.add(iter.next());	
		}
		System.out.println("Max Priority Queue : "+queue1);
	}

	public static void main(String[] args)
	{
		QueueTasks q = new QueueTasks();
		q.convertToString();
		q.convertToMaxPriority();
	}
}