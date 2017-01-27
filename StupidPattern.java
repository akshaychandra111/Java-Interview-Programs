/*
Write a program to print the following pattern.
Sample Input:4
Output:
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4

Sample Input:6
Output: 
1
2 3 2
3 4 5 4 3
4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
6 7 8 9 10 11 10 9 8 7 6

*/
import java.util.Scanner;


public class StupidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int count=1;
		for(int i=1;i<=in;i++)
		{
			count=i;
			int temp = count;
			for(int j=1;j<=i;j++)
			{
				System.out.print(count++ + " ");
			}
			int t2=count-2;
			while(t2!=0 && t2!=temp-1)
			{
				System.out.print(t2-- + " ");
			}
			
			System.out.println();
		}
	

	}

}
