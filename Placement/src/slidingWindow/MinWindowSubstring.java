package slidingWindow;
import java.util.*;

public class MinWindowSubstring {

	public static void main(String[] args) {
		String S = "timetopractice";
		String P = "toc";
		System.out.println(smallestWindow(S,P));
	}
	
	public static String smallestWindow(String s, String p)
    {
         HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        int i = 0, j = 0, len = Integer.MAX_VALUE;
        
        for(Character c: p.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else map.put(c, 1);
        }
        
        int count = map.size();
        
        while(j < s.length()){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                
                if(map.get(s.charAt(j)) == 0) count--;
            }
            
            while(count == 0){
                if(len > (j-i+1)){
                    len = j-i+1;
                    ans = s.substring(i,j+1);
                }
                if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
                
                if(map.get(s.charAt(i)) > 0) count++;
            }
                i++;
            }
            j++;
        }
        
         return (len!= Integer.MAX_VALUE) ? ans : "-1";
    }

}
