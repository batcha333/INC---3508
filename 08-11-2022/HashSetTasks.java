import java.util.*;
public class HashSetTasks
{
	//static HashSet<Integer> set = new HashSet(Arrays.asList(array)); 
	static Integer array[] = {10,9,8,7,6,5,4,3,2,1,31,12,11,0};
	static Set<Integer> set = new HashSet<>(Arrays.asList(array));

	void print(Set<Integer> set)
	{
		System.out.println("New Set \t: "+set);
	}

	//1. Write a Java program to append the specified element to the end of a hash set. 
	void appendElement(int element)
	{
		set.add(element);
		print(set);
	}

	//2. Write a Java program to iterate through all elements in a hash list.
	void iterateSet(Set<Integer> set)
	{
		Iterator<Integer> iter = set.iterator();		
		System.out.println("Set elements using iterator : ");
		while(iter.hasNext())	
		{
			int value = iter.next();
			System.out.println(value);
		}
	}

	//3. Write a Java program to get the number of elements in a hash set. 
	int setLength()
	{
		return set.size();
	}
	
	//4. Write a Java program to empty an hash set.
	void setClear()
	{
		set.clear();
		print(set);
	}

	//5. Write a Java program to test a hash set is empty or not. 
	boolean emptySet()
	{
		return set.isEmpty();
	}

	//6. Write a Java program to clone a hash set to another hash set.
	void cloneSet()
	{
		Set<Integer> clone = new HashSet<>();
		clone.addAll(set);
		print(clone);
	}
	
	//8. Write a Java program to convert a hash set to a tree set.
	void treeSetView(Set<Integer> set)
	{
		Set<Integer> tree = new TreeSet<>(set);
		Iterator<Integer> iter = tree.iterator();
		System.out.println("TreeSet \t: "+tree);
		System.out.println("Iterated Tree elements using iterator : ");
		while(iter.hasNext())	
		{
			int value = iter.next();
			System.out.println(value);
		}
	}

	//9. Write a Java program to convert a hash set to a List/ArrayList. 
	void listView(Set<Integer> set)
	{
		List<Integer> list = new ArrayList<>(set);
		list.add(1);								//list can have duplicates
		Iterator<Integer> iter = list.iterator();
		System.out.println("ArrayList \t: "+list);
		System.out.println("Iterated list elements using iterator : ");
		while(iter.hasNext())	
		{
			int value = iter.next();
			System.out.println(value);
		}
	}

	//10. Write a Java program to compare two hash set.
	boolean compareSets(Set<Integer> set,Set<Integer> set2)
	{
		print(set2);
		return set.equals(set2);
	}

	//11. Write a Java program to compare two sets and retain elements which are same on both sets.
	void unionOfSets(Set<Integer> set,Set<Integer> set2)
	{
		print(set2);
		set2.retainAll(set);
		System.out.println("Union \t\t: "+set2);		
	}

	//12. Write a Java program to remove all of the elements from a hash set
	void clearSet()
	{
		set.clear();
		print(set);
	}
	public static void main(String args[])
	{
		HashSetTasks hs = new HashSetTasks();
		set.add(1);								//set can't have duplicates
		Integer array1[] = {15,14,13,12,11};
		Set<Integer> set2 = new HashSet<>(Arrays.asList(array1));
		System.out.println("Original Set \t: "+set);
		//hs.appendElement(13);
		//hs.iterateSet(set);
		//System.out.println("Number of elements in set : "+hs.setLength());
		//hs.setClear();
		//System.out.print("Set is empty \t: "+hs.emptySet());
		//hs.cloneSet();
		//hs.treeSetView(set);
		//hs.listView(set);
		//System.out.println("Comparison bw 2 Sets\t: "+hs.compareSets(set,set2));
		//hs.unionOfSets(set,set2);						//retainAll method -> union
		hs.clearSet();
	}
}