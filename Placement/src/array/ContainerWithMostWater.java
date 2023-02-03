class Solution {
    public int maxArea(int[] height) {
       int max = -1;
       int left = 0;
       int right = height.length-1;

       while(right > left){
           int area = Math.min(height[right], height[left]) * (right - left);
           max = Math.max(max, area);
           if(height[left] < height[right]) left++;
           else if(height[left] > height[right]) right--;
           else{
               left++;
               right--;
           }
       }

       return max;
    }
}
