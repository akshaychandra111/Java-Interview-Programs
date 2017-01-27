/*
Input	: 1..5,6,7..10,11,12..15 SHOULD PRINT
Output	: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 */

import java.util.*;
public class StringProblem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); sc.close();
		String sa[] = s.split(","); 
		
		for(int i=0;i<sa.length;i++)
		{
				if(sa[i].contains(".."))
				{
					String x="";int j=0;
					while(sa[i].charAt(j)!='.')
					{
						x+=sa[i].charAt(j)+"";
						j++;
					}
					int xx=Integer.parseInt(x);
					j+=2;String y="";
					for(int t=j;t<sa[i].length();t++)
					{
						y+=sa[i].charAt(t);
					}
					int yy = Integer.parseInt(y);
					sa[i]="";
					for(int t=xx;t<=yy;t++)
					{
						sa[i]+=t+" ";
					}
				}
		}
		for(String x:sa)
		{
			System.out.print(x+" ");
		}
	}

}
