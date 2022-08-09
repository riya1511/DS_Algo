package stack;

public class MaxStack {
	
	class Node{
		Node next;
		int value;
		int max;
		Node(int value, int max){
			this.value = value;
			this.max = max;
			next = null;	
		}
	}
	
	public static Node head;
	
	public void push(int val) {
		if(null==head){
            head = new Node(val,val);
        }else{
            Node n = new Node(val, Math.max(val,head.max));
            n.next=head;
            head=n;
        }
	}
	
	public void pop() {
		if(head != null)
			head = head.next;
	}
	
	public int top() {
		if(head != null)
			return head.value;
		return -1;
	}
	
	public int max() {
		if(head != null)
			return head.max;
		else return -1;
	}

	public static void main(String[] args) {
		MaxStack maxStack = new MaxStack();
		maxStack.push(5);
		maxStack.push(1);
		maxStack.push(-1);
		System.out.println("Max for first time: " + maxStack.max()) ; // return 5
		maxStack.pop();
		System.out.println(maxStack.top()) ;   // return 1
		System.out.println("Max for second time: " + maxStack.max()); // return 5

	}

}
