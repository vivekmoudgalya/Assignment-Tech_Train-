package LeetCode;
class ListNode
{
	int val;
	ListNode next;
	ListNode(int v){val=v;}
	ListNode(int v,ListNode n)
	{
		val=v;
		next=n;
	}
}

class LeetCode206
{
	public ListNode reverseList(ListNode h)
	{
		ListNode p=null;
		while(h!=null)
		{
			ListNode n=h.next;
			h.next=p;
			p=h;
			h=n;
		}
		return p;
	}
	public static void main(String[] args)
	{
		LeetCode206 s=new LeetCode206();
		ListNode a=new ListNode(1,new ListNode(2,new ListNode(3)));
		ListNode r=s.reverseList(a);
		while(r!=null){System.out.print(r.val+" ");r=r.next;}
	}
}