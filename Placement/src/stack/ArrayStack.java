package stack;

class MyStack{
	int capacity;
	int top;
	int arr[];
	MyStack(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
	}
	
	public void push(int data) throws Exception{
		if(top == capacity-1) {
			throw new Exception("Stack is already full!");
		}
		top++;
		arr[top] = data;
	}
	
	public int pop() throws Exception{
		if(top == -1) {
			throw new Exception("Stack is empty!");
		}
		int res = arr[top];
		top--;
		return res;
	}
	
	public int peek() throws Exception{
		if(top == -1) {
			throw new Exception("Stack is empty!");
		}
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top+1;
	}
}

public class ArrayStack {

	public static void main(String[] args) {
		MyStack s = new MyStack(5);
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
