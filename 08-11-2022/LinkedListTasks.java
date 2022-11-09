import java.util.*;
import java.util.Iterator;
public class LinkedListTasks
{
	static Integer arr[] = {1,3,5,7,9,2,4,6,8,0,9};
	static LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(arr));

	//Method to Print Linkedlist 
	void print(LinkedList<Integer> list,String name)
	{

		System.out.println(name+""+"\t: "+list);
	}

	//1.Write a Java program to append the specified element to the end of a linked list.
	void appendElement(int element)
	{
		list.add(element);
		print(list,"newList");
	}
	
	//2. Write a Java program to iterate through all elements in a linked list.
	void iterateList(List<Integer> list)
	{
		Iterator<Integer> iter = list.iterator();
		System.out.println("Iterating Linked List using iterator & for each loop : ");
		System.out.println("Iterator loop :");
		while(iter.hasNext())
		{
			int value = iter.next();
			System.out.print(value+" ");
		}
		System.out.println("\nFor loop :");
		for(int i : list)
		{
			System.out.print(i+" ");
		}
	}
	
	//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
	void iterateFromIndex(int index)
	{	
		ListIterator<Integer> iter = list.listIterator(index);
		System.out.println("Iterating Linked List from specified index ("+index+") : ");
		while(iter.hasNext())
		{
			int value = iter.next();
			System.out.print(value+" ");
		}
	}
	
	//4. Write a Java program to iterate a linked list in reverse order.
	void reverseOrder(LinkedList<Integer> list)
	{
		System.out.println(list);
		Iterator iter = list.descendingIterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
	}

	//5. Write a Java program to insert the specified element at the specified position in the linked list
	void insertElement(int index,int element)
	{
		list.add(index,element);
		print(list,"newList");
	}
	
	//6. Write a Java program to insert elements into the linked list at the first and last position.
	void insertFirstLast(int f,int l)
	{
		list.addFirst(f);
		list.addLast(l);
		print(list,"FirstLast");
	}	

	//7. Write a Java program to insert the specified element at the front of a linked list.
	//8. Write a Java program to insert the specified element at the end of a linked list.
	void offerFirstLast(int f,int l)
	{
		list.offerFirst(f);
		list.offerLast(l);
		print(list,"OfferList");
	}

	//9. Write a Java program to insert some elements at the specified position into a linked list.
	void insertElements(int element,List<Integer> nlist)
	{
		list.addAll(element,nlist);
		print(list,"InsertedList");
	}	

	//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	void occurenceOfElement(LinkedList<Integer> list,int n)
	{
		System.out.println("First : "+list.indexOf(n));
		System.out.println("Last : "+list.lastIndexOf(n));
	}

	//11. Write a Java program to display the elements and their positions in a linked list.
	void positions(LinkedList<Integer> list)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Index : "+i+" ELement : "+list.get(i));
		}
	}

	//12. Write a Java program to remove a specified element from a linked list.
	void removeElement(Object number)
	{
		list.remove(number);
		print(list,"removedNUmber");
	}	

	//13. Write a Java program to remove first and last element from a linked list.
	void removeFirstLast()
	{
		list.removeFirst();
		list.removeLast();
		print(list,"remove : ");
	}

	//14. Write a Java program to remove all the elements from a linked list.
	void removeAll(LinkedList<Integer> list)
	{
		list.clear();
		print(list,"clear");
	}	

	//15. Write a Java program of swap two elements in a linked list. 
	void swapElements(int a,int b)
	{
		Collections.swap(list,a,b);
		print(list,"SwappedList");
	}

	//16. Write a Java program to shuffle the elements in a linked list.
	void shuffleList()
	{
		Collections.shuffle(list);
		print(list,"ShuffledLIst");
	}
	
	//17. Write a Java program to join two linked lists. 
	void joinLists()
	{
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.addAll(list);
		print(list2,"new");
	}

	//18. Write a Java program to clone an linked list to another linked list.
	void cloneList()
	{
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.addAll(list);
		print(list2,"new");		
	}

	//19. Write a Java program to remove and return the first element of a linked list.
	void first1()
	{
		System.out.println("Pop :"+list.pop());
	}
	//20. Write a Java program to retrieve but does not remove, the first element of a linked list.
	void first2()
	{
		System.out.println("First :"+list.getFirst());
	}
	//21. Write a Java program to retrieve but does not remove, the last element of a linked list.
	void last()
	{
		System.out.println("First :"+list.getLast());
	}
	//22. Write a Java program to check if a particular element exists in a linked list.
	boolean exists(int number)
	{
		return list.contains(number);	
	}  
	//23. Write a Java program to convert a linked list to array list.
	void arrayView()
	{
		ArrayList<Integer> list2 = new ArrayList<>(list);
		System.out.print("List : "+list2); 
	}
	//24. Write a Java program to compare two linked lists.
	boolean compareList(LinkedList<Integer> list2)
	{
		return list.equals(list2);
	}
	//25. Write a Java program to test an linked list is empty or not.
	boolean empty()
	{
		return list.isEmpty();	
	} 
	//26. Write a Java program to replace an element in a linked list
	void replace()
	{
		list.set(5,10000);
		print(list,"replace");
	}
	public static void main(String[] args)
	{
		LinkedListTasks ll = new LinkedListTasks();
		ll.print(list,"OriginalList");

		//ll.appendElement(40); 
		//ll.iterateList(list);
		//ll.iterateFromIndex(5);
		//ll.reverseOrder(list);
		//ll.insertElement(2,24);
		//ll.insertFirstLast(100,200);
		//ll.offerFirstLast(300,400);
		LinkedList<Integer> nlist = new LinkedList<>();
		nlist.add(50);
		nlist.add(51);
		//ll.insertElements(3,nlist);
		//ll.occurenceOfElement(list,9);
		//ll.positions(list);
		//ll.removeElement(9);
		//ll.removeFirstLast();	
		//ll.removeAll(nlist);
		//ll.swapElements(2,7);
		//ll.shuffleList();
		//ll.joinLists();
		//ll.cloneLists();
		//ll.first1();
		//ll.first2();
		//ll.last();
		//System.out.println(ll.exists(9));
		//ll.arrayView();
		//System.out.print(ll.compareList(nlist));
		ll.replace();
	}
}