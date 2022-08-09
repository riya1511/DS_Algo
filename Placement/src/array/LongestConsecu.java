package array;

import java.util.HashSet;

public class LongestConsecu {   //:(

	public static void main(String[] args) {
		int a[] = {2,6,1,9,4,5,3};
		System.out.println(findLongestConseqSubseq(a,a.length));
	}
	
	static int findLongestConseqSubseq(int arr[], int N)
	{
		int max_len = 0;
		   HashSet<Integer> set = new HashSet<>();
		   for(int e : arr){
		       if(!set.contains(e-1)){
		           int len = 1;
		           int curr_ele = e;
		           while(set.contains(curr_ele+1)){
		               len++;
		               curr_ele++;
		               System.out.println(len);
		           }
		           max_len = Math.max(len,max_len);
		           System.out.println(max_len);
		        }
		    }
		    return max_len;
	}

}
