package LeetCode;

import java.util.*;
class LeetCode46
{
	public List<List<Integer>> permute(int[] nums)
	{
		List<List<Integer>> r=new ArrayList<>();
		back(nums,new boolean[nums.length],new ArrayList<>(),r);
		return r;
	}
	void back(int[] nums,boolean[] used,List<Integer> cur,List<List<Integer>> r)
	{
		if(cur.size()==nums.length)
		{
			r.add(new ArrayList<>(cur));
			return;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(used[i])continue;
			used[i]=true;
			cur.add(nums[i]);
			back(nums,used,cur,r);
			cur.remove(cur.size()-1);
			used[i]=false;
		}
	}
	public static void main(String[] args)
	{
		LeetCode46 s=new LeetCode46();
		int[] a={1,2,3};
		System.out.println(s.permute(a));
	}
}
