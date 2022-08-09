package array;

import java.util.*;

public class SumSubarray {

	public static void main(String[] args) {
		int a[] = {10,15,-5,15,-10,5};
		int sum = 5;
		findSubarray(a,sum);
	}
	
	public static void findSubarray(int[] arr, int sum) {
		int start = 0;
		int end = -1;
		int currSum = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			currSum = currSum + arr[i];
			//if the subarray starts from first index
			if(currSum == sum) {
				start = 0;
				end = i;
				break;
			}
			if(map.containsKey(currSum - sum)) {
				start = map.get(currSum-sum) + 1;
				end = i;
				break;
			}
			map.put(currSum,i);
		}
		if(end == -1) {
			System.out.println("Subarray not found");
		}else {
			System.out.println("Subarray starts at " + start + " and ends at " + end);
		}
	}

}
