package array;

import java.util.PriorityQueue;

public class ConnectWithMinCost {

	public static void main(String[] args) {
		int[] ropes_len = {2,5,4,8,6,9};
		System.out.println(minCost(ropes_len));
	}
	
	public static int minCost(int[] arr) {                 //O(n*log(n))
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int ans = 0;
		while(pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();
			int sum = first + second;
			ans += sum;
			pq.add(sum);
		}
		return ans;
	}

}
