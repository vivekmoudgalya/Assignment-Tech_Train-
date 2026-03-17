package LeetCode;

import java.util.*;
class LeetCode232
{
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	public void push(int x){s1.push(x);}
	public int pop()
	{
		while(!s1.isEmpty())s2.push(s1.pop());
		int r=s2.pop();
		while(!s2.isEmpty())s1.push(s2.pop());
		return r;
	}
	public int peek()
	{
		while(!s1.isEmpty())s2.push(s1.pop());
		int r=s2.peek();
		while(!s2.isEmpty())s1.push(s2.pop());
		return r;
	}
	public boolean empty()
	{
		return s1.isEmpty();
	}
	public static void main(String[] args)
	{
		LeetCode232 q=new LeetCode232();
		q.push(1);
		q.push(2);
		System.out.println(q.pop());
	}
}
