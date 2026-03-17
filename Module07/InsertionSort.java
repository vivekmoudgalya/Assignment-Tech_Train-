package Assignment3.Module7;

class InsertionSort
{
	public static void main(String[] args)
	{
		int a[]={5,3,8,4,2};
		for(int i=1;i<a.length;i++)
		{
			int key=a[i],j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}