package linkedLists;
import linkedLists.Reverse;

public class Palindrome {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
//		head.next.next = new Node(15);
//		head.next.next.next = new Node(20);
//		head.next.next.next.next = new Node(10);
		if(isPalindrome(head)) System.out.println("Linked List is a palindrome");
		else System.out.println("Linked List is not a palindrome");
	}
	
	
	//works only for odd LL
	public static Node midNode(Node head) {
		if(head == null) return head;
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static boolean isPalindrome(Node head) {
		if(head == null) return true;
		Node mid = midNode(head);
		Node last = Reverse.reverseLLIte(mid.next);
		Node curr = head;
		while(last != null) {
			if(curr.value != last.value) return false;
			curr = curr.next;
			last = last.next;
		}
		return true;
	}

}
