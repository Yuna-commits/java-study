package chapter04.collection;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println((isValidParentheses("(())(()()())") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("(())(()()())()") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("((())((()())())") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("())") ? "Valid" : "InValid") + " Parentheses");
	}

	private static boolean isValidParentheses(String expr) {
		Stack<Character> stack = new Stack<>();

		for (char c : expr.toCharArray()) {
			if (c == '(') {
				stack.push(c);
				continue;
			}
			
			// c==')'인 경우
			if (stack.isEmpty()) {
				return false;
			}

			stack.pop();
		}

		// stack이 비어있으면 true, 그렇지 않으면 false
		return (stack.isEmpty());
	}
}
