import java.util.Scanner;

class ListNode
{
	int value;
	ListNode next;
	public ListNode(int value)
	{
		this.value = value;
		this.next = null;
	}
}

public class ListNodeMethods
{
	ListNode head;
	ListNode insertAtFirst(int k, ListNode head)
	{
		ListNode temp = new ListNode(k);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
		return head;
	}

	ListNode insertAtLast(int k,ListNode head)
	{
		ListNode temp = new ListNode(k);
		ListNode tail = head;
		if(tail==null)
		{
			head = temp;
		}
		else
		{
			while(tail.next!=null)
				tail = tail.next;
			tail.next = temp;
		}
		return head;
	}

	ListNode insertAtSpecific(ListNode head,int value,int index)
	{
		ListNode temp = new ListNode(value);
		if(index==1){
			temp.next = head;
			head = temp;	
		}
		else{
			ListNode temp1 = head;
			for(int i=1;i<index && temp1.next!=null;i++)
			{
				temp1 = temp1.next;
			}
			temp.next = temp1.next;
			temp1.next = temp;
		}
		return head;
	}	

	void display(ListNode head)
	{
		ListNode temp = head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		ListNodeMethods lnm = new ListNodeMethods();
		lnm.head = null;
		Scanner in = new Scanner(System.in);
		System.out.println("..........List Node Methods..........");
		do
		{
			System.out.println("1.Insert at FirstPos\n2.Insert at LastPos\n3.Insert at SpecificPos\n7.Display\n8.Exit\nEnter your choice : ");
			int choice = in.nextInt();
			switch(choice)
			{
				case 1 : 
					System.out.print("Enter a value : ");
					int k = in.nextInt();
					lnm.head = lnm.insertAtFirst(k,lnm.head);
					break;
				case 2 : 
					System.out.print("Enter a value : ");
					int l = in.nextInt();
					lnm.head = lnm.insertAtLast(l,lnm.head);
					break;	
				case 3 : 
					System.out.print("Enter value and index : ");
					int m = in.nextInt(),index = in.nextInt();
					lnm.head = lnm.insertAtSpecific(lnm.head,m,index);
					break;
				case 7 : 
					lnm.display(lnm.head);
					break;
				case 8 : 
					System.out.println("Thank you");
					System.exit(0);
				default : System.out.println("Wrong choice!");break;
			}
			System.out.println("If u want to continue, press 1 : ");
		}
		while(in.nextInt() == 1);
		//in.close();
	}
}