package queue;

import java.util.ArrayDeque;
import java.util.Queue;

class NewNode{
	NewNode next;
	NewNode down;
	int value;
	NewNode(int value){
		this.value = value;
	}
}

public class MultilevelLL {

	public static void main(String[] args) {
		NewNode head = new NewNode(1);
		head.next = new NewNode(2);
		head.down = new NewNode(6);
		head.next.next = new NewNode(3);
		head.next.next.next = new NewNode(4);
		head.next.next.next.next = new NewNode(5);
		head.next.next.next.down = new NewNode(9);
		head.next.next.next.next.next = null;
		head.down.next = new NewNode(7);
		head.down.next.next = new NewNode(8);
		head.down.next.down = new NewNode(11);
		head.down.next.next.next = null;
		head.down.next.next.down = new NewNode(12);
		head.down.next.down.next = null;
		head.down.next.next.down.next = null;
		head.down.next.next.down.down = new NewNode(15);
		head.next.next.next.down.next = new NewNode(10);
		head.next.next.next.down.down = new NewNode(13);
		head.next.next.next.down.down.next = new NewNode(14);
		head.next.next.next.down.down.down = new NewNode(16);
		head.next.next.next.down.down.down.next = new NewNode(17);
//		System.out.println("***********Without optimization*************");
//		flattenLL(head);
		System.out.println("***********With optimization*************");
		flattenLLOpti(head);
	}
	
	public static void flattenLL(NewNode head) {   //TC: O(n)
		Queue<NewNode> q = new ArrayDeque<>();     //SC: O(n)
		NewNode curr = head;
		while(curr!=null) {
			if(curr.next == null) {
				curr.next = q.poll();
			}
			if(curr.down != null) {
				q.offer(curr.down);
			}
			curr = curr.next;
		}
		printList(head);
	}
	
	public static void flattenLLOpti(NewNode head) {
		if(head == null) return;
		NewNode temp = null;
		NewNode tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		NewNode curr = head; 
		while(curr != tail) {
			if(curr.down != null) {
				tail.next = curr.down;
				temp = curr.down;
				while(temp.next != null) {
					temp = temp.next;
				}
				tail = temp;
			}
			curr = curr.next;
		}
		printList(head);
	}
	
	public static void printList(NewNode head) {
		NewNode curr = head;
		while(curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.next;
		}
	}

}
