package array;

import java.util.PriorityQueue;

public class KthLargest {

	public static void main(String[] args) {
//		int[] a = {10,30,60,40,30,50};
//		System.out.println(printKthLargest(a,4));
		
		int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(kthSmallest(matrix,8));
	}
	
	public static int printKthLargest(int[] arr, int k) {
		int n = arr.length;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for(int i = k; i < n; i++) {
			if(pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

	public static int kthSmallest(int[][] arr, int k) {
		
		if(arr == null || arr.length == 0 || arr[0].length == 0) return -1;     
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		int low = arr[0][0], high = arr[rows-1][cols-1];
		
		while(low < high) {
			int mid = low + (high - low) / 2;
			
			int count = count(arr,rows,cols,k);
			
			if(count < k) low = mid + 1;
			else high = mid;
		}
		
		return low;
	}
	
	public static int count(int[][] arr, int m, int n, int mid) {
		int count = 0;
		int j = n - 1;
		for(int i = 0; i < m; i++) {
			while(j >= 0 && arr[i][j] > mid) j--;
            count += j + 1;
		}
		
		return count;
	}

}
