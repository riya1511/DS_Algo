package queue;

class CircularAQueue{
	int size;
	int arr[] ;
	int front = -1, rear = -1;
	CircularAQueue(int size){
		this.size = size;
		arr = new int[size];
	}
	
	public void enqueue(int data) {
		if((rear+1)%size == front) System.out.println("Queue is full!");
		if(front == -1) front = 0;
		rear = (rear+1)%size;
		arr[rear] = data;
	}
	
	public int dequeue() {
		if(front == -1) return -1;
		int res = arr[front];
		if(front == rear) front = rear = -1;
		else front = (front+1) % size;
		return res;
	}
}

public class UsingCArray {

	public static void main(String[] args) {
		CircularAQueue que = new CircularAQueue(3);
		que.enqueue(5);
		que.enqueue(1);
		que.enqueue(3);
		System.out.println(que.dequeue());

	}

}
