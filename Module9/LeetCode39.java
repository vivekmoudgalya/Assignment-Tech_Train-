package LeetCode;

import java.util.*;
class LeetCode39
{
	public List<List<Integer>> combinationSum(int[] c,int t)
	{
		List<List<Integer>> r=new ArrayList<>();
		dfs(c,t,0,new ArrayList<>(),r);
		return r;
	}
	void dfs(int[] c,int t,int i,List<Integer> cur,List<List<Integer>> r)
	{
		if(t==0)
		{
			r.add(new ArrayList<>(cur));
			return;
		}
		if(t<0)
		return;
		for(int j=i;j<c.length;j++)
		{
			cur.add(c[j]);
			dfs(c,t-c[j],j,cur,r);
			cur.remove(cur.size()-1);
		}
	}
	public static void main(String[] args)
	{
		LeetCode39 s=new LeetCode39();
		int[] a={2,3,6,7};
		System.out.println(s.combinationSum(a,7));
	}
}
