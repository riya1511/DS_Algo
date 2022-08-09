package array;

public class Stocks {

	public static void main(String[] args) {
		int[] a = {5,2,6,1,4};
//		int[] a = {3,1,4,8,7,2,5};
		System.out.println(maxProfitAdv(a));

	}
	
	public static int maxProfit(int[] arr) {     //TC = O(n), SC = O(n)
		int aux[] = new int[arr.length];
		int maxSoFar = 0;
		for(int i = arr.length-1; i >= 0; i--) {
			int curr = arr[i];
			if(curr >= maxSoFar) {
				maxSoFar = curr;
			}
			aux[i] = maxSoFar;
		}
		int maxProfit = 0;
		for(int i = 0; i < arr.length; i++) {
			int profit_SoFar = aux[i] - arr[i];
			if(profit_SoFar >= maxProfit) {
				maxProfit = profit_SoFar;
			}
		}
		return maxProfit;
	}
	
	public static int maxProfitAdv(int[] arr) {  //TC = O(n) SC = O(1)
		int minSoFar = arr[0];
		int maxProfit = 0;
		for(int i = 0; i < arr.length; i++) {
			int min = arr[i];
			if(min < minSoFar) {
				minSoFar = min;
			}
			int ProfitSoFar = arr[i] - minSoFar;
			if(ProfitSoFar > maxProfit) {
				maxProfit = ProfitSoFar;
			}
		}
		return maxProfit;
	}

}
