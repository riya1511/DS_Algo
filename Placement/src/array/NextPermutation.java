package array;

public class NextPermutation {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 6, 5, 4};
		int[] res = nextPermutation(a, a.length);
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	public static int[] nextPermutation(int[] arr, int N) {
		int i = N - 2;
        
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i >= 0){
            int j = N-1;
            while(arr[j] <= arr[i]) j--;
            swap(arr, i , j);
        }
        
        int[] ans = reverse(arr, i+1, N-1);
        return ans;
    }
    
    public static void swap(int[] nums, int a, int b){
        int temp;
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public static int[] reverse(int[] nums, int s, int e){
        while(s <= e){
            swap(nums,s++,e--);
        }
        return nums;
    }

}
