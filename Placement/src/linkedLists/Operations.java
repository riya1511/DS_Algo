package linkedLists;

class Node{
	Node next;
	int value;
	Node(int value){
		this.value = value;
	}
}

//to make this node generic
/*
 * class Node<T> {
	Node next;
	T value;
	Node(T value){
		this.value = value;
	}
	//Node<Integer>,Node<String>,etc.....
}
 */

public class Operations {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(4);
		head.next.next = new Node(78);
		head.next.next.next = new Node(88);
//		printList(head);
//		deleteNode(head,2);
		insertNode(head,99,2);
	}
	
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}
	
	public static void insertNode(Node head, int val, int pos) {
		Node newNode = new Node(val);
		if(pos == 0) {
			Node temp = head;
			head = newNode;
			head.next = temp;
			System.out.println("List after insertion is");
			printList(head);
			return;
		}
		else {
			Node prev = head;
			for(int i = 0; i < pos-1; i++) {
				prev = prev.next;
			}
			newNode.next = prev.next;
			prev.next = newNode;
			System.out.println("List after insertion is");
			printList(head);
		}
	}
	
	public static void deleteNode(Node head, int pos) {
		Node prev = head;
//		System.out.println(prev.value);
		if(pos == 0) {
			head = prev.next;
//			System.out.println(head.value);
			System.out.println("List after deletion is");
			printList(head);
			return;
		}
		
		for(int i = 0; i < pos-1; i++) {
			prev = prev.next;
		}
		prev.next = prev.next.next;
		System.out.println("List after deletion is");
		printList(head);
	}

}
