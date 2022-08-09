package array;
import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < nums.length-2; i++){
            
            //to skip the same value of a after index 0
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                
                int low = i+1, high = nums.length -1, sum = 0 - nums[i];
                
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        
                        //to skip repeating low and high values
                        while((low < high) && nums[low] == nums[low+1]) low++;
                        while((low < high) && nums[high] == nums[high-1]) high--;
                        
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] < sum) low++;
                    else high--;
                }
            }
        }
        
        return res;
    }

}
