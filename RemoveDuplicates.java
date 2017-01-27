import java.util.*;
class RemoveDuplicates {
	static Node2 head;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String i="";
		while(!i.equals("-1"))
		{
			System.out.println("Enter new element(Press -1 to exit):");
			i = sc.next();
			if(!i.equals("-1"))
			{
				createNode(head,i);
			}
		}
		displayList(head);
		removeNode("abc");
		displayList(head);
		System.out.println(isPalindrome());
	}
	public static void createNode(Node2 h,String d)
	{
		if(h==null)
		{
			h = new Node2(d);
			head = h;
			return;
		}
		Node2 t = h;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next = new Node2(d);
		
		head =h;
		return;
	}
	public static void displayList(Node2 h)
		{
			while(h!=null)
			{
				System.out.print(h.data);
				if(h.next!=null)System.out.print("-->");
				
				h=h.next;
			}
			System.out.println();
		}
	public static void removeNode(String s)
	{
		Node2 t = head;
		Node2 prev=head;
		while(t!=null)
		{
			if(t.equals(s) && t==head)
			{
				head=head.next;
				t=head;
				prev=head;
			}
			 if(t.next!=null && t.next.equals(s))
			{
				t=t.next;
				prev.next=t;
			}
			 if(t.next!=null)
			{
				 prev=t;
				 t=t.next;
			}
			 else if(t.equals(s))
			 {
				 t=null;
			 }
			
			
		}
	}
	public static void removeDuplicates()
	{
		Set<String> s = new HashSet<String>();
		
		
	}
	//public static
	public static boolean search(Set<String> s,String str)
	{
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			if(i.next().equals(str))
				return true;
		}
		return false;
	}
	public static boolean isPalindrome()
	{
		int count=0;
		Node2 t = head;
		Stack<String> s = new Stack<String>();
		Node2 nf=t,ns=t;
		while(nf!=null)
		{
			nf=nf.next;
			count++;
		}
		int mid=count/2;
		for(int i=0;i<mid;i++)
		{
			s.push(t.data);
			t=t.next;
		}
		if(count%2==1)
			t=t.next;
		
		for(int i=0;i<s.size();i++)
		{
			if(!s.peek().equals(t.data))
				return false;
			s.pop();
			t=t.next;
		}
		return true;
		
	}
}
class Node2
{
	String data;
	Node2 next;
	Node2(){}
	Node2(String data)
	{
		this.data=data;
	}
}
