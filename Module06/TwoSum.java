package Assignment3;

import java.util.*;

class TwoSum
{
	public static void main(String[] args)
	{
		int a[]={2,7,11,15};
		int target=9;
		HashMap<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			int x=target-a[i];
			if(m.containsKey(x))
			{
				System.out.println("Indices: "+m.get(x)+" "+i);
				break;
			}
			m.put(a[i],i);
		}
	}
}