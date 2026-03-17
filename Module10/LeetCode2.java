package LeetCode;

class ListNode
{
	int val;
	ListNode next;
	ListNode(int v){val=v;}
	ListNode(int v,ListNode n){val=v;next=n;}
}

class LeetCode2
{
	public ListNode addTwoNumbers(ListNode l1,ListNode l2)
	{
		ListNode d=new ListNode(0),c=d;
		int carry=0;
		while(l1!=null||l2!=null||carry!=0)
		{
			int s=carry;
			if(l1!=null)
			{
				s+=l1.val;
				l1=l1.next;
			}
			if(l2!=null)
			{
				s+=l2.val;
				l2=l2.next;
			}
			carry=s/10;
			c.next=new ListNode(s%10);
			c=c.next;
		}
		return d.next;
	}
	public static void main(String[] args)
	{
		LeetCode2 s=new LeetCode2();
		ListNode l1=new ListNode(2,new ListNode(4,new ListNode(3)));
		ListNode l2=new ListNode(5,new ListNode(6,new ListNode(4)));
		ListNode r=s.addTwoNumbers(l1,l2);
		while(r!=null)
		{
			System.out.print(r.val+" ");r=r.next;
		}
	}
}
