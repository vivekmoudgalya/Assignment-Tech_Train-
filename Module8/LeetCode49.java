package LeetCode;

import java.util.*;
class LeetCode49
{
	public List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String,List<String>> m=new HashMap<>();
		for(String s:strs)
		{
			char c[]=s.toCharArray();
			Arrays.sort(c);
			String k=new String(c);
			m.putIfAbsent(k,new ArrayList<>());
			m.get(k).add(s);
		}
		return new ArrayList<>(m.values());
	}
	public static void main(String[] args)
	{
		LeetCode49 s=new LeetCode49();
		String[] a={"eat","tea","tan","ate","nat","bat"};
		System.out.println(s.groupAnagrams(a));
	}
}