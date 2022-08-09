package queue;

class ArrayQueue{
	int size;
	int arr[];
	int rear;
	ArrayQueue(int size){
		this.size = size;
		arr = new int[size];
		rear = -1;
	}
	
	public void enqueue(int data) {
		if(rear == size-1) System.out.println("The queue is full!");
		rear++;
		arr[rear] = data;
	}
	
	public int dequeue() {
		if(rear == -1) return -1;
		int res = arr[0];
		for(int i = 0; i < res; i++) {
			arr[i] = arr[i++];
		}
		rear--;
		return res;
	}
}

public class UsingArray {

	public static void main(String[] args) {
		ArrayQueue que = new ArrayQueue(3);
		que.enqueue(4);
		que.enqueue(1);
		que.enqueue(3);
		System.out.println(que.dequeue());
	}

}
