package LeetCode;

class ListNode
{
	int val;
	ListNode next;
	ListNode(int v){val=v;}
	ListNode(int v,ListNode n){val=v;next=n;}
}

class LeetCode876
{
	public ListNode middleNode(ListNode h)
	{
		ListNode s=h,f=h;
		while(f!=null&&f.next!=null)
		{
			s=s.next;
			f=f.next.next;
		}
		return s;
	}
	public static void main(String[] args)
	{
		LeetCode876 s=new LeetCode876();
		ListNode a=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
		System.out.println(s.middleNode(a).val);
	}
}
