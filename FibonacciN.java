import java.util.*;
public class FibonacciN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt(); sc.close();
		
		//Non-recursive
		for(int i=1;i<=in;i++)
		{
			Fib(i);	
			
			System.out.println();
		}
		
		//Recursive
		for(int i=0;i<=in;i++)
		{
			System.out.print(FibRec(i));	
		}
		
	}
	
	public static void Fib(int n)
	{
		int x1=0,x2=1,num;
		
		for(int i=1;i<=n;i++)
		{
			num=x1+x2;
			System.out.print(num +" ");
			x1=x2;
			x2=num;
		}
	}
	
	public static int FibRec(int n)
	{
		if(n == 1 || n == 0)
		{
			return n;
		}
		else
			return FibRec(n-1)+FibRec(n-2);
			
	}

}
