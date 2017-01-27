//ALL POSSIBLE WAYS TO TAKE A CERTAIN NUMBER OF STEPS WITH MAXIMUM STEP BEING 3 AT ONCE AND MINIMUM 1

import java.util.*;
public class StairsProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt(); sc.close();
		Stack<Integer> s = new Stack<Integer>();
		recur(in,s);	
	}
	static void recur(int n,Stack<Integer> s)
	{
		if(n<0){
			return;
		}
		if(n==0)
		{
			System.out.println(s);
		}
			Stack<Integer> s1 = (Stack<Integer>)s.clone();
			s1.push(1);
			recur(n-1,s1);			
			Stack<Integer> s2 = (Stack<Integer>)s.clone();
			s2.push(2);
			recur(n-2,s2);
			Stack<Integer> s3 = (Stack<Integer>)s.clone();
			s3.push(3);
			recur(n-3,s3);		
	}

}
