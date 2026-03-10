package Assignment3;

class Kadane
{
	public static void main(String[] args)
	{
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		int max=a[0],cur=a[0],start=0,end=0,s=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>cur+a[i])
			{
				cur=a[i];
				s=i;
			}
			else
			{
				cur=cur+a[i];
			}
			if(cur>max)
			{
				max=cur;
				start=s;
				end=i;
			}
		}
		System.out.println("Max Sum: "+max);
		System.out.print("Subarray: ");
		for(int i=start;i<=end;i++)
		System.out.print(a[i]+" ");
	}
}