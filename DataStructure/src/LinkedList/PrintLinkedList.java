package LinkedList;

public interface PrintLinkedList {
	
	default public void Print(Node head){
		Node trav = new Node();
		trav = head;
		while(true){
			System.out.println(trav.data);
			if(trav.next != null){
				trav = trav.next;
			}
			else
				break;
		}
	}

}
