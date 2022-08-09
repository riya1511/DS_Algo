package array;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {4,6,2,5,7,9,1,3};
		sort(a,0,a.length-1);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int partition(int[] arr, int front, int back) {
		int pivot = arr[front];
		while(front < back) {
			while(arr[front] <= pivot) front++;
			while(arr[back] > pivot) back--;
			if(arr[front] > arr[back]) {
				swap(arr[front],arr[back]);
			}
		}
		
		swap(arr[back],pivot);
		return pivot;
	}
	
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static void sort(int arr[], int l, int h) {
		if(l < h) {
			int pivotPosition = partition(arr,l,h);
			sort(arr,l,pivotPosition-1);
			sort(arr,pivotPosition+1,h);
		}
	}
}
