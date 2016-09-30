package LinkedList;
/**
 * Name  	: Amit Saroj
 * Topic 	: LinkedList
 * Subtopic : InsertNodeAtHead.java
 */
public interface InsertNodeAtHead {
	
	default public Node InsertAtHead(Node head, int data)
	{
		Node newNode = new Node();
		
		if(head == null){
			head = newNode;
			newNode.data = data;
			head.next = null;
		}
		else{
			newNode.data = data;
			newNode.next = head;
			head = newNode;
		}
		return head;
		
	}
}
