package array;

public class SearchInRotated {

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};	
		System.out.println(findMin(arr));
		System.out.println(search(arr, 5));
	}
	
	public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        // int min_index = 0;
        
        while(start < end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target) return mid;
            
            if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > nums[mid] && target <= nums[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
            }
            
        }
        
        return nums[start] == target ? start : -1;
    }
	
	public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int min = nums[0];
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else if(mid > start && nums[mid] > nums[mid-1]){
                end = mid - 1;
            }else{
                min = nums[mid];
                break;
            }
        }
        
        return min;
    }

}
