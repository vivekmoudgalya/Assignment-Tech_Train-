package LeetCode;

class ListNode
{
int val;
ListNode next;
ListNode(int v){val=v;}
ListNode(int v,ListNode n){val=v;next=n;}
}

class LeetCode19
{
	public ListNode removeNthFromEnd(ListNode h,int n)
	{
		ListNode d=new ListNode(0,h),f=d,s=d;
		for(int i=0;i<=n;i++)f=f.next;
		while(f!=null)
		{
			f=f.next;s=s.next;
		}
		s.next=s.next.next;
		return d.next;
	}
	public static void main(String[] args)
	{
		LeetCode19 s=new LeetCode19();
		ListNode a=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
		ListNode r=s.removeNthFromEnd(a,2);
		while(r!=null){System.out.print(r.val+" ");r=r.next;}
	}
}