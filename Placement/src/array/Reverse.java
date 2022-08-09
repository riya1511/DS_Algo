package array;

public class Reverse {

	public static void main(String[] args) {
		int[] a = {4,5,1,2};
		reverseArray(a,0,a.length-1);
		for(int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}
	
	public static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
