/*
 Write a program to print the following pattern.
 Example:
 
 Input	:	5
 Output	:	*
		   * *
		  * * *
		 * * * *
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
 */

import java.util.*;
public class StarsPattern {
	public static void main(String[] args)
	{
		Scanner sc 	 = new Scanner(System.in);
		System.out.println("Enter Input Bro:\n");
		int in		 = sc.nextInt();
		sc.close();
		int rowsDone = 0;
		int count	 = in+(in-1), x = in+1, c = 0;
		
		for(int i=1; i<=(count/2)+1; i++)
		{	
			x--;
			c = 0;
			rowsDone++;
			int t = x;

			System.out.println();
			for(int j=1;j<=count;j++)
			{
				if( j==t ) 
				{ 
					System.out.print("*"); 
					c++; 
					t += 2;
				}
				else
					System.out.print(" ");
				
				if( c==i ) 
					break;
			}		
		}
		for(int i=rowsDone+1; i<=count; i++)
		{
			x++;
			c = 0;
			int t = x;
			System.out.println();
			for(int j=1; j<=count; j++)
			{
				if(j == t)
				{
					System.out.print("*"); 
					c++; 
					t+=2;
				}
				else 
					System.out.print(" ");
				
				if(c == in*2-i) 
					break; //To limit the printing of stars for that particular row
			}
		}
		/*
3
2 4
1 3 5
2 4
3

	   
		  *  
		 * *
		* * *
		 * *
		  *
4
3 5
2 4 6
1 3 5 7
2 4 6
3 5
4		 
		 *
	 	* *
	   * * *
	  * * * *
	   * * *
		* *
		 *
		
		*/
	}
}
