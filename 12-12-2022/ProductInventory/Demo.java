import java.io.*;
import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		SerializationIdx si = new SerializationIdx();
		ArrayList<Integer> list = si.doDeSerializationforId();
		int n = 100;
		si.doSerializationforId(n);
	}
}