package linkedLists;
//class Node{
//	Node next;
//	int value;
//	Node(int value){
//		this.value = value;
//	}
//}


public class Reverse {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(15);
		head.next.next.next = new Node(4);
		Node newHead = reverseLLRecu(head);
		System.out.println(newHead.value);
	}
	
	public static Node reverseLLIte(Node head) {
		if(head == null) return null;
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
		return head;
	}
	
	public static Node reverseLLRecu(Node head) {
		if(head.next == null || head == null) return head;
		Node newHead = reverseLLRecu(head.next);
		Node headNext = head.next;
		headNext.next = head;
		head.next = null;
		return newHead;
	}

}
