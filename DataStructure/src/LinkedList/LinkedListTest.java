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
		
		
		/*Node t;
		t = list.head;
		while(true){
			System.out.println(t.data);
			if(t.next != null)
				t = t.next;
			else
				break;
		}*/
	}
	
	@Test
	public void TestInsertAtTail()
	{
		AddLinkedList list1 = new AddLinkedList();
		list1.add(new Node(23));
		list1.add(new Node(43));
		list1.add(new Node(55));
		list1.InsertAtTail(list1.head, 56);
		
		System.out.println("done");
		
		/*Node t;
		t = list1.head;
		while(true){
			System.out.println(t.data);
			if(t.next != null)
				t = t.next;
			else
				break;
		}*/
	
	}
	
	@Test
	public void TestInsertAtHead(){
		AddLinkedList list2 = new AddLinkedList();
		list2.add(new Node(54));
		list2.add(new Node(25));
		list2.add(new Node(100));
		list2.InsertAtHead(list2.head, 45);
		list2.InsertAtHead(list2.head, 66);
		System.out.println("++++++++++++++");
		System.out.println(list2.head.data);
		Node t;
		t = list2.head;
		while(true){
			System.out.println(t.data);
			if(t.next != null)
				t = t.next;
			else
				break;
		}
	}

}
