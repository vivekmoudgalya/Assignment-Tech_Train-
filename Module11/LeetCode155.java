package LeetCode;

import java.util.*;
class LeetCode155
{
	Stack<Integer> s=new Stack<>();
	Stack<Integer> m=new Stack<>();
	public void push(int x)
	{
		s.push(x);
		if(m.isEmpty()||x<=m.peek())m.push(x);
	}
	public void pop()
	{
		if(s.pop().equals(m.peek()))
		m.pop();
	}
	public int top()
	{
		return s.peek();
	}
	public int getMin()
	{
		return m.peek();
	}
	public static void main(String[] args)
	{
		LeetCode155 s=new LeetCode155();
		s.push(3);
		s.push(1);
		s.push(2);
		System.out.println(s.getMin());
	}
}
