package LinkedList;

public interface InsertAtNthNode {
	default Node InsertNth(Node head, int data, int position) {
		   // This is a "method-only" submission. 
		    // You only need to complete this method.
		    Node cur = new Node();
		    Node newNode = new Node();
		    
		    cur = head;
		    
		    if(position == 0){
		        newNode.next = head;
		        newNode.data = data;
		        head = newNode;
		    }
		    else
		    {
		        while(--position > 0)
		        {
		            cur = cur.next;
		            
		        }
		        newNode.next = cur.next;
		        cur.next = newNode;
		        newNode.data = data;
		    }
		    
		    return head;
	}  

}
