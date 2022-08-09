package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class OceanView {

	public static void main(String[] args) {
		int buildings[] = {4,2,3,1};
		ArrayList<Integer> res = buildingsWithOceanView(buildings);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}
	
	public static ArrayList<Integer> buildingsWithOceanView(int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		int maxHeight = 0;
		
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] > maxHeight) {
				maxHeight = arr[i];
				list.add(i);
			}
		}
		
		Collections.reverse(list);
		return list;
	}

}
