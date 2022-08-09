package array;
import java.util.*;

public class Repeat_Missing_Array {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		ArrayList<Integer> ans = repeatedNumber(arr);
		for(int ele : ans) {
			System.out.println(ele);
		}
	}
	
	 public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	        ArrayList<Integer> res = new ArrayList<>();
	        int repeating = 0;
	        int missing = 0;
	        int i = 0;
	        
	        while(i < A.size()) {
	        	
	        	if(A.get(i) == A.get(A.get(i) - 1)) i++;
	        	else {
	        		if(A.get(i) != A.get(A.get(i) - 1)) {
	        			Collections.swap(A, i, A.get(i) - 1);
	        		}else {
	        			i++;
	        		}
	        	}
	        }
	        
	        for(i = 0; i < A.size(); i++) {
        		if(A.get(i) != i + 1) {
        			repeating = A.get(i);
        			missing = i + 1;
        			break;
        		}
        	}
	        
	        res.add(repeating);
	        res.add(missing);
	        
	        return res;
	    }
	 
}
