package LeetCode;

class LeetCode242
{
	public boolean isAnagram(String s,String t)
	{
		if(s.length()!=t.length())
		return false;
		int a[]=new int[26];
		for(char c:s.toCharArray())a[c-'a']++;
		for(char c:t.toCharArray())a[c-'a']--;
		for(int i:a)if(i!=0)return false;
		return true;
	}
	public static void main(String[] args)
	{
		LeetCode242 s=new LeetCode242();
		System.out.println(s.isAnagram("anagram","nagaram"));
	}
}