package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] a = {4,1,3,5,1,2,3,2,1,1,5};
//		findMax1(a,3);
		for(int e : findMax2(a,3)) {
			System.out.print(e + " ");
		}
	}
	
	public static void findMax1(int[] arr, int k) {   //TC: O(n*k)  SC: O(1)
		int j, max;
		for(int i = 0; i <= arr.length- k; i++) {
			max = arr[i];
			for(j = 1; j < k; j++) {
				max = Math.max(arr[i+j],max);
			}
			System.out.print(max + " ");
		}
	}
	
	public static ArrayList<Integer> findMax2(int[] arr, int k){   //TC:O(n*log(k))  SC:O(k)
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			q.add(arr[i]);
		}
		res.add(q.peek());
		q.remove(arr[0]);
		for(int i = k; i < arr.length; i++) {
			q.add(arr[i]);
			res.add(q.peek());
			q.remove(arr[i-k+1]);
		}
		return res;
	}
	
	//findMax3(int[] arr,int k)  //TC:O(n)  SC:o(k)

}
