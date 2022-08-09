package array;

import java.util.Arrays;

public class SumOfProduct {

	public static void main(String[] args) {
		int[] arr1 = {0,1,0,0,2,0,0};
		int[] arr2 = {1,0,0,0,3,0,4};
		int res = sumofProductSparse(arr1,arr2,arr1.length);
		System.out.println(res);
	}
	
	public static int minSumOfProduct(int[] a, int[] b, int n) {
		Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += (a[i] * b[n-i-1]);
        }
        return sum;
	}
	
	public static int sumofProductSparse(int[] a, int[] b, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == 0 || b[i] == 0) continue;
			sum += a[i] * b[i];
		}
		return sum;
	}

}
