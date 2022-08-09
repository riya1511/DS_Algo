package array;

import java.util.HashMap;

public class largestSubArray {

	public static void main(String[] args) {
		int[] a = {1,1,0,1,1,0,0};
		subArray(a);
	}
	
	public static void subArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				arr[i] = -1;
			}
		}
		
		int len = 0;
		int start = 0;
		int end = -1;
		int currSum = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			currSum = currSum + arr[i];
			if(currSum == 0) {
				start = 0;
				end = i;
				break;
			}
			if(map.containsKey(currSum - 0)) {
				start = map.get(currSum - 0) + 1;
				end = i;
				if((end - start + 1) > len) {
					len = end-start+1;
				}
			}else {
				map.put(currSum, i);
			}
		}
		if(end == -1) {
			System.out.println("Subarray not found");
		}else {
			System.out.println("Subarray starts at " + start + " and ends at " + end);
		}
	}

}
