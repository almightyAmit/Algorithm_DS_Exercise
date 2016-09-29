package LinkedList;

import org.junit.Test;

public class LinkedListTest {
	
	@Test 
	public void Test()
	{
		AddLinkedList list = new AddLinkedList();
		list.add(new Node(23));
		list.add(new Node(43));
		list.add(new Node(55));
		list.add(new Node(16));
		list.add(new Node(124));
		list.add(new Node(5));
		list.add(new Node(65));
		list.add(new Node(85));
		
		System.out.println("done");
	}

}
