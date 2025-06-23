package com.test;
	
	import java.util.Stack;

	public class BalancedBrackets {

	    // Function to check if brackets are balanced
	    public static boolean areBracketsBalanced(String expr) {
	        Stack<Character> stack = new Stack<>();

	        // Traverse the expression
	        for (char ch : expr.toCharArray()) {
	            // If opening bracket, push to stack
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            }
	            // If closing bracket, check for matching opening
	            else if (ch == ')' || ch == '}' || ch == ']') {
	                // If stack is empty, it's unbalanced
	                if (stack.isEmpty()) return false;

	                char top = stack.pop();
	                if (!isMatchingPair(top, ch)) return false;
	            }
	        }

	        // If stack is empty at the end, brackets are balanced
	        return stack.isEmpty();
	    }

	    // Helper function to match pairs
	    private static boolean isMatchingPair(char open, char close) {
	        return (open == '(' && close == ')') ||
	               (open == '{' && close == '}') ||
	               (open == '[' && close == ']');
	    }

	    // Main method to test the function
	    public static void main(String[] args) {
	        String expression = "{[()]}";
	        
	        if (areBracketsBalanced(expression)) {
	            System.out.println("The expression has balanced brackets." + expression);
	        } else {
	            System.out.println("The expression does NOT have balanced brackets.");
	        }
	    }
	}
