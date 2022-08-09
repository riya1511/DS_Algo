package array;
import java.util.*;

//class Pair{
//	int a;
//	int b;
//	
//	public Pair(int a, int b) {
//		a = this.a;
//		b = this.b;
//	}
//}

//find pair in an array that has sum equal to given sum

public class SumPair {

	public static void main(String[] args) {
		int[] a = {11, 15, 26, 38, 9, 10};
		System.out.println(findPair(a,16));
	}
	
	public static boolean findPair(int[] arr, int x) {
		int i;
		for(i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i+1]) break;
		}
		
		int l_index = i;
		int s_index = (i + 1) % arr.length;
		
		while(l_index != s_index) {
			
			if(arr[l_index] + arr[s_index] == x) return true;
			
			else if(arr[l_index] + arr[s_index] > x) l_index = (arr.length + l_index - 1) % arr.length;
			
			else s_index = (s_index + 1) % arr.length;
		}
		
		return false;
	}

}
