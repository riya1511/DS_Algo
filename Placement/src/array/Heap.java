package array;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {    

	public static void main(String[] args) {
		int[] a = {10,20,15,30,40};
		heapSort(a,a.length);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	//converts whole tree to heap
	public static void buildHeap(int[] h, int n) {
		//starting from n/2 to 0 as for leaf nodes[n/2 to n] we do not have to create heaps
		for(int i = n/2; i >= 0; i--) {
			heapify(h,n,i);
		}
	}
	
	//this functions require you to have the tree below index to be a heap
	//converts a part to heap
	public static void heapify(int[] h, int n, int index) {
		int largest = index;
		int l = 2*index + 1;
		int r = 2*index + 2;
		if(r < n && h[r] > h[largest]) {
			largest = r;
		}
		if(l < n && h[l] > h[largest]) {
			largest = l;
		}
		if(index != largest) {
			swap(h,largest,index);
			heapify(h,n,largest);
		}
	}
	
	public static int[] swap(int[]arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;
	}
	
	//sorts in O(nlogn) without space
	public static void heapSort(int[] h, int n) {
		buildHeap(h,n);
		for(int i = n-1; i >= 0; i--) {
			swap(h,0,i);
			heapify(h,i-1,0);
		}
	}
}
