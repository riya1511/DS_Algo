package queue;

class Node{
	Node next;
	int value;
	Node(int value){
		this.value = value;
	}
}

class LLQueue{
	
	static Node front,rear;
	
	public void enqueue(int data) {
		Node temp = new Node(data);
		if(front == null) {
			front = rear = temp;
		}
		rear.next = temp;
		rear = temp;
	}
	
	public int dequeue() {
		if(front == null) return -1;
		int res = front.value;
		front = front.next;
		return res;
	}
}

public class UsingLinkedList {
	
	public static void main(String[] args) {
		LLQueue que = new LLQueue();
		que.enqueue(4);
		que.enqueue(1);
		System.out.println(que.dequeue());
	}

}
