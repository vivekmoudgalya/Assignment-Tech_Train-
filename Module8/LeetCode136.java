package LeetCode;


class LeetCode136
{
	public int singleNumber(int[] nums)
	{
		int x=0;
		for(int n:nums)
		x^=n;
		return x;
	}
	public static void main(String[] args)
	{
		LeetCode136 s=new LeetCode136();
		int[] a={4,1,2,1,2};
		System.out.println(s.singleNumber(a));
	}
}