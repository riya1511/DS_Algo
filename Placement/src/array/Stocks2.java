package array;

public class Stocks2 {

	public static void main(String[] args) {
		int[] a = {5,2,6,1,4,7,3,6};
//		int[] a = {5,2,7,3,6,1,2,4};
		System.out.println(maxProfit2(a));
	}
	
	public static int maxProfit2(int[] arr) {
		int profit = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				profit = profit + (arr[i] - arr[i-1]);
			}
		}
		return profit;
	}

}
