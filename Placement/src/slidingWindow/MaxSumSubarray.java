package slidingWindow;

public class MaxSumSubarray {

	public static void main(String[] args) {
		int[] a = {2,5,1,8,2,9,1};
		System.out.println(maxSum(a,3));
	}
	
	static int maxSum(int[] arr, int k) {
		int i = 0, j = 0;
		int currSum = 0, maxSum = 0;
		
		while(j < arr.length) {
			currSum += arr[j];
			if((j - i + 1) < k) j++;
			else if((j - i + 1) == k) {
				maxSum = Math.max(maxSum, currSum);
				currSum -= arr[i];
				i++;
				j++;
			}
		}
		
		return maxSum;
	}

}
