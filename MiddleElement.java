/*Find the middle element of a linked list.*/

import java.util.*;
class MiddleElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]  = {1,2,3,4,5,6,7,8,9,10,11};
		Node1 head = null;
		int i = 0;
		while(i!=-1)
		{
			System.out.println("Enter new element(Press -1 to exit):");
			i = sc.nextInt();
			if(i!=-1)
			{
				head = createNode(head,i);
			}
		}
		displayList(head);
	}
	
	public static Node1 createNode(Node1 h,int d)
	{
		if(h == null)
		{
			h = new Node1(d);
			return h;
		}
		Node1 t = h;
		while(t.next!=null)
		{
			t = t.next;
		}
		t.next = new Node1(d);
		
		return h;
	}
	
	public static void displayList(Node1 h)
	{
		while(h != null)
		{
			System.out.print(h.data);
			if(h.next != null)
				System.out.print("-->");
			
			h = h.next;
		}
		System.out.println();
	}
	public static Node1 createList(int[] a)
	{
			Node1 head 	= new Node1(a[0]);
			Node1 t		= head;
			for(int i=1;i<a.length;i++)
			{
				Node1 newn 	= new Node1(a[i]);
				newn.next	= null;
				t.next		= newn;
				t			= t.next;
			}
			return head;
	}
	public static int findMiddle(Node1 t)
	{
		int count	= 0;
		Node1 temp 	= t;
		Node1 nf	= null;
		Node1 ns	= null;
		
		nf			= temp;
		ns			= temp;
		while(nf != null)
		{
			nf = nf.next;
			count++;
			if(count == 2)
			{
				ns 		= ns.next;
				count 	= 0;
			}
		}
		return ns.data;
	}
	public static void lastN(Node1 t,int n)
	{
		int count  = 0;
		Node1 temp = t;
		Node1 nf = null, ns = null;
		nf = temp;
		ns = temp;
		while(nf != null)
		{
			nf	=	nf.next;
			count++;
			if(count >= n)
			{
				ns		= ns.next;
				count	= 0;
			}
		}
		displayList(ns);
	}
	
}
class Node1
{
	int data;
	Node1 next;
	Node1(){}
	Node1(int data)
	{
		this.data = data;
	}
}
