package Assignment3.Module7;

class BubbleSort
{
	public static void main(String[] args)
	{
		int a[]={5,3,8,4,2};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}