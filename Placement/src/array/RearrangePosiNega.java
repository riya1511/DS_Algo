package array;

public class RearrangePosiNega {

	public static void main(String[] args) {
		int[] a = {1,2,3,-4,-1,4};
		rearrange(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static int[] rearrange(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length-1; j++) {
				if(arr[j] < 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
