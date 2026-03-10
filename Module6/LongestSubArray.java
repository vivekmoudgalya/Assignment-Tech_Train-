package Assignment3;

class LongestSubarray
{
	public static void main(String[] args)
	{
		int a[]={1,2,3,1,1,1,2};
		int k=5,max=0,start=0,end=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(sum==k && j-i+1>max)
				{
					max=j-i+1;
					start=i;
					end=j;
				}
			}
		}
			System.out.println("Length: "+max);
			System.out.print("Subarray: ");
			for(int i=start;i<=end;i++)
			System.out.print(a[i]+" ");
	}
}
