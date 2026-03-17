package Assignment3.Module7;

class SelectionSort
{
	public static void main(String[] args)
	{
		int a[]={5,3,8,4,2};
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			if(a[j]<a[min])
			min=j;
			int t=a[i];
			a[i]=a[min];
			a[min]=t;
		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
}
