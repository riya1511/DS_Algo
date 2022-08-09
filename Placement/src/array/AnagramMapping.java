package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramMapping {
	
	//creating pair as the array may contain duplicate nums so to deal with it in map 
	//we are passing the pair as value for the key -> nums in b
	static class Pair{
		int indx = 0;
		ArrayList<Integer> l = new ArrayList<>();
	}

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,2};
		int[] a2 = {4,3,2,1,5,2};
		System.out.println(anamapping(a1,a2));
	}
	
	public static List<Integer> anamapping(int[] a, int[] b){
		List<Integer> list = new ArrayList<>();
		HashMap<Integer,Pair> map = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			if(map.containsKey(b[i])) {
				Pair p = map.get(b[i]);
				p.l.add(i);
			}else {
				Pair p = new Pair();
				p.l.add(i);
				map.put(b[i], p);
			}
		}
		for(int i = 0; i < b.length; i++) {
			Pair p = map.get(a[i]);
			list.add(p.l.get(p.indx));
			p.indx++;
		}
		
		return list;
	}

}
