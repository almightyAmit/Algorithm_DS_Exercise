package LinkedList;

public class AddLinkedList extends InsertNodeAtTail {
	

	Node head;
	Node tail;
	
	public void add(Node node)
	{
		//Senario 1 if LinkedList is Empty
		if (head == null)
		{
			head = node;
			tail = node;
		}
		//Senario 2 if LinkedList is NonEmpty
		else
		{
			tail.next = node;
			tail = node;
		}
	}
}
