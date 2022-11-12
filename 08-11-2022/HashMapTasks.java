import java.util.*; 
public class HashMapTasks
{
	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	//1. Write a Java program to associate the specified value with the specified key in a HashMap.
	void associateKeyValue(int k,String v)
	{
		map.put(k,v);
		map.put(4,"Four");
		System.out.println("Map : "+map);
	}

	//2. Write a Java program to count the number of key-value (size) mappings in a map. 
	int mapSize()
	{
		return map.size();
	}

	//3. Write a Java program to copy all of the mappings from the specified map to another map.
	void copy(HashMap<Integer,String> dupMap)
	{
		dupMap.putAll(map);
		System.out.println("Map duplicate : "+dupMap);
	}

	//4. Write a Java program to remove all of the mappings from a map. 
	void removeAll()
	{
		map.clear();
		System.out.println("Map : "+map);
	}

	//5. Write a Java program to check whether a map contains key-value mappings (empty) or not
	boolean emptyMap()
	{
		return map.isEmpty();
	}
	
	//6. Write a Java program to get a shallow copy of a HashMap instance.
	void shallowCopy()
	{
		//HashMap<Integer,String> clone = new HashMap<Integer,String>();
		//clone = (HashMap<Integer,String>)map.clone();
		//System.out.println("Clone Copy Map : "+clone);
	}
	
	//7. Write a Java program to test if a map contains a mapping for the specified key.
	boolean keySearch(int key)
	{
		return map.containsKey(key);
	}

	//8. Write a Java program to test if a map contains a mapping for the specified value
	boolean ValueSearch(String value)
	{
		return map.containsValue(value);
	}

	//9. Write a Java program to create a set view of the mappings contained in a map.
	void setView(HashMap<Integer,String> map)
	{
		Set set = map.entrySet();
		System.out.println("Map -> Setview : "+set);
	}
	
	//10. Write a Java program to get the value of a specified key in a map.
	String getValue(int key)
	{
		return map.get(key);	
	}

	//11. Write a Java program to get a set view of the keys contained in this map.
	void getKeySet(HashMap<Integer,String> map)
	{
		Set set = map.keySet();
		System.out.println("Map(keys) -> Setview : "+set);	
	}	

	//12. Write a Java program to get a collection view of the values contained in this map.
	void getValueList(HashMap<Integer,String> map)
	{
		System.out.println("Map(Values) -> Setview : "+map.values());	
	}

	public static void main(String[] args)
	{
		HashMapTasks hm = new HashMapTasks();
		HashMap<Integer,String> dupMap = new HashMap<Integer,String>();
		map.put(101,"Red");
		map.put(102,"Bl4ck");
		map.put(103,"Green");
		map.put(104,"Blu3");
		System.out.println("Original Map : "+map);
		//hm.associateKeyValue(3,"three");
		//System.out.println("HashMap size : "+hm.mapSize());
		//hm.copy(dupMap);
		//hm.removeAll();
		//System.out.println("Empty : "+hm.emptyMap());
		//hm.shallowCopy();
		//System.out.println("Key(102) is present : "+hm.keySearch(102));
		//System.out.println("Value(green) is present : "+hm.ValueSearch("green"));
		//hm.setView(map);
		//System.out.println("Value of specified key(101) : "+hm.getValue(101));
		//hm.getKeySet(map);
		//hm.getValueList(map);
	}
}