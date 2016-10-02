package LinkedList;

/**
 * Name  	: Amit Saroj
 * Topic 	: LinkedList
 * Subtopic : DeleteANodeAtNth.java
 */
public interface DeleteANodeAtNth {
	
	default Node DeleteAtNth(Node head, int position) {
		  
		    Node temp = new Node();
		    temp = head;
		    if(position == 0){
		        head = head.next;
		    }
		    else{
		        while(--position > 0){
		            temp = temp.next;
		        }
		        temp.next = temp.next.next;
		    }
		    return head;
	}

}
