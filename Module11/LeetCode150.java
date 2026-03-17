package LeetCode;

import java.util.*;
class LeetCode150
{
	public int evalRPN(String[] t)
	{
		Stack<Integer> s=new Stack<>();
		for(String x:t)
		{
			if(x.equals("+"))
			s.push(s.pop()+s.pop());
			else if(x.equals("-"))
			{
				int b=s.pop();
				s.push(s.pop()-b);
			}
			else if(x.equals("*"))
			s.push(s.pop()*s.pop());
			else if(x.equals("/"))
			{
				int b=s.pop();
				s.push(s.pop()/b);
			}
			else s.push(Integer.parseInt(x));
		}
		return s.pop();
	}
	public static void main(String[] args)
	{
	LeetCode150 s=new LeetCode150();
	String[] t={"2","1","+","3","*"};
	System.out.println(s.evalRPN(t));
	}
}