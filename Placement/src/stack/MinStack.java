package stack;

public class MinStack {
	
	 class Node{
	        Node next;
	        int min;
	        int value;
	        Node(int value, int min, Node next){
	            this.min = min;
	            this.value = value;
	            this.next = next;
	        }
	    }
	    public Node head;
	    
	    public MinStack() {
	        
	    }
	    
	    public void push(int val) {
	        if(head == null) head = new Node(val,val,null);
	        else head = new Node(val,Math.min(val,head.min),head);
	    }
	    
	    public void pop() {
	        head = head.next;
	    }
	    
	    public int top() {
	        return head.value;
	    }
	    
	    public int getMin() {
	        return head.min;
	    }

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(5);
		minStack.push(0);
		minStack.push(-1);
		System.out.println("Min for first time: " + minStack.getMin()) ; // return -1
		minStack.pop();
		System.out.println(minStack.top()) ;   // return 0
		System.out.println("Min for second time: " + minStack.getMin()); // return 0

	}

}
