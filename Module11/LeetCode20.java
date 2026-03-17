package LeetCode;

import java.util.*;
class LeetCode20
{
	public boolean isValid(String s)
	{
		Stack<Character> st=new Stack<>();
		for(char c:s.toCharArray())
		{
			if(c=='('||c=='{'||c=='[')
			st.push(c);
			else
			{
				if(st.isEmpty())
				return false;
				char t=st.pop();
				if(c==')'&&t!='(')return false;
				if(c=='}'&&t!='{')return false;
				if(c==']'&&t!='[')return false;
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args)
	{
		LeetCode20 s=new LeetCode20();
		System.out.println(s.isValid("()[]{}"));
	}
}