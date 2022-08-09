package array;
import java.util.*;

public class LongestSubsequence {

	public static void main(String[] args) {
		int[][] a = {{2,3,6,8},
					 {1,2,3,5,6,7,10},
					 {2,3,4,6,9}};
		
		ArrayList<Integer> result = longestSubSeq(a);
		for(int i : result) {
			System.out.println(i);
		}
	}
	
	public static ArrayList<Integer> longestSubSeq(int[][] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(map.containsKey(arr[i][j])) {
					map.put(arr[i][j], map.get(arr[i][j]) + 1);
				}else {
					map.put(arr[i][j], 1);
				}
			}
			
			for(int j = 0; j < arr[i].length; j++) {
				if(map.get(arr[i][j]) == arr.length) res.add(arr[i][j]);
			}
		}
		
		return res;
	}

}
