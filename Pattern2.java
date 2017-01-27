/*
Write a java program to print the following pattern.
Example:
Input	: 	5
Output	:	1
			2*3
			4*5*6
			7*8*9*10
			11*12*13*14*15
			15*14*13*12*11
			10*9*8*7
			6*5*4
			3*2
			1

Input	:	4
Output	:	1
			2*3
			4*5*6
			7*8*9*10
			10*9*8*7
			6*5*4
			3*2
			1
*/

import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc 	= new Scanner(System.in);
		int in		= sc.nextInt();
		int num		= 1;
		for(int i=1; i<=in; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num++);
				if(j != i)
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=in; i++)
		{
			for(int j=1; j<=in-i+1; j++)
			{
				System.out.print(--num);
				if(j != in-i+1)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
}