package LeetCode;

import java.util.*;
class LeetCode239
{
	public int[] maxSlidingWindow(int[] nums,int k)
	{
		Deque<Integer> d=new ArrayDeque<>();
		int[] r=new int[nums.length-k+1];
		for(int i=0;i<nums.length;i++)
		{
			while(!d.isEmpty()&&d.peek()<i-k+1)d.poll();
			while(!d.isEmpty()&&nums[d.peekLast()]<nums[i])d.pollLast();
			d.offer(i);
			if(i>=k-1)
			r[i-k+1]=nums[d.peek()];
		}
		return r;
	}	
	public static void main(String[] args)
	{
		LeetCode239 s=new LeetCode239();
		int[] a={1,3,-1,-3,5,3,6,7};
		int[] r=s.maxSlidingWindow(a,3);
		for(int i:r)System.out.print(i+" ");
	}
}
