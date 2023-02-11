package balancebracket;

import java.util.Stack;

public class BracketBalance {


	
		 static boolean checkingBracketBalance(String bracketExpression) {
			// TODO Auto-generated method stub
			Stack<Character> stack=new Stack<Character>();
			for(int i=0;i<bracketExpression.length();i++)
			{
				char  character=bracketExpression.charAt(i);
			if(character == '(' || character=='{'|| character=='[')
			{
				stack.push((char) character);
				continue;
			}
				if(stack.isEmpty() )
					return false;
				char c;
				switch(character) {
				case'}':
					c=stack.pop();
					if(c=='('||c=='[')
						return false;
					break;
				case')':
					c=stack.pop();
					if(c=='{'||c=='[')
						return false;
					break;
				case']':
					c=stack.pop();
					if(c=='('||c=='{')
						return false;
					break;
					
					
				}
					
			}
		return (stack.isEmpty());
		}
		
		public static void main(String[] args) {
			
			String bracketExpression ="([[{}]])";
			boolean result;
			result=checkingBracketBalance(bracketExpression);
					if(result)
					System.out.println("the entered string has balance bracket");	
					else
			System.out.println("the entered string do not balance bracket");	
			
		}
			
		}	
	

	


