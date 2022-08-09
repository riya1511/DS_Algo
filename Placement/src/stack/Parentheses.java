package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parentheses {

	public static void main(String[] args) {
		String str = "()))";
		System.out.println(validParenthesis(str));
	}
	
	public static boolean validParenthesis(String s) {
		Deque<Character> st = new ArrayDeque<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
				st.push(s.charAt(i));
			}
			else {
				if(st.isEmpty()) return false;
				else if(!isMatching(st.peek(),c)) return false;
				else st.pop();
			}
		}
		return st.isEmpty();
	}
	
	public static boolean isMatching(char a, char b) {
		return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
	}

}
