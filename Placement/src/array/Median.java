package array;

import java.util.Collections;
import java.util.PriorityQueue;

public class Median {

	public static void main(String[] args) {
		int[] nums = {3,1,5,4};
		System.out.println(findMedian(nums));
	}
	
	public static double findMedian(int arr[]) {
		int n = arr.length;
		double med = 0;
		PriorityQueue<Integer> pqS = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> pqL = new PriorityQueue<>();
		if(n % 2 == 0) {
			for(int i = 0; i < n/2; i++) {
				pqS.add(arr[i]);
			}
			for(int i = n/2; i < n; i++) {
				pqL.add(arr[i]);
			}
			med = pqS.peek() / 2.0 + pqL.peek() / 2.0;
		}else {
			for(int i = 0; i < n/2+1; i++) {
				pqS.add(arr[i]);
			}
			for(int i = n/2+1; i < n; i++) {
				pqL.add(arr[i]);
			}
			med = pqS.peek();
		}
		return med;
	}

}
