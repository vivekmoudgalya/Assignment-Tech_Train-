package LeetCode;

import java.util.*;
class LeetCode78
{
	public List<List<Integer>> subsets(int[] nums)
	{
		List<List<Integer>> r=new ArrayList<>();
		r.add(new ArrayList<>());
		for(int n:nums)
		{
			int size=r.size();
			for(int i=0;i<size;i++)
			{
				List<Integer> t=new ArrayList<>(r.get(i));
				t.add(n);
				r.add(t);
			}
		}
		return r;
	}
	public static void main(String[] args)
	{
		LeetCode78 s=new LeetCode78();
		int[] a={1,2,3};
		System.out.println(s.subsets(a));
	}
}
