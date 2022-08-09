package array;
import java.util.*;

public class UnionNIntersection {

	public static void main(String[] args) {
		int[] a = {5,10,15,5,10};
		int[] b = {15,5,5,10,4};
		System.out.println("The length of array after union is " + findUnion(a,b));
		System.out.println("The length of array after intersection is " + findIntersection(a,b));
	}
	
	public static int findUnion(int[] arr1, int[] arr2) {
		HashSet<Integer> set1 = new HashSet<>();
		for(int i = 0; i < arr1.length; i++) {
			set1.add(arr1[i]);
		}
		
		for(int j = 0; j < arr2.length; j++) {
			set1.add(arr2[j]);
		}
		
		return set1.size();
	}
	
	public static int findIntersection(int[] arr1, int[] arr2) {
		int count = 0;
		HashSet<Integer> set2 = new HashSet<>();
		for(int i = 0; i < arr1.length; i++) {
			set2.add(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(set2.contains(arr2[i])) {
				count++;
				set2.remove(arr2[i]);
			}
		}
		
		return count;
	}

}
