package Assignment3;

class DifferenceArray
{
	public static void main(String[] args)
	{
		int n=5;
		int diff[]=new int[n];
		diff[1]+=5;
		diff[4]-=5;

		int a[]=new int[n];
		a[0]=diff[0];
		for(int i=1;i<n;i++)
		a[i]=a[i-1]+diff[i];

		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}