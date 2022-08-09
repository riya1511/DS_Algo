package array;

import java.util.HashSet;

public class CountDistinct {

	public static void main(String[] args) {
		int arr[] = {5,10,5,4,5,10};
		System.out.println(count(arr));
	}
	
	public static int count(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		return set.size();
	}

}
