package array;

public class ProductArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] ans = productExceptSelf(arr);
		
		for(int ele : ans) {
			System.out.print(ele + " ");
		}
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int left = 1, right = 1;
        int n = nums.length;
        int[] res = new int[n];
        
        for(int i = 0; i < n; i++){
            res[i] = 1;
        }
        
        for(int i = 0; i < n; i++){
            res[i] *= left;
            left *= nums[i];
        }
        
        for(int i = n-1; i >= 0; i--){
            res[i] *= right;
            right *= nums[i];
        }
        
        return res;
    }

}
