package LinkedList;

public interface ReverseTheList {
	default public Node Reverse(Node head){
		    
		    Node prev = new Node();
		    Node current = new Node();
		    Node next = new Node();
		    
		    prev = null;
		    current = head;
		    
		    while(current != null){
		         next = current.next;
		         current.next = prev;
		         prev = current;
		         current = next;
		    }
		    head = prev;
		    return head;
	}

}
