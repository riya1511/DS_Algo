package array;

public class RainWater {

	public static void main(String[] args) {
		int[] a = {3,1,2,4,0,1,3,2};
		System.out.println(waterStored(a));
	}
	
	public static int waterStored(int[] arr) {
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		int min = arr[0];
		int max = arr[arr.length-1];
		int height = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > min) {
				min = arr[i];
			}
			left[i] = min;
		}
		for(int j = arr.length-1; j >= 0; j--) {
			if(arr[j] > max) {
				max = arr[j];
			}
			right[j] = max;
		}
		for(int i = 0; i < arr.length; i++) {
			height = height + Math.min(left[i], right[i]) - arr[i];
		}
		return height;
	}

}
