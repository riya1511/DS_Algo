package stack;

class Node{
	int value;
	Node next;
	Node(int value){
		this.value = value;
	}
}

class LStack{
	Node head;
	int size;
	LStack(){
		head = null;
		size = 0;
	}
	
	public void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		size++;
		head = temp;
	}
	
	public int pop() throws Exception{
		if(head == null) throw new Exception("Stack is empty");
		int res = head.value;
		head = head.next;
		size--;
		return res;
	}
	
	public int peek()throws Exception{
		if(head == null) throw new Exception("Stack is empty");
		return head.value;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}

public class LLStack {

	public static void main(String[] args) {
		LStack s = new LStack();
		try {
			s.push(34);
			s.push(44);
			s.push(24);
			System.out.println(s.size());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
