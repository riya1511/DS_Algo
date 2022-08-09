package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UsingCollection {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		//Queue<Integer> que = new ArrayDeque<>();   //preferable as no chaching
		
		//functions that don't throw exception                   //functions that throw exception
		que.offer(10);   //add                                   //que.add()
		que.offer(20);
		que.offer(30);
		que.poll();   //deletes first element                    //que.remove()
		que.peek();   //return first element                     //que.element()
		que.size();
		que.isEmpty();
	}

}
