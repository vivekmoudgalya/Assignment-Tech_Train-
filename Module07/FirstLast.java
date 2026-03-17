package Assignment3.Module7;

class FirstLast
{
	public static void main(String[] args)
	{
		int a[]={1,2,2,2,3,4};
		int x=2,first=-1,last=-1,l=0,r=a.length-1;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(a[m]>=x)
			{
				r=m-1;
				if(a[m]==x)first=m;
			}
			else l=m+1;
		}
		l=0;r=a.length-1;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(a[m]<=x)
			{
				l=m+1;
				if(a[m]==x)last=m;
			}
			else r=m-1;
		}
		System.out.println("First: "+first);
		System.out.println("Last: "+last);
	}
}
