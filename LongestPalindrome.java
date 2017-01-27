//Given a string, find the longest palindrome substring.

//BRUTE FORCE METHOD
import java.util.*;

public class LongestPalindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); sc.close();
		String l=""; String pal="",inpal="";
		int max = 0,inmax=0;
	
		for(int j=0;j<s.length();j++)
			{
				for(int i=j;i<s.length();i++)
				{
					l+=s.charAt(i)+"";
					if(isPal(l) && l.length()>inmax)
					{
						inpal = l;
						inmax = inpal.length();
					}					
				}
				l="";
				if(inmax>max) {max=inmax; pal=inpal;}
			}
		System.out.println(pal);
	}
	
	static boolean isPal(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		if(s.equals(sb.reverse().toString()))
			return true;
		return false;
	}
}
