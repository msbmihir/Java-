package linkedList;

public class LinkedList 
{
	Node head;
	
	public void insert(int data)  // insert adds the data to the end.
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
//	public void insertAtStart(int data)
//	{
//		Node node = new Node();
//		node.data = data;
//		node.next = null;
//	}
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
