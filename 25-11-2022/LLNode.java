public class LLNode
{
	Node head;
	private int size;
	LLNode()
	{
		this.size = 0;
	}
	class Node
	{
		int data;
		Node next;	
		Node(int data)
		{
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void printList()
	{
		if(head==null)
		{
			System.out.print("Empty List");
			return;
		}
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data+"->");
			currNode = currNode.next;	
		}
		System.out.print("Null");
		System.out.println();
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null)
		{
			currNode = currNode.next;	
		}
		currNode.next = newNode;
	}
	
	public void removeFirst()
	{
		if(head==null)
		{
			return;
		}
		head = head.next;
		size--;
		return;
	}

	public void removeLast()
	{
		if(head==null)
		{
			return;
		}
		size--;	
		if(head.next==null)
		{
			head = null;
		}
		Node lastNode = head.next;
		Node secondLast = head;
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public static void main(String[] args)
	{
		LLNode list = new LLNode();
		System.out.println("Adding new nodes at the first");
		list.addFirst(2);
		list.addFirst(1);
		list.printList();
		System.out.println("Length of the list : "+list.size);
		System.out.println("Adding new nodes at the last");
		list.addLast(3);
		list.addLast(4);		
		list.printList();
		System.out.println("Length of the list : "+list.size);
		System.out.println("Removing nodes at the first");
		list.removeFirst();
		list.printList();
		System.out.println("Length of the list : "+list.size);
		System.out.println("Removing new nodes at the last");
		list.removeLast();
		list.printList();
		System.out.println("Length of the list : "+list.size);
	}
}