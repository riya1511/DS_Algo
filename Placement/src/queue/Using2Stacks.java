package queue;

import java.util.Stack;

class StackQueue{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push(int data) {   //O(1)
		s1.push(data); 
	}
	
	public int pop() {   //O(n)
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans = s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
}

public class Using2Stacks {

	public static void main(String[] args) {
		StackQueue q = new StackQueue();
		q.push(19);
		q.push(34);
		System.out.println(q.pop());
		System.out.println(q.pop());
	}

}
