package array;

public class KadaneAlgo {

	public static void main(String[] args) {
		int[] a = {-5,4,6,-3,4,1};
		System.out.println("Maximum sum of continous sub-array is: " + maxSumSubArray(a));
	}
	
	public static int maxSumSubArray(int arr[]) {
		int max_sum = Integer.MIN_VALUE;
		int curr_sum = 0;
		for(int i = 0; i < arr.length; i++) {
			curr_sum = curr_sum + arr[i];
			if(curr_sum > max_sum) {
				max_sum = curr_sum;
			}
			if(curr_sum < 0) {
				curr_sum = 0;
			}
		}
		return max_sum;
	}

}
