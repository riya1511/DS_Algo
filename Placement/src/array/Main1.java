package array;

import java.util.HashMap;

public class Main1 {

	public static void main(String[] args) {
		int[] a = {1,4,4,1,1};
	    int max_time = a.length/2;
	    System.out.println(majorEleMoore(a,max_time));
	}
	
	public static int majorEle(int[] arr, int max){   //O(n^2)
	    int count = 0;
	    for(int i = 0; i < arr.length; i++){
	        for(int j = i+1; j < arr.length; j++){
	            if(arr[i] == arr[j]){
	                count++;
	            }
	            if(count > max){
    	            return arr[i];
    	        }
	        }
	    }
	    return -1;
	}
	
	public static int majorEleAdv(int[] arr, int max) {    //O(n)  SC=O(n)
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				if(count > max) {
					return arr[i];
				}else {
					map.put(arr[i], count);
				}
			}else {
				map.put(arr[i], 1);
			}
		}
		
		return -1;
	}
	
	public static int majorEleMoore(int arr[], int max) {
		int ans_index = 0;
		int count = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[ans_index]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				ans_index = i;
				count = 1;
			}
		}
		int c = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[ans_index] == arr[i]) {
				c++;
			}
			if(c > max) {
				return arr[ans_index];
			}
		}
		return -1;
	}

}
