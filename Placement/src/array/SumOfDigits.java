package array;

public class SumOfDigits {

	public static void main(String[] args) {
		int[] a = {99,77,11,66,55};
		System.out.println(sum(a));
	}
	
	public static int sum(int[] arr) {
		int min = 101;
		for(int i = 0; i< arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		int sum = 0;
		while(min != 0) {
			int res = min % 10;
			sum += res;
			min /= 10;
		}
		return sum;
	}

}
