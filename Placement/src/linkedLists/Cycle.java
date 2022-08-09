package linkedLists;

public class Cycle {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = head.next.next;
		
		if(detectCycle(head) != null) {
			System.out.println("Cycle is present");
			System.out.println("The start of cycle is from node " + startCycle(head).value);
		}else {
			System.out.println("Cycle is not present");
		}
	}
	
	public static Node detectCycle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) return slow;
		}
		return null;
	}
	
	public static Node startCycle(Node head) {
		Node meet = detectCycle(head);
		Node start = head;
		while(start != meet) {
			meet = meet.next;
			start = start.next;
		}
		return start;
	}

}
