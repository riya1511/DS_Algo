package array;

public class SearchInInfinite {

	public static void main(String[] args) {
		int[] a = {1,3,7,8,12,58,72,88,95,98,100,109,117,133,155,166,177};
		System.out.println(search(a,177));
	}
	
	public static int search(int[] arr, int key) {
		int low = 0;
		int high = 1;
		while(arr[high] < key) {
			low++;;
			high = high * 2;
		}
		if(RBinarySearch(arr,low,high,key)) return 1;
		else return -1;
	}
	
	public static boolean RBinarySearch(int[] arr, int l, int h,int key) {
		if(h < l) {
			return false;
		}else {
			int mid = (l+h) / 2;
			if(arr[mid] == key) return true;
			else if(arr[mid] > key) {
				return RBinarySearch(arr,l,mid-1,key);
			}
			else {
				return RBinarySearch(arr,mid+1,h,key);
			}
		}
		
	}

}
