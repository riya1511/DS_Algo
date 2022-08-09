package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Smaller {

	public static void main(String[] args) {
		int[] a = {4,10,5,8,20,15,3,12};
		int[] nextSma = nextSmaller(a);
		int[] prevGrea = prevGreater(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println(nextSma[i]);
		}
	}
	
	public static int[] prevSmaller(int[] arr) {
		Stack<Integer> s = new Stack<>();
		//below can also be used and the whole code will be same
//		Deque<Integer> s = new ArrayDeque<>();
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			while(!s.isEmpty() && s.peek() >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) res[i] = -1;
			else res[i] = s.peek();
			s.push(arr[i]);
		}
		return res;
	}
	
	public static int[] prevGreater(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			while(!s.isEmpty() && s.peek() <= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) res[i] = -1;
			else res[i] = s.peek();
			s.push(arr[i]);
		}
		return res;
	}
	
	public static int[] nextSmaller(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int[] res = new int[arr.length];
		for(int i = arr.length-1; i >= 0; i--) {
			while(!s.isEmpty() && s.peek() >= arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) res[i] = -1;
			else res[i] = s.peek();
			s.push(arr[i]);
		}
		return res;
	}

}
