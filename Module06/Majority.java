package Assignment3;

class Majority
{
	public static void main(String[] args)	
	{
		int a[]={2,2,1,2,3,2,2};
		int cand=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(count==0)	
			{
				cand=a[i];
				count=1;
			}
			else if(a[i]==cand)
			count++;
			else
			count--;
		}
		System.out.println("Majority Element: "+cand);
	}
}
