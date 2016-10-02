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
	
	/*@Test
	public void TestInsertAtTail()
	{
		AddLinkedList list1 = new AddLinkedList();
		list1.add(new Node(23));
		list1.add(new Node(43));
		list1.add(new Node(55));
		list1.InsertAtTail(list1.head, 56);
		
		System.out.println("done");
		
		Node t;
		t = list1.head;
		while(true){
			System.out.println(t.data);
			if(t.next != null)
				t = t.next;
			else
				break;
		}
	
	}*/
	
	@Test
	public void TestInsertAtHead(){
		AddLinkedList list2 = new AddLinkedList();
		list2.add(new Node(54));
		list2.add(new Node(25));
		list2.add(new Node(100));
		list2.InsertAtHead(list2.head, 42);
		list2.InsertAtHead(list2.head, 12121);
		
		System.out.println(list2.head.data);
		
		Node t = new Node();
		t = list2.head;
		while(true){
			System.out.println(t.data);
			if(t.next!=null)
				t = t.next;
			else
				break;
		}
	}
	
	/*@Test
	public void TestInsertAtNthNode(){
		AddLinkedList list3 = new AddLinkedList();
		list3.add(new Node(104));
		list3.add(new Node(245));
		list3.add(new Node(1465));
		list3.add(new Node(21));
		list3.InsertNth(list3.head, 45,1);
		list3.InsertNth(list3.head, 66,3);
		
		Node t;
		t = list3.head;
		while(true){
			System.out.println(t.data);
			if(t.next != null)
				t = t.next;
			else
				break;
		}
	}*/
	
	@Test
	public void DeleteAnodeAtNth(){
		AddLinkedList list4 = new AddLinkedList();
		list4.add(new Node(104));
		list4.add(new Node(245));
		list4.add(new Node(1465));
		list4.add(new Node(21));
		
		System.out.println();
		System.out.println("LinkedList before deleting a Node.");
		list4.Print(list4.head);
		System.out.println();
		
		System.out.println("Deleting a Node...");
		list4.DeleteAtNth(list4.head, 1);
		System.out.println();
		System.out.println("LinkedList after deleting a Node");
		list4.Print(list4.head);
	}
	
	@Test
	public void ReversePrint(){
		AddLinkedList list5 = new AddLinkedList();
		list5.add(new Node(1));
		list5.add(new Node(2));
		list5.add(new Node(3));
		list5.add(new Node(4));
		list5.add(new Node(5));
		list5.add(new Node(6));
		list5.add(new Node(7));
		list5.add(new Node(8));
		list5.add(new Node(9));
		list5.add(new Node(10));
		
		System.out.println("Before Reversing the list.");
		list5.Print(list5.head);
		System.out.println("");
		
		System.out.println("After reversing the list");
		list5.PrintReverse(list5.head);
		
	}
	

}
