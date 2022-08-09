package linkedLists;
import linkedLists.Node.*;

public class MergeSort {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(4);
		head.next.next = new Node(78);
		head.next.next.next = new Node(88);
		Node res = sort(head);
		while(res != null) {
			System.out.println(res.value);
			res = res.next;
		}
	}
	
	public static Node sort(Node head) {
		if(head == null || head.next == null) return head;
		
		//split LL into two parts
		Node mid = findMid(head);
		
		Node left = head;
		Node right = mid.next;
		mid.next = null;
		
		//recursively sort both the parts
		left = sort(left);
		right = sort(right);
		Node result = merge(left, right);
		
		return result;
	}
	
	public static Node findMid(Node head) {
		Node curr = head;
		Node fast = curr.next, slow = curr;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static Node merge(Node head1, Node head2) {
		if(head1 == null) return head2;
		
		if(head2 == null) return head1;
		
		if(head1.value < head2.value) {
			head1.next = merge(head1.next, head2);
			return head1;
		}else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
	}

}
