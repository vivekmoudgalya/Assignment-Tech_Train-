package Assignment3;

class Rearrange
{
	public static void main(String[] args)
	{
		int a[]={3,6,12,1,5,8};
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0 && a[i]%2!=0)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]%2==0)
					{
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
						break;
					}
				}
			}
		}
			System.out.print("Array: ");
			for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}