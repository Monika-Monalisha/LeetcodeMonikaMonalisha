package EasyQuestions;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String S){
		Stack<Character> stack= new Stack<Character>();
		for(char c: S.toCharArray()){
			if(c=='(')
				stack.push(')');
			else if(c=='{')
				stack.push('}');
			else if(c=='[')
				stack.push(']');
			else if(stack.isEmpty()||stack.pop()!=c)
				return false;
				
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		String s = scan.next();
		scan.close();
		boolean result=isValid(s);
		System.out.println(result);
	}
}
