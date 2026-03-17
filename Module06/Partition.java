package Assignment3;

class Partition
{
	public static void main(String[] args)
	{
		int a[]={3,-2,5,-1,-4,6};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				j++;
			}
		}
		System.out.print("Array: ");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}
