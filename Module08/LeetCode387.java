package LeetCode;

class LeetCode387
{
	public int firstUniqChar(String s)
	{
		int a[]=new int[26];
		for(char c:s.toCharArray())
		a[c-'a']++;
		for(int i=0;i<s.length();i++)
		if(a[s.charAt(i)-'a']==1)
		return i;
		return -1;
	}
	public static void main(String[] args)
	{
		LeetCode387 s=new LeetCode387();
		System.out.println(s.firstUniqChar("leetcode"));
	}
}