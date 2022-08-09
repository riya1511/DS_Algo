package stack;
import stack.MaxArea;

public class LargestAreaRect {

	public static void main(String[] args) {
		int[][] a = {{1,1,0,1,1},{1,1,1,1,1},{0,1,1,1,1},{1,1,1,1,1},{1,0,1,1,1},{1,1,1,1,0}};
		System.out.println(maxArea(a));
	}
	
	public static int maxArea(int[][] arr) {
		int[] currRow = arr[0];
		int maxArea = MaxArea.maxAreaRect(currRow);
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 1) {
					currRow[j] += 1;
				}else currRow[j] = 0;
			}
			int currArea = MaxArea.maxAreaRect(currRow);
			maxArea = Math.max(maxArea, currArea);
		}
		return maxArea;
	}

}
