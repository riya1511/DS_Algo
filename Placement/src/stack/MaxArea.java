package stack;

import java.util.Stack;

public class MaxArea {

	public static void main(String[] args) {
		int a[] = {4,2,1,5,6,3,2,4,2};
		System.out.println(maxAreaRect(a));
	}
	
	public static int maxAreaRect(int[] arr) {
		int[] prevSma = prevSmaller(arr);
		int[] nextSma = nextSmaller(arr);
		int maxArea = 0;
		for(int i = 0; i < arr.length; i++) {
			int area = (nextSma[i] - prevSma[i] - 1) * arr[i];
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}
	
	public static int[] prevSmaller(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) res[i] = -1;
			else res[i] = s.peek();
			s.push(i);
		}
		return res;
	}
	
	public static int[] nextSmaller(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] res = new int[arr.length];
		for(int i = arr.length-1; i >= 0; i--) {
			while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) res[i] = arr.length;
			else res[i] = s.peek();
			s.push(i);
		}
		return res;
	}

}
