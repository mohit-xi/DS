/*Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced*/

import java.util.*;
class OrderedPairs{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String of parenthesis");
		String s=sc.nextLine();
		int l=s.length();
		Stack <Character> stk=new Stack <Character>();
		
		for(int i=0;i<l;i++){
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
				stk.push(s.charAt(i));

			if(!stk.isEmpty()){
				if(s.charAt(i)=='}' && stk.peek()=='{')
					stk.pop();

				else if(s.charAt(i)==']' && stk.peek()=='[')
					stk.pop();

				else if(s.charAt(i)==')' && stk.peek()=='(')
					stk.pop();
			}
		}

		System.out.println();
		
		if(stk.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}