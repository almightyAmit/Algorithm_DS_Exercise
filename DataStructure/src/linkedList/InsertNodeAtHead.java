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
		newNode.data = data;
		
		if(head == null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
			head.data = newNode.data;
		}
		return head;
		
	}
}
