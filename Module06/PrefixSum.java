package Assignment3;

class PrefixSum
{
	public static void main(String[] args)
	{
		int a[]={2,4,6,8,10};
		int n=a.length;
		int p[]=new int[n];
		p[0]=a[0];
		for(int i=1;i<n;i++)
		p[i]=p[i-1]+a[i];

		int l=1,r=3;
		int sum=p[r]-(l>0?p[l-1]:0);
		System.out.println("Range Sum: "+sum);
	}
}