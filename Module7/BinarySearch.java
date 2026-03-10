package Assignment3.Module7;

class BinarySearch
{
	static int rec(int a[],int l,int r,int x)	
	{
		if(l>r)return -1;
		int m=(l+r)/2;
		if(a[m]==x)return m;
		if(x<a[m])return rec(a,l,m-1,x);
		return rec(a,m+1,r,x);
	}
	public static void main(String[] args)
	{
		int a[]={1,3,5,7,9};
		int x=7;
		int l=0,r=a.length-1,pos=-1;
		while(l<=r)
		{
			int m=(l+r)/2;
			if(a[m]==x)
			{
				pos=m;break;
			}
			if(x<a[m])r=m-1;
			else l=m+1;
		}
		System.out.println("Iterative Index: "+pos);
		System.out.println("Recursive Index: "+rec(a,0,a.length-1,x));
	}
}