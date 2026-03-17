package Assignment3.Module7;

class RotatedSearch
{
	public static void main(String[] args)
	{
		int a[]={4,5,6,7,1,2,3};
		int x=2,l=0,r=a.length-1;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(a[m]==x)
			{
				System.out.println("Index: "+m);
				return;
			}
			if(a[l]<=a[m])
			{
				if(x>=a[l]&&x<a[m])r=m-1;
				else l=m+1;
			}
			else
			{
				if(x>a[m]&&x<=a[r])l=m+1;
				else r=m-1;
			}
		}
		System.out.println("Not Found");
	}
}
