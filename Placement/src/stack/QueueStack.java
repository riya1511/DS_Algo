package stack;

import java.util.ArrayDeque;
import java.util.Queue;

class Using2Queue{
	Queue<Integer> q1 = new ArrayDeque<>();
	Queue<Integer> q2 = new ArrayDeque<>();
	
	public void push(int data) {
		while(!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		q1.offer(data);
		while(!q2.isEmpty()) {
			q1.offer(q2.poll());
		}
	}
	
	public int pop() {
		return q1.poll();
	}
}

public class QueueStack {

	public static void main(String[] args) {
		Using2Queue st = new Using2Queue();
		st.push(19);
		st.push(34);
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
