

package LinkedList;

/**
 * Name  	: Amit Saroj
 * Topic 	: LinkedList
 * Subtopic : InsertNodeAtTail.java
 */

public class InsertNodeAtTail {
	public Node InsertAtTail(Node head, int data)
	{   // t node for traversing to the end of the linkedlist.
		Node t = new Node();
		// newNode to add new node to tail of the LinkedList.
		Node newNode = new Node();
		
		t = head;
		while(t.next != null){				// traversing part, stop to the tail node.
			t = t.next;
		}
		
		t.next = newNode;					// Adding New Node to the tail.
		newNode.data = data;
		newNode.next = null;
		return head;
		
	}
}
