import java.util.*;
public class ArrayListTasks
{
	static ArrayList<String> list = new ArrayList<>();
	static ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(11,12,13,14,15));
	static ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	
	//1.Write a Java program to create a new array list, add some colors (string) and print out the collection
	void printColors()
	{	
		list.add("Red");list.add("Black");list.add("Blue");
		System.out.println("List : "+list);
		list.clear();
	}
	
	//2.Write a Java program to iterate through all elements in a array list
	void iterateList()
	{
		list.add("1");list.add("2");
		System.out.println("List elements : ");
		for(String i : list)
		{
			System.out.println(i+" ");
		}
		list.clear();
	}

	//3.Write a Java program to insert an element into the array list at the first position.
	void insertElement(String f)
	{
		list.add("hi");list.add("hello");list.add(0,f);
		System.out.println(list);
		list.clear();
	}	

	//4.Write a Java program to retrieve an element (at a specified index) from a given array list.
	void retrieveElement(int index)
	{
		list1.add(1);
		list1.add(2);
		System.out.println("Retrieved element : "+list1.get(index));
		list1.clear();
	}
	
	//5.Write a Java program to update specific array element by given element.
	void updateElement(int index,int element)
	{
		list1.add(5);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		list1.set(index,element);
		System.out.println("List elements : "+list1);
		list1.clear();
	}	
	
	//6.Write a Java program to remove the third element from a array list.
	void removeElement(int index)
	{
		list1.add(5);list1.add(3);list1.add(1);list1.add(2);
		list1.remove(index);
		System.out.println("List elements : "+list1);
		list1.clear();
	}

	//7.Write a Java program to search an element in a array list.
	void searchElement(int element)
	{
		list1.add(5);list1.add(3);list1.add(1);
		if(list1.indexOf(element)>=0)
			System.out.println("Element is found at Index : "+list1.indexOf(element));
		else
			System.out.println("Not Found");
		list1.clear();
	}
	
	//8.Write a Java program to sort a given array list.
	void sortList()
	{
		System.out.println("before sort : "+list1);
		Collections.sort(list1);
		System.out.println("After sort : "+list1);
		list1.clear();
	}

	//9.Write a Java program to copy one array list into another	
	void copyList()
	{
		list1.add(5);list1.add(3);list1.add(1);
		ArrayList<Integer> list2 = list1;
		System.out.println("Copy List : "+list2);
		list1.clear();
	}


	//10.Write a Java program to shuffle elements in a array list.
	void shuffleList()
	{
		Collections.shuffle(list2);
		System.out.println("Shuffle : "+list2);
	}

	//11.Write a Java program to reverse elements in a array list.
	void reverseList()
	{
		Collections.reverse(list2);
		System.out.println("Reverse : "+list2);
	}

	//12. Write a Java program to extract a portion of a array list.
	void subList(int start,int end)
	{
		List<Integer> sList = list2.subList(start,end);
		System.out.println("Sublist : "+sList);	
	}
	
	//13. Write a Java program to compare two array lists.
	void compareLists()
	{
		list1.add(2);list1.add(3);list1.add(4);
		System.out.println("Comparison : "+list2.equals(list1));
	}
	
	//14. Write a Java program of swap two elements in an array list.
	void swap2Elements(int a,int b)
	{
		Collections.swap(list2,a,b);
		System.out.println("Swap : "+list2);
	}
	
	//15.Write a Java program to join two array lists.
	void joinLists()
	{
		list2.addAll(list1);
		System.out.println("Join 2 lists : "+list2);
	}
	
	//16. Write a Java program to clone an array list to another array list.
	void cloneList()
	{
		ArrayList cList = (ArrayList)list2.clone();
		System.out.println("Clone list : "+cList);
	}

	//17. Write a Java program to empty an array list. 
	void emptyList()
	{
		list1.clear();
		System.out.print("empty : "+list1);
	}
	
	//18. Write a Java program to test an array list is empty or not.
	void isEmptyList()
	{
		System.out.println("List1 : "+list1);
		System.out.println("List1 Empty or not : "+list1.isEmpty());
	}	

	//19. Write a Java program to trim the capacity of an array list the current list size.
	void trimListSize()
	{
		list1.trimToSize();
		System.out.println("List trimmed");
	}	

	//20. Write a Java program to increase the size of an array list.
	void increaseListSize(int n)
	{
		list2.ensureCapacity(n);
		System.out.println("List capacity increased to: "+n);
	}

	//21.Write a Java program to replace the second element of a ArrayList with the specified element.
	void replaceElement(int n)
	{	
		System.out.println("before : "+list2);
		list2.set(1,n);
		System.out.println("After : "+list2);
	}
	
	//22. Write a Java program to print all the elements of a ArrayList using the position of the elements
	void getAllElements()
	{	
		System.out.println("Array elements : ");
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+" ");
		}
	}

	public static void main(String args[])
	{
		ArrayListTasks a = new ArrayListTasks();
		//a.printColors();
		//a.iterateList();		
		//a.insertElement("zero");
		//a.retrieveElement(1);
		//a.updateElement(2,10);
		//a.removeElement(2);
		//a.searchElement(4);
		//a.sortList();
		//a.copyList();
		//a.shuffleList();
		//a.reverseList();
		//a.subList(1,5);
		//a.compareLists();
		//a.swap2Elements(4,8);
		//a.joinLists();
		//a.cloneList();	
		//a.emptyList();
		//a.isEmptyList();
		//a.trimListSize();
		//a.increaseListSize(20);	
		//a.replaceElement(40);
		a.getAllElements();
	}

}