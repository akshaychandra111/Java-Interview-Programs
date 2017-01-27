//GENERATES ALL POSSIBLE ANAGRAMS FOR A GIVEN STRING

import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		permutation(sc.next());
		sc.close();
	}
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) 
	    	System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}
