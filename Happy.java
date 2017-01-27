/*
 * A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
Examples:

Input: n = 19
Output: Happy
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Input: n = 20
Output: Not Happy
 * 
 * */
import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int in	   = sc.nextInt();
		solveHappy(in);
	}
	
	public static void solveHappy(int in)
	{
		String s = in + ""; //Convert INT to STRING
		int sum	 = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			int temp = Integer.parseInt(s.charAt(i)+"");
			sum		+= temp * temp; //Sum of squares
		}
		if(sum == 1)
			System.out.print("Happy");
		else if((sum + "").length()==1) 
			System.out.print("Not Happy");
		else solveHappy(sum);			
	}

}
