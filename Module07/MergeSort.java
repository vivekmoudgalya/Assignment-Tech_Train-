package Assignment3.Module7;

class MergeSort
{
	static void merge(int a[],int l,int m,int r)
	{
		int n1=m-l+1,n2=r-m;
		int L[]=new int[n1],R[]=new int[n2];
		for(int i=0;i<n1;i++)
		L[i]=a[l+i];
		for(int j=0;j<n2;j++)
		R[j]=a[m+1+j];
		int i=0,j=0,k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])a[k++]=L[i++];
			else 
			a[k++]=R[j++];
		}
		while(i<n1)a[k++]=L[i++];
		while(j<n2)a[k++]=R[j++];
	}
	static void sort(int a[],int l,int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	public static void main(String[] args)
	{
		int a[]={5,3,8,4,2};
		sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
