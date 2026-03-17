package LeetCode;

import java.util.*;
class LeetCode22
{
	public List<String> generateParenthesis(int n)
	{
		List<String> r=new ArrayList<>();
		gen("",0,0,n,r);
		return r;
	}
	void gen(String s,int o,int c,int n,List<String> r)
	{
		if(s.length()==2*n)
		{
			r.add(s);
			return;
		}
		if(o<n)gen(s+"(",o+1,c,n,r);
		if(c<o)gen(s+")",o,c+1,n,r);
	}
	public static void main(String[] args)
	{
		LeetCode22 s=new LeetCode22();
		System.out.println(s.generateParenthesis(3));
	}
}