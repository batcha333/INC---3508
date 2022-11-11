import java.util.*;
public class PriorityQueueTasks
{
	//PriorityQueue
	static String[] arr = {"red","black","greeen","blue"};
	static PriorityQueue<String> queue = new PriorityQueue<>(Arrays.asList(arr));
	
	//1. Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
	void addElements(PriorityQueue<String> queue)
	{
		queue.add("white");
		queue.add("yellow");
		queue.add("green");
		System.out.println("Queue : "+queue);
	}

	//2. Write a Java program to iterate through all elements in priority queue.	
	void iterate(PriorityQueue<String> queue)
	{
		Iterator<String> iter = queue.iterator();
		System.out.println("Queue Elements: ");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

	//3. Write a Java program to add all the elements of a priority queue to another priority queue.
	void addQueue(PriorityQueue<String> queue)
	{
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(arr));
		queue1.addAll(queue);
		System.out.println("Queue : "+queue1);
	}

	
	//4. Write a Java program to insert a given element into a priority queue.
	void insertElement(String element)
	{
		queue.add(element);
		System.out.println("New Queue : "+queue);
	}

			
	//5. Write a Java program to remove all the elements from a priority queue.
	void removeAll(PriorityQueue<String> queue)
	{
		System.out.println("Queue : "+queue);
		queue.clear();
		System.out.println("New Queue : "+queue);
	}

	//6. Write a Java program to count the number of elements in a priority queue.
	int queueLength(PriorityQueue<String> queue)
	{
		return queue.size();
	}
	
	//7. Write a Java program to compare two priority queues.
	boolean compareTwo(PriorityQueue<String> queue,PriorityQueue<String> queue2)
	{
		System.out.println("Queue2 : "+queue2);
		return queue.equals(queue2);
	}

	//8. Write a Java program to retrieve the first element of the priority queue.
	String firstElement(PriorityQueue<String> queue)
	{
		return queue.peek();
	}	
	
	//9. Write a Java program to retrieve and remove the first element. 
	void popFirst(PriorityQueue<String> queue)
	{
		System.out.println("Element : "+queue.poll());
		System.out.println("New Queue : "+queue);
	}

	void arrayView(PriorityQueue<String> queue)
	{
		ArrayList<String> list = new ArrayList<>(queue);
		System.out.println("Queue -> List : "+list);
	}

	public static void main(String[] args)
	{
		PriorityQueueTasks pq = new PriorityQueueTasks();
		System.out.println("Original Queue : "+queue);
		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(arr));
		queue2.add("violet");		

		//pq.addElements(queue);
		//pq.iterate(queue);
		//pq.addQueue(queue);
		//pq.insertElement("omega");
		//pq.removeAll(queue2);
		//System.out.println("Queue Length : "+pq.queueLength(queue));
		//System.out.println("Queue comaprison : "+pq.compareTwo(queue,queue2));
		//System.out.println("First Element : "+pq.firstElement(queue));
		//pq.popFirst(queue);
		pq.arrayView(queue);

//10. Write a Java program to convert a priority queue to an array containing all of the elements of the
	}
}