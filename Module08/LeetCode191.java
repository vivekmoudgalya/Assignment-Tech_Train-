package LeetCode;

class LeetCode191
{
	public int hammingWeight(int n)
	{
		int c=0;
		while(n!=0)
		{
			c+=n&1;
			n>>>=1;
		}
		return c;
	}
	public static void main(String[] args)
	{
		LeetCode191 s=new LeetCode191();
		System.out.println(s.hammingWeight(11));
	}
}
