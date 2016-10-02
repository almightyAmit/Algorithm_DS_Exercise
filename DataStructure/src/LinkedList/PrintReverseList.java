package LinkedList;

public interface PrintReverseList {
	default public void PrintReverse(Node head){
		if (head == null){
			return;
		}
		PrintReverse(head.next);
		System.out.println(head.data);
	}
}
