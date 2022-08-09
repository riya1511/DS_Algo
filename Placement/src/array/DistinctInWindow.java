package array;

import java.util.HashMap;

public class DistinctInWindow {

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,3,1,1,3};
		distinctEle(arr,4);
	}
	
	public static void distinctEle(int[] a, int winSize) {
		HashMap<Integer,Integer> map = new HashMap<>();
		//for first k elements
		for(int i = 0 ; i < winSize; i++) {
			map.put(a[i], map.getOrDefault(a[i],0)+1);
		}
		System.out.println(map.size());
		
		for(int i = winSize; i < a.length; i++) {
			if(map.get(a[i-winSize]) == 1) {
				map.remove(a[i-winSize]);
			}else {
				map.put(a[i-winSize], map.get(a[i-winSize])-1);
			}
			map.put(a[i], map.getOrDefault(a[i],0)+1);
			System.out.println(map.size());
		}
	}

}
