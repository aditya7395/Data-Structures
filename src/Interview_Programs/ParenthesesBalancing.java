package Interview_Programs;
import java.util.*;

public class ParenthesesBalancing 
{
	private static final char L_PAREN    = '(';
	private static final char R_PAREN    = ')';
	private static final char L_BRACE    = '{';
	private static final char R_BRACE    = '}';
	private static final char L_BRACKET  = '[';
	private static final char R_BRACKET  = ']';

	public static boolean isBalanced(String s) 
	{
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == L_PAREN) 
			{
				stack.push(L_PAREN);
			}

			else if (s.charAt(i) == L_BRACE)   
			{
				stack.push(L_BRACE);
			}

			else if (s.charAt(i) == L_BRACKET) 
			{
				stack.push(L_BRACKET);
			}

			else if (s.charAt(i) == R_PAREN) 
			{
				if (stack.isEmpty())        
				{
					return false;
				}
				if (stack.pop() != L_PAREN) 
				{
					return false;
				}
			}

			else if (s.charAt(i) == R_BRACE) 
			{
				if (stack.isEmpty())        
				{
					return false;
				}
				if (stack.pop() != L_BRACE) 
				{
					return false;
				}
			}

			else if (s.charAt(i) == R_BRACKET) 
			{
				if (stack.isEmpty())        
				{
					return false;
				}
				if (stack.pop() != L_BRACKET) 
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a parenthesis sequence: ");
		String s = in.next();
		System.out.println(isBalanced(s));
	}
}