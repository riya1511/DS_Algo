package linkedLists;

public class Intersection {

	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(9);
		headA.next.next = new Node(1);
		headA.next.next.next = new Node(2);
		Node headB = new Node(3);
		headB.next = headA.next.next.next;
		System.out.println("The lists intersected at " + intersectedAt(headA,headB).value);
	}
	
	public static Node intersectedAt(Node headA, Node headB) {
		 Node a = headA;
	     Node b = headB;
	     while(a != b){
	    	 if(a.next == null) a = headB;
	         else a = a.next;
	         if(b.next == null) b = headA;
	         else b = b.next;
	     }
	     return a;
	}

}
