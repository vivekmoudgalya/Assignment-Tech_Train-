package Assignment3;

class PairSum
{
	public static void main(String[] args)
	{
		int a[]={2,4,3,5,7};
		int target=7;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("Pair: "+a[i]+" "+a[j]);
					System.out.print("Subarray: ");
					for(int k=i;k<=j;k++)
					System.out.print(a[k]+" ");
					System.out.println();
				}
			}
		}
	}
}
