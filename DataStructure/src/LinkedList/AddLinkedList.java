package LinkedList;

public class AddLinkedList implements PrintLinkedList, InsertNodeAtHead, InsertNodeAtTail, InsertAtNthNode, DeleteANodeAtNth, PrintReverseList{
	

	Node head;
	Node tail;
	
	
	public void add(Node node)
	{
		//Senario 1 if LinkedList is Empty
		if (head == null)
		{
			tail = node;
			head = node;
		}
		//Senario 2 if LinkedList is NonEmpty
		else
		{
			tail.next = node;
			tail = node;
		}
	}
	
}
